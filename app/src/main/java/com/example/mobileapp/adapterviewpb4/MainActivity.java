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
    private ListView countryLV;
    private StudentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryLV = findViewById(R.id.countryListView);
        adapter = new StudentAdapter(this,CountryListGenerator.StudentListGenerator.generateStudents());
        countryLV.setAdapter(adapter);

        countryLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, CountryListGenerator.generateCountries().get(position), Toast.LENGTH_SHORT).show();
                //String country = CountryListGenerator.generateCountries().get(position);
                startActivity(new Intent(MainActivity.this,DetailsActivity.class)
                .putExtra("pos",position));
            }
        });
    }
}
