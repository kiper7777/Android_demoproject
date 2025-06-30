package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity25 extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button nextBtn,prevBtn;
    int[] image_arr={R.drawable.ic_facebook,R.drawable.ic_google,R.drawable.ic_linkedin,R.drawable.ic_yahoo};
    int image_index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main25);

        imageSwitcher=(ImageSwitcher) findViewById(R.id.imageSwitcher);
        nextBtn=(Button) findViewById(R.id.nextBtn);
        prevBtn=(Button) findViewById(R.id.prevBtn);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);

                return imageView;
            }
        });

        imageSwitcher.setImageResource(image_arr[image_index]);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_index++;
                if(image_index==image_arr.length)
                {
                    image_index=0;
                }
                imageSwitcher.setImageResource(image_arr[image_index]);
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_index--;
                if(image_index<0)
                {
                    image_index=image_arr.length-1;
                }
                imageSwitcher.setImageResource(image_arr[image_index]);
            }
        });

    }
}