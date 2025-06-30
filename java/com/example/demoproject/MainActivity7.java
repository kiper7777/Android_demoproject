package com.example.demoproject;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    Button myButton;
    Handler handler = new Handler();
    private static final int DELAY_MILLIS = 5000; // 5 секунд

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(v -> {
            // Меняем текст и отключаем кнопку
            myButton.setEnabled(false);
            myButton.setText("DISABLED");

            // Анимация прозрачности
            Animation fadeOut = new AlphaAnimation(1, 0.3f);
            fadeOut.setDuration(500);
            fadeOut.setFillAfter(true);
            myButton.startAnimation(fadeOut);

            // Возврат в исходное состояние через 5 секунд
            handler.postDelayed(() -> {
                myButton.setEnabled(true);
                myButton.setText("CLICK");

                Animation fadeIn = new AlphaAnimation(0.3f, 1);
                fadeIn.setDuration(500);
                fadeIn.setFillAfter(true);
                myButton.startAnimation(fadeIn);

            }, DELAY_MILLIS);
        });
    }
}


