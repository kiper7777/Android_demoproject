package com.example.demoproject;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity27 extends AppCompatActivity {

    GridView gridView;

    String[] itemNames = {"HTML", "CSS", "JS", "PHP", "JSON", "Android"};
    int[] itemImages = {
            R.drawable.html,
            R.drawable.css,
            R.drawable.js,
            R.drawable.php,
            R.drawable.json,
            R.drawable.android
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        // Инициализация GridView
        gridView = findViewById(R.id.gridView);

        // Устанавливаем адаптер
        GridAdapter adapter = new GridAdapter(this, itemNames, itemImages);
        gridView.setAdapter(adapter);

        // Клик по элементу
        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(MainActivity27.this, "Clicked: " + itemNames[position], Toast.LENGTH_SHORT).show();
        });
    }
}

