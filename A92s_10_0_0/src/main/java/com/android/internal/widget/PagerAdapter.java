package com.android.internal.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private DataSetObservable mObservable = new DataSetObservable();

    public abstract int getCount();

    public abstract boolean isViewFromObject(View view, Object obj);

    public void startUpdate(ViewGroup container) {
        startUpdate((View) container);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.internal.widget.PagerAdapter.instantiateItem(android.view.View, int):java.lang.Object
     arg types: [android.view.ViewGroup, int]
     candidates:
      com.android.internal.widget.PagerAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object
      com.android.internal.widget.PagerAdapter.instantiateItem(android.view.View, int):java.lang.Object */
    public Object instantiateItem(ViewGroup container, int position) {
        return instantiateItem((View) container, position);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.internal.widget.PagerAdapter.destroyItem(android.view.View, int, java.lang.Object):void
     arg types: [android.view.ViewGroup, int, java.lang.Object]
     candidates:
      com.android.internal.widget.PagerAdapter.destroyItem(android.view.ViewGroup, int, java.lang.Object):void
      com.android.internal.widget.PagerAdapter.destroyItem(android.view.View, int, java.lang.Object):void */
    public void destroyItem(ViewGroup container, int position, Object object) {
        destroyItem((View) container, position, object);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.internal.widget.PagerAdapter.setPrimaryItem(android.view.View, int, java.lang.Object):void
     arg types: [android.view.ViewGroup, int, java.lang.Object]
     candidates:
      com.android.internal.widget.PagerAdapter.setPrimaryItem(android.view.ViewGroup, int, java.lang.Object):void
      com.android.internal.widget.PagerAdapter.setPrimaryItem(android.view.View, int, java.lang.Object):void */
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        setPrimaryItem((View) container, position, object);
    }

    public void finishUpdate(ViewGroup container) {
        finishUpdate((View) container);
    }

    public void startUpdate(View container) {
    }

    public Object instantiateItem(View container, int position) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void destroyItem(View container, int position, Object object) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void setPrimaryItem(View container, int position, Object object) {
    }

    public void finishUpdate(View container) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    public int getItemPosition(Object object) {
        return -1;
    }

    public void notifyDataSetChanged() {
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver observer) {
        this.mObservable.registerObserver(observer);
    }

    public void unregisterDataSetObserver(DataSetObserver observer) {
        this.mObservable.unregisterObserver(observer);
    }

    public CharSequence getPageTitle(int position) {
        return null;
    }

    public float getPageWidth(int position) {
        return 1.0f;
    }
}
