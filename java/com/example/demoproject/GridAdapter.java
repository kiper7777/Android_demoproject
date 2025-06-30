package com.example.demoproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] itemNames;
    int[] itemImages;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] itemNames, int[] itemImages) {
        this.context = context;
        this.itemNames = itemNames;
        this.itemImages = itemImages;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemNames.length;
    }

    @Override
    public Object getItem(int position) {
        return itemNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Используем ViewHolder для оптимизации
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
            holder = new ViewHolder();
            holder.iconImage = convertView.findViewById(R.id.iconImage);
            holder.iconText = convertView.findViewById(R.id.iconText);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.iconImage.setImageResource(itemImages[position]);
        holder.iconText.setText(itemNames[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView iconImage;
        TextView iconText;
    }
}
