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

public class MainActivity19 extends AppCompatActivity {
    FrameLayout fragmentContainer;
    Button btnOp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main19);

        Button btnOp1=(Button) findViewById(R.id.btnOp1);
        Button btnOp2=(Button) findViewById(R.id.btnOp2);
        Button btnOp3=(Button) findViewById(R.id.btnOp3);

        FrameLayout layout=(FrameLayout) findViewById(R.id.fragmentContainer);

        btnOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,new FragmentOp1()).commit();
            }
        });

        btnOp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,new FragmentOp2()).commit();
            }
        });

        btnOp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,new FragmentOp3()).commit();
            }
        });
    }}

        // Первый запуск
//        switchFragment(new FragmentOp1(), R.drawable.frame_border_red, 0);

        // Обработчики нажатий
//        buttons[0].setOnClickListener(v -> switchFragment(new FragmentOp1(), R.drawable.frame_border_red, 0));
//        buttons[1].setOnClickListener(v -> switchFragment(new FragmentOp2(), R.drawable.frame_border_blue, 1));
//        buttons[2].setOnClickListener(v -> switchFragment(new FragmentOp3(), R.drawable.frame_border_red, 2));
//        buttons[3].setOnClickListener(v -> switchFragment(new FragmentOp4(), R.drawable.frame_border_blue, 3));
//        buttons[4].setOnClickListener(v -> switchFragment(new FragmentOp5(), R.drawable.frame_border_blue, 4));
//    }

//    private void switchFragment(FragmentOp1 fragment, int borderDrawable, int activeIndex) {
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragmentContainer, fragment)
//                .commit();
//
//        fragmentContainer.setBackgroundResource(borderDrawable);

        // Обновить стили кнопок
//        for (int i = 0; i < buttons.length; i++) {
//            if (i == activeIndex) {
//                buttons[i].setBackgroundColor(Color.parseColor("#FF6666")); // Активный
//            } else {
//                buttons[i].setBackgroundColor(Color.WHITE);
//            }
//        }
//    }
//}
