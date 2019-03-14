package com.dicoding.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Mengambil data yang dilewatkan melalui Intent
        View username = findViewById(R.id.username);
        View password = findViewById(R.id.password);

    }

    public void login(View v) {
        EditText dd=(EditText)findViewById(R.id.username1);
        EditText pp=(EditText)findViewById(R.id.Password1);
        if(new Register().usernameFix.toString().trim().equals(dd.getText().toString().trim()) && new Register().passwordFix.toString().trim().equals(pp.getText().toString().trim()) ){
            Toast.makeText(this,"Login Sukses",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
            dd.setError("Username Atau Password Salah");
            pp.setError("");
        }
    }
}
