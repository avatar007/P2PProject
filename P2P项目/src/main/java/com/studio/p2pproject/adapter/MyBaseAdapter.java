package com.studio.p2pproject.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * 作者: 某某某 于 2017/5/3 11:04
 * 概述:
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private List<T> data;

    public MyBaseAdapter(List<T> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public T getItem(int position) {
        return data.get(position);
    }


    //也可用重写这两个方法去实现加载更多的逻辑
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        MyViewHolder holder = null;
        if (convertView == null){
            holder = getHolder();
        }else {
            holder = (MyViewHolder) convertView.getTag();
        }

        return holder.getView();
    }

    //有子类去重写holder
    public abstract MyViewHolder getHolder();
}