package com.dicoding.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    String usernameFix="";
    String passwordFix="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void reg(View v){
        Intent intent=new Intent(Register.this, Login.class);
        startActivity(intent);
    }
    public void check(View v){
        EditText ed=(EditText) findViewById(R.id.username);
        EditText pw=(EditText) findViewById(R.id.password);
//        Toast.makeText(this,"Username na adalah"+ed.toString()+"\nPasswordna"+pw,Toast.LENGTH_SHORT).show();

        if(ed.getText().toString().isEmpty()){
            ed.setError("Field Ini Tidak Boleh Kosong");
        }else if(pw.getText().toString().trim().isEmpty()){
            pw.setError("Filed Ini Tidak Boleh Kosong");
        }else{
            usernameFix=ed.toString();
            passwordFix=pw.toString();
            Intent i=new Intent(Register.this,Login.class);
            startActivity(i);
            finish();
        }
    }
}
