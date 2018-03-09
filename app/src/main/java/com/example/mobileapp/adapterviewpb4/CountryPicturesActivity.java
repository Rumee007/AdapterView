package com.example.mobileapp.adapterviewpb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CountryPicturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_pictures);
    }

    public void goToDetailsActivity(View view) {
        startActivity(new Intent(this,DetailsActivity.class));
    }
}
