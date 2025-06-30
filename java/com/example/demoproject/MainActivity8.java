package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {

    EditText username, fullName, email, password;
    CheckBox termsCheckbox;
    Button signUpButton;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);

        username = (EditText) findViewById(R.id.editText1);
        fullName = (EditText) findViewById(R.id.editText2);
        email =(EditText)  findViewById(R.id.editText3);
        password =(EditText)  findViewById(R.id.editText4);
        termsCheckbox =(CheckBox) findViewById(R.id.termsCheckbox);
        output =(TextView) findViewById(R.id.output);
        signUpButton =(Button) findViewById(R.id.signUpButton);


        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String name = fullName.getText().toString();
                String mail = email.getText().toString();
                String pass = password.getText().toString();

                output.setText("Your name - " + name +
                        "\nYour username - " + user +
                        "\nYour mail - " + mail +
                        "\nYour pass - " + pass);

                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();

            }
        });

//        signUpButton.setOnClickListener(v -> {
//            if (!termsCheckbox.isChecked()) {
//                Toast.makeText(this, "Please agree to the terms", Toast.LENGTH_SHORT).show();
//                return;
//            }
//
//            String user = username.getText().toString();
//            String name = fullName.getText().toString();
//            String mail = email.getText().toString();
//            String pass = password.getText().toString();
//
//            // Здесь можно добавить проверку и отправку данных
//            Toast.makeText(this, "Registered:\n" + user, Toast.LENGTH_SHORT).show();
//        });
    }

}