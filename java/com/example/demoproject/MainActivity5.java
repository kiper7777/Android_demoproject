package com.example.demoproject;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity5 extends AppCompatActivity {

    EditText firstNameEditText, lastNameEditText, birthDateEditText, countryEditText;
    Button applyButton, clickButton, hitButton;
    TextView messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        birthDateEditText = findViewById(R.id.birthDateEditText);
        countryEditText = findViewById(R.id.countryEditText);
        applyButton = findViewById(R.id.applyButton);
        clickButton=findViewById(R.id.clickButton);
        hitButton=findViewById(R.id.hitButton);
        messageText=findViewById(R.id.messageText);

        birthDateEditText.setOnClickListener(v -> showDatePicker());

        applyButton.setOnClickListener(v -> {
            String firstName = firstNameEditText.getText().toString();
            String lastName = lastNameEditText.getText().toString();
            String birthDate = birthDateEditText.getText().toString();
            String country = countryEditText.getText().toString();

            String result = "Name: " + firstName + " " + lastName +
                    "\nBirth Date: " + birthDate +
                    "\nCountry: " + country;

            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });

        clickButton.setOnClickListener(v -> {
            messageText.setText("Hey, welcome here!");
        });

        hitButton.setOnClickListener(v -> {
            messageText.setText("Congratulations!");
        });

        //Explicit Intent
        ((Button) findViewById(R.id.applyButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);

            }
        });

        //Implicit intent
//        ((Button) findViewById(R.id.clickButton)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent in=new Intent(Intent.ACTION_VIEW);
//                in.setData(Uri.parse("https://login.sae.edu/"));
//                startActivity(in);
//            }
//        });
    }

    private void showDatePicker() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        new DatePickerDialog(this, (view, year1, month1, dayOfMonth) ->
                birthDateEditText.setText(dayOfMonth + "/" + (month1 + 1) + "/" + year1),
                year, month, day).show();
    }
}
