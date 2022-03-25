package com.example.mmustwhatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class adapter extends ArrayAdapter<profile> {
    public adapter(@NonNull Context context, @NonNull profile[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View inflater = LayoutInflater.from(getContext()).inflate(R.layout.single_item, parent, false);
        profile single_user = getItem(position);

        TextView username = inflater.findViewById(R.id.username);
        TextView lastText = inflater.findViewById(R.id.lastText);

        username.setText(single_user.getName());
        lastText.setText(single_user.getText());
        return inflater;
    }
}
