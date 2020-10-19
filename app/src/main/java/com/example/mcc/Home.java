package com.example.mcc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();




    }
    void logout(){
        SharedPreferences sharedPreferences1=getSharedPreferences("rememberFile",MODE_PRIVATE);
        SharedPreferences.Editor editor2=sharedPreferences1.edit();
        editor2.putString("nid_login","123");
    }
}