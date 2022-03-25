package com.example.mmustwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile[] arraylist= {
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
                new profile("Mary", "image name", "Hey"),
        };
        String[] sample = {"Damora", "Machel"};


        ListView profileList = findViewById(R.id.profile_list);

        profileList.setAdapter(new adapter(getApplicationContext(), arraylist));

    }
}