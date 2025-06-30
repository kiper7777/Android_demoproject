package com.example.demoproject;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
//import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    EditText nameInput;
    Button clickMeButton, submitButton;
    TextView welcomeText;
    Switch SW;
//    LinearLayout viewCon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        nameInput=findViewById(R.id.nameInput);
        clickMeButton=findViewById(R.id.clickMeButton);
        welcomeText=findViewById(R.id.welcomeText);
        submitButton=findViewById(R.id.submitButton);
        SW=findViewById(R.id.SW);

        clickMeButton.setOnClickListener(v -> {
            String name=nameInput.getText().toString().trim();

            Toast.makeText(getApplicationContext(), "Hi welcome to my app", Toast.LENGTH_SHORT).show();

            Toast toast=Toast.makeText(this, "name: "+ name, Toast.LENGTH_SHORT);
            toast.setMargin(60,60);
            toast.show();

            if(!name.isEmpty()){
                welcomeText.setText("Welcome Dear " + name + "!");
            }else {
                welcomeText.setText("Please enter your name");
            }
        });

        // SUBMIT - показывает сообщение "Successfully done"
        submitButton.setOnClickListener(v -> {
            LayoutInflater lf=getLayoutInflater();
            View layout = lf.inflate(R.layout.custom_toast_layout, findViewById(R.id.viewCon));
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
            toast.setView(layout);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        });

    };
    public void getValSwitch(View view) {
        if(SW.isChecked())
        {
            Toast.makeText(this, "WIFI on", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this, "WIFI off", Toast.LENGTH_LONG).show();

    }

};