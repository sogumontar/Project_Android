package com.dicoding.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Mengambil data yang dilewatkan melalui Intent
        View name = findViewById(R.id.username);
        System.out.println(name);

    }

    public void check(View v) {
//        final EditText t1= (EditText) findViewById(R.id.username);
        final EditText t2= (EditText) findViewById(R.id.username1);
//        final EditText t3= (EditText) findViewById(R.id.Password);
        final EditText t4= (EditText) findViewById(R.id.Password1);

        if ( t2.getText().equals(t4.getText())) {
            System.out.println("test");
            t2.setError("Login Sukses");
        } else {
            t2.setError("Login Gagal");
        }
    }
}
