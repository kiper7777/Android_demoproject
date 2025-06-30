package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main20);

        Button newBtn=(Button)findViewById((R.id.newBtn));
        Button galleryBtn=(Button)findViewById((R.id.galleryBtn));

        FrameLayout layout=(FrameLayout) findViewById(R.id.frameLayout_fragment);

        newBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction().add(R.id.frameLayout_fragment,new fragment1()).commit();
                getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_fragment,new FirstFragment()).commit();
            }
        }));

        galleryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_fragment,new SecondFragment()).commit();
            }
        });

    }
}