package com.example.mobileapp.adapterviewpb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView countryListView;
    private StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryListView = findViewById(R.id.countryListView);
        studentAdapter = new StudentAdapter(this, Student.generateStudents());
        countryListView.setAdapter(studentAdapter);

        countryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, CountryListGenerator.generateCountries().get(position), Toast.LENGTH_SHORT).show();
                //String country = CountryListGenerator.generateCountries().get(position);
                startActivity(new Intent(MainActivity.this,DetailsActivity.class)
                .putExtra("position",position));
            }
        });
    }
}
