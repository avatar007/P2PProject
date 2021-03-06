package com.studio.p2pproject.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2017/3/16.
 */
public class NoScrollViewPager extends ViewPager {
    public NoScrollViewPager(Context context) {
        super(context);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;//不拦截子类的滑动事件
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {//不处理触摸事件
        return true;
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);//切换页面时去除平滑效果
    }
}
