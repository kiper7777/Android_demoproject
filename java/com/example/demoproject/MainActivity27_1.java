package com.example.demoproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity27_1 extends AppCompatActivity {

    ListView listView;
    String[] languages = {"c", "c++", "Java", "Python", "HTML", "CSS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27_1);

        // Инициализация ListView
        listView = findViewById(R.id.listView);

        // Стандартный адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                languages
        );

        listView.setAdapter(adapter);

        // Клик по элементу
//        listView.setOnItemClickListener((adapterView, view, position, l) -> {
//            String itemName = languages[position];
//            Toast.makeText(MainActivity27_1.this,
//                    "Position is " + position + " Item name is " + itemName,
//                    Toast.LENGTH_SHORT).show();
//        });

        // Клик: переходим на DetailActivity
        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            String itemName = languages[position];

            Intent intent=new Intent(MainActivity27_1.this, DetailActivity.class);
            intent.putExtra("item_name",itemName);
            startActivity(intent);
        });
    }
}
