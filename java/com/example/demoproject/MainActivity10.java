package com.example.demoproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        RadioButton rd_male, rd_female;
//        CheckBox cb_java, cb_python;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
//          //Explicit Intent
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(), MainActivity4.class);
//                startActivity(intent);
//
//            }
//        });




         //Implicit intent
        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse("https://login.sae.edu/"));
                startActivity(in);
            }
        });

    }
}

