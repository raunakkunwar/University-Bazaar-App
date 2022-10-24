package com.example.universitybazaarsys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class SalesPage extends AppCompatActivity {

    private GridView gridView;
    public static int categoryImages[] = {R.drawable.iphone12, R.drawable.iphone1};
    public static String categoryNames[] = {"iphone12", "iphone 11"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_page);


        gridView = (GridView) findViewById(R.id.gridView);
        CategoryAdapter adapter = new CategoryAdapter(this);
        gridView.setAdapter(adapter);

    }
}