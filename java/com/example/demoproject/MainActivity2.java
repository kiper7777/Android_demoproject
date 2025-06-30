package com.example.demoproject;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText phoneInput;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        phoneInput = findViewById(R.id.phoneInput);
        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(view -> {
            String enteredNumber = phoneInput.getText().toString().trim();
            if (!enteredNumber.isEmpty()) {
                showCustomToast(enteredNumber);
            } else {
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void showCustomToast(String number) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.toast_container));
        TextView toastText = layout.findViewById(R.id.toastMessage);
        toastText.setText(number); // показываем введённый номер

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
