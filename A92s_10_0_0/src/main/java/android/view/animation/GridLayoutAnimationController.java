package android.view.animation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import com.android.internal.R;
import java.util.Random;

public class GridLayoutAnimationController extends LayoutAnimationController {
    public static final int DIRECTION_BOTTOM_TO_TOP = 2;
    public static final int DIRECTION_HORIZONTAL_MASK = 1;
    public static final int DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int DIRECTION_TOP_TO_BOTTOM = 0;
    public static final int DIRECTION_VERTICAL_MASK = 2;
    public static final int PRIORITY_COLUMN = 1;
    public static final int PRIORITY_NONE = 0;
    public static final int PRIORITY_ROW = 2;
    private float mColumnDelay;
    private int mDirection;
    private int mDirectionPriority;
    private float mRowDelay;

    public static class AnimationParameters extends LayoutAnimationController.AnimationParameters {
        public int column;
        public int columnsCount;
        public int row;
        public int rowsCount;
    }

    public GridLayoutAnimationController(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.GridLayoutAnimation);
        this.mColumnDelay = Animation.Description.parseValue(a.peekValue(0)).value;
        this.mRowDelay = Animation.Description.parseValue(a.peekValue(1)).value;
        this.mDirection = a.getInt(2, 0);
        this.mDirectionPriority = a.getInt(3, 0);
        a.recycle();
    }

    public GridLayoutAnimationController(Animation animation) {
        this(animation, 0.5f, 0.5f);
    }

    public GridLayoutAnimationController(Animation animation, float columnDelay, float rowDelay) {
        super(animation);
        this.mColumnDelay = columnDelay;
        this.mRowDelay = rowDelay;
    }

    public float getColumnDelay() {
        return this.mColumnDelay;
    }

    public void setColumnDelay(float columnDelay) {
        this.mColumnDelay = columnDelay;
    }

    public float getRowDelay() {
        return this.mRowDelay;
    }

    public void setRowDelay(float rowDelay) {
        this.mRowDelay = rowDelay;
    }

    public int getDirection() {
        return this.mDirection;
    }

    public void setDirection(int direction) {
        this.mDirection = direction;
    }

    public int getDirectionPriority() {
        return this.mDirectionPriority;
    }

    public void setDirectionPriority(int directionPriority) {
        this.mDirectionPriority = directionPriority;
    }

    @Override // android.view.animation.LayoutAnimationController
    public boolean willOverlap() {
        return this.mColumnDelay < 1.0f || this.mRowDelay < 1.0f;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.animation.LayoutAnimationController
    public long getDelayForView(View view) {
        float totalDelay;
        long viewDelay;
        AnimationParameters params = (AnimationParameters) view.getLayoutParams().layoutAnimationParameters;
        if (params == null) {
            return 0;
        }
        int column = getTransformedColumnIndex(params);
        int row = getTransformedRowIndex(params);
        int rowsCount = params.rowsCount;
        int columnsCount = params.columnsCount;
        long duration = this.mAnimation.getDuration();
        float columnDelay = this.mColumnDelay * ((float) duration);
        float rowDelay = this.mRowDelay * ((float) duration);
        if (this.mInterpolator == null) {
            this.mInterpolator = new LinearInterpolator();
        }
        int i = this.mDirectionPriority;
        if (i == 1) {
            viewDelay = (long) ((((float) row) * rowDelay) + (((float) (column * rowsCount)) * rowDelay));
            totalDelay = (((float) rowsCount) * rowDelay) + (((float) (columnsCount * rowsCount)) * rowDelay);
        } else if (i != 2) {
            viewDelay = (long) ((((float) column) * columnDelay) + (((float) row) * rowDelay));
            totalDelay = (((float) columnsCount) * columnDelay) + (((float) rowsCount) * rowDelay);
        } else {
            viewDelay = (long) ((((float) column) * columnDelay) + (((float) (row * columnsCount)) * columnDelay));
            totalDelay = (((float) columnsCount) * columnDelay) + (((float) (rowsCount * columnsCount)) * columnDelay);
        }
        return (long) (this.mInterpolator.getInterpolation(((float) viewDelay) / totalDelay) * totalDelay);
    }

    private int getTransformedColumnIndex(AnimationParameters params) {
        int index;
        int order = getOrder();
        if (order == 1) {
            index = (params.columnsCount - 1) - params.column;
        } else if (order != 2) {
            index = params.column;
        } else {
            if (this.mRandomizer == null) {
                this.mRandomizer = new Random();
            }
            index = (int) (((float) params.columnsCount) * this.mRandomizer.nextFloat());
        }
        if ((this.mDirection & 1) == 1) {
            return (params.columnsCount - 1) - index;
        }
        return index;
    }

    private int getTransformedRowIndex(AnimationParameters params) {
        int index;
        int order = getOrder();
        if (order == 1) {
            index = (params.rowsCount - 1) - params.row;
        } else if (order != 2) {
            index = params.row;
        } else {
            if (this.mRandomizer == null) {
                this.mRandomizer = new Random();
            }
            index = (int) (((float) params.rowsCount) * this.mRandomizer.nextFloat());
        }
        if ((this.mDirection & 2) == 2) {
            return (params.rowsCount - 1) - index;
        }
        return index;
    }
}
