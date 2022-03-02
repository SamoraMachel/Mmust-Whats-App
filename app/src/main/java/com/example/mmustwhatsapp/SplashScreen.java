package com.example.mmustwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



       new Handler().postDelayed(
               new Runnable() {
                   @Override
                   public void run() {
                       Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                       startActivity(intent);
                       finish();
                   }
               },
               1000
       );
    }

}