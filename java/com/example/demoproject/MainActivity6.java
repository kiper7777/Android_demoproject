package com.example.demoproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v ->
                Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show());

        button2.setOnClickListener(v ->
                Toast.makeText(this, "Button 2 Clicked", Toast.LENGTH_SHORT).show());

        button3.setOnClickListener(v ->
                Toast.makeText(this, "Button 3 Clicked", Toast.LENGTH_SHORT).show());
    }
}
