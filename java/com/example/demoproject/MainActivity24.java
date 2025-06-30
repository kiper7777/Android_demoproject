package com.example.demoproject;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity24 extends AppCompatActivity {
    ListView lv_contextMenuDemo;
    String[] arr={"John", "Emily", "Bob", "Simon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main24);

        lv_contextMenuDemo=(ListView) findViewById(R.id.lv_contextMenuDemo);

        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, arr);

        lv_contextMenuDemo.setAdapter(adapter);
        registerForContextMenu(lv_contextMenuDemo);
   }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.contextmenudemo,menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }
}