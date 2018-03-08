package com.example.mobileapp.adapterviewpb4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mobile App on 2/9/2018.
 */

public class StudentAdapter extends ArrayAdapter<Student> {
    private Context context;
    private List<Student>students;
    private int count = 0;
    public StudentAdapter(@NonNull Context context, List<Student>students) {
        super(context, R.layout.row_item, students);
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_item,parent,false);

        // Find the r id
        ImageView stIV = convertView.findViewById(R.id.stImage);
        TextView stNameTV = convertView.findViewById(R.id.stName);
        TextView stAgeTV = convertView.findViewById(R.id.stAge);
        // get position by name
        stIV.setImageResource(students.get(position).getImage());
        stNameTV.setText(students.get(position).getName());
        stAgeTV.setText(String.valueOf(students.get(position).getName()));
        count++;
        Log.e("student", "getView: "+count);

        return convertView;

    }
}
