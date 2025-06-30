package com.example.demoproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView textViewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewDetail = findViewById(R.id.textViewDetail);

        // Получаем имя элемента из Intent
        String itemName = getIntent().getStringExtra("item_name");

        textViewDetail.setText("Selected item: " + itemName);
    }
}
