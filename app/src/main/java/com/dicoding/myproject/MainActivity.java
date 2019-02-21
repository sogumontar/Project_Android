package com.dicoding.myproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView batteryLevel;
    private ProgressBar mBatteryLevelProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryLevel = (TextView) findViewById(R.id.batteryLevel);
        mBatteryLevelProgress = (ProgressBar) findViewById(R.id.progressBar);

        this.registerReceiver(this.myBatteryReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
    public void bottomClick(View v){
        Toast.makeText(this,"OFF",Toast.LENGTH_SHORT).show();
        Log.i("info", "OFF");
    }
    public void OnClick(View v){
        Toast.makeText(this,"ON",Toast.LENGTH_SHORT).show();
        Log.i("info", "ON");
    }

    private BroadcastReceiver myBatteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int lvl = intent.getIntExtra("level", 0);
            batteryLevel.setText("Battery anda saat ini : " + String.valueOf(lvl) + "%");
            mBatteryLevelProgress.setProgress(lvl);
            if (lvl == 100) {
                Toast.makeText(context, "Battery Full.", Toast.LENGTH_LONG).show();
            }
        }
    };


    public void test(View view) {
        Intent intent = new Intent(MainActivity.this, TambahBarang.class);
        startActivity(intent);
    }

    public void goTo(View view) {
        Uri uri = Uri.parse("http://cis.del.ac.id");

        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void change(View v) {
        Intent intent = new Intent(MainActivity.this, ContentProvider.class);
        startActivity(intent);
    }

    public void register(View v) {
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }

}
