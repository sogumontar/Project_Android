package com.dicoding.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onStart(){
        super.onStart();
        SplashScreen ss=new SplashScreen();

        ImageView image= (ImageView) findViewById(R.id.imageView);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation1);


    }
//    public void blink(View v){
//        ImageView image= (ImageView) findViewById(R.id.imageView);
//        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
//        image.startAnimation(animation1);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);

    }
}
