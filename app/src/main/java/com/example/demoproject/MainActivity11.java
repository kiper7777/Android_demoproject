package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity11 extends AppCompatActivity {
    ListView lv;
    Spinner sp_view;
    AutoCompleteTextView acTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main11);

        lv=findViewById(R.id.lv);
        sp_view=findViewById(R.id.sp_view);
        acTextView=findViewById(R.id.acTextView);

        ArrayList<String> arrName=new ArrayList<>();
        ArrayList<String> lan=new ArrayList<>();

        arrName.add("John");
        arrName.add("Tom");
        arrName.add("Bob");
        arrName.add("Archie");
        arrName.add("Emily");
        arrName.add("Aly");
        arrName.add("Clair");
        arrName.add("Jim");
        arrName.add("Jam");

        lan.add("Java");
        lan.add("PHP");
        lan.add("Python");
        lan.add("C");

        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item,lan);
        sp_view.setAdapter(ad);

        ArrayAdapter aadp=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrName);
        acTextView.setAdapter(aadp);
        acTextView.setThreshold(1);

        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrName);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity11.this, "You have clicked list item", Toast.LENGTH_SHORT).show();

                if(position==0)
                {
//                    String item=(String)lv.getItemAtPosition(position);
                    String item=arrName.get(position);
                    Toast.makeText(MainActivity11.this, "You have clicked 1st item"+ item, Toast.LENGTH_SHORT).show();
                }

                if(position==1)
                {
                    Toast.makeText(MainActivity11.this, "You have clicked 2st item", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}