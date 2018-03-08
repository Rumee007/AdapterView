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
        int position = getIntent().getIntExtra("pos",0);

        Toast.makeText(this, CountryListGenerator.generateCountries().get(position), Toast.LENGTH_SHORT).show();
    }

    public void goToPictureActivity(View view) {
        startActivity(new Intent(this,CountryPicturesActivity.class));
    }
}
