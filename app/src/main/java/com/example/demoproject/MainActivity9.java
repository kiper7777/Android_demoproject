package com.example.demoproject;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {

    EditText username, fullName, email, password;
    CheckBox termsCheckbox;
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        username = findViewById(R.id.username);
        fullName = findViewById(R.id.fullName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        termsCheckbox = findViewById(R.id.termsCheckbox);
        signUpButton = findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(v -> {
            if (!termsCheckbox.isChecked()) {
                Toast.makeText(this, "Please agree to the terms", Toast.LENGTH_SHORT).show();
                return;
            }

            String user = username.getText().toString();
            String name = fullName.getText().toString();
            String mail = email.getText().toString();
            String pass = password.getText().toString();

            // Здесь можно добавить проверку и отправку данных
            Toast.makeText(this, "Registered:\n" + user, Toast.LENGTH_SHORT).show();
        });
    }
}