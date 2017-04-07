package com.jorgesys.imagebuttonswitchimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setImageResource(R.drawable.btnoff); //Initial state: off!
        imageButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    imageButton.setImageResource(R.drawable.btnoff); //turn off!
                    return true;
                }else if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    imageButton.setImageResource(R.drawable.btnon); //turn on!
                    return true;
                }

                return false;
            }
        });
    }
}
