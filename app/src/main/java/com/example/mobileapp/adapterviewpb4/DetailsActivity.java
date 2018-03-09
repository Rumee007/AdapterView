package com.example.mobileapp.adapterviewpb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int position = getIntent().getIntExtra("position",0);
        String studentName =  Student.generateStudents().get(position).getName();
        //Toast.makeText(this, CountryListGenerator.generateCountries().get(position), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, studentName, Toast.LENGTH_SHORT).show();
    }

    public void goToPictureActivity(View view) {
        startActivity(new Intent(this,CountryPicturesActivity.class));
    }
}
