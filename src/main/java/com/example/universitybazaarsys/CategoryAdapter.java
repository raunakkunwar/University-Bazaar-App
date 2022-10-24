package com.example.universitybazaarsys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CategoryAdapter extends BaseAdapter {

    private Context context;
    public CategoryAdapter(Context ctx) {

        context = ctx;
    }

    @Override
    public int getCount() {
        return SalesPage.categoryImages.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.single_category_item, null);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        imageView.setImageResource(SalesPage.categoryImages[position]);

        return convertView;
    }
}
