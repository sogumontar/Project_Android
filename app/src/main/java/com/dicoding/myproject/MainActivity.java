package com.dicoding.myproject;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings: {
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
            }
            case R.id.test: {
                Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
            }
            default: {
                Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void tesst(View v) {
        Button s = (Button) findViewById(R.id.off);
        new AlertDialog.Builder(MainActivity.this).setTitle("Are You Serious?").setMessage("Yes")
                .setCancelable(false).setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }).show();

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void bottomClick(View v) {
        Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        Log.i("info", "OFF");
    }

    public void OnClick(View v) {
        Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
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

    public void galery(View v) {
        Intent i = new Intent(MainActivity.this, Galery.class);
        startActivity(i);
        finish();
    }

}
