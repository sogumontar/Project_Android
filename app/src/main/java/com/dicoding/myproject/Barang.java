package com.dicoding.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Barang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);
    }
    public void pin(View v){
        Intent i=new Intent(Barang.this,Detail.class);
        startActivity(i);
        finish();
    }
}
