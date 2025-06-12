package com.example.demoproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

//        LayoutInflater lf=getLayoutInflater();
//        View my_layout= lf.inflate(R.layout.layout_custom,(ViewGroup) findViewById(R.id.custom));
//        Toast t=new Toast(getApplicationContext());
//        t.setView(my_layout);
//
//        t.setDuration(LENGTH_LONG);
//        t.show();


    }
}