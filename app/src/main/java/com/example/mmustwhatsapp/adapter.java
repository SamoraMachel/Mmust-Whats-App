package com.example.mmustwhatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ListAdapter;

import java.lang.reflect.Array;
import java.util.List;

public class adapter extends ArrayAdapter<profile> {

    public adapter(@NonNull Context context, @NonNull profile[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View root = LayoutInflater.from(getContext()).inflate(R.layout.single_item, parent, false);

        profile user = getItem(position);

        TextView username =  root.findViewById(R.id.username);
        TextView lastText = root.findViewById(R.id.lastText);

        username.setText(user.getName());
        lastText.setText(user.getText());


        return root;
    }
}
