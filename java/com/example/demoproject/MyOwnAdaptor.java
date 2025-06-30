package com.example.demoproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyOwnAdaptor extends BaseAdapter {
    Context context;
    String[] data;
    LayoutInflater inflater;

    public MyOwnAdaptor(Context applicationContext,String[] names){
        this.context=applicationContext;
        this.data=names;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.mycustomlayout,null);
        TextView text=view.findViewById(R.id.myTextView);
        text.setText(data[i]);
        return view;
    }


}
