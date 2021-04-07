package com.example.listview;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

class SingerAdapter extends BaseAdapter {


    ArrayList<SingerItem> items = new <SingerItem>ArrayList();

    public int getCount() {
        return items.size();
    }
    public void addItem(SingerItem item){
        items.add(item);
    }


    public Object getItem(int position) {
        return items.get(position);
    }


    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        SingerItemView  view = new SingerItemView(parent.getContext());
        SingerItem item = items.get(position);
        view.setName(item.getName());
        view.setMobile(item.getMobile());
        return view;
    }




}

