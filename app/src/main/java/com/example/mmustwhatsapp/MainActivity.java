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
                new profile("Mary",  "image name", "Hey"),
                new profile("Joseph", "image name", "Hey"),
                new profile("Kevin", "image name", "Hey"),
                new profile("Daasha", "image name", "Hey"),
                new profile("Collins", "image name", "Hey"),
                new profile("Brigid", "image name", "Hey"),
                new profile("Josephine", "image name", "Hey"),
                new profile("Terry", "image name", "Hey"),
                new profile("Maxwel", "image name", "Hey"),
                new profile("Joseph", "image name", "Hey"),
                new profile("Mike", "image name", "Hey"),
                new profile("Omar", "image name", "Hey"),
        };


        ListView profileList = findViewById(R.id.profile_list);
        profileList.setAdapter(new adapter(this, arraylist));

    }
}