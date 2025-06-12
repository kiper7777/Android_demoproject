package com.example.demoproject;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity12 extends AppCompatActivity {

    EditText fullName, mobile, email, password, confirmPassword, experience;
    RadioGroup genderGroup;
    CheckBox javaCB, phpCB, pythonCB, nodejsCB;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        fullName = findViewById(R.id.fullName);
        mobile = findViewById(R.id.mobile);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        experience = findViewById(R.id.experience);
        genderGroup = findViewById(R.id.genderGroup);

        javaCB = findViewById(R.id.javaCB);
        phpCB = findViewById(R.id.phpCB);
        pythonCB = findViewById(R.id.pythonCB);
        nodejsCB = findViewById(R.id.nodejsCB);

        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(v -> {
            String name = fullName.getText().toString();
            String phone = mobile.getText().toString();
            String mail = email.getText().toString();
            String pass = password.getText().toString();
            String confirm = confirmPassword.getText().toString();
            String exp = experience.getText().toString();

            int selectedGenderId = genderGroup.getCheckedRadioButtonId();
            RadioButton selectedGender = findViewById(selectedGenderId);
            String gender = selectedGender != null ? selectedGender.getText().toString() : "Not selected";

            StringBuilder skills = new StringBuilder();
            if (javaCB.isChecked()) skills.append("Java ");
            if (phpCB.isChecked()) skills.append("PHP ");
            if (pythonCB.isChecked()) skills.append("Python ");
            if (nodejsCB.isChecked()) skills.append("Nodejs ");

            if (!pass.equals(confirm)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            String result = "Name: " + name + "\nPhone: " + phone + "\nEmail: " + mail +
                    "\nGender: " + gender + "\nSkills: " + skills.toString() +
                    "\nExperience: " + exp + " years";

            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }
}
