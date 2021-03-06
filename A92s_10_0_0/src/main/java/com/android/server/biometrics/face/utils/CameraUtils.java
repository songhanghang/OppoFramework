package com.android.server.biometrics.face.utils;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.WindowManager;

public class CameraUtils {
    public static final int FOCUS_HEIGHT = 160;
    public static final int FOCUS_WIDTH = 160;

    public static int clamp(int x, int min, int max) {
        if (x > max) {
            return max;
        }
        if (x < min) {
            return min;
        }
        return x;
    }

    public static void rectFToRect(RectF rectF, Rect rect) {
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
    }

    public static int getDisplayRotation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 90;
        }
        if (rotation == 1) {
            return 0;
        }
        if (rotation == 2) {
            return 270;
        }
        if (rotation != 3) {
            return 90;
        }
        return 180;
    }
}
