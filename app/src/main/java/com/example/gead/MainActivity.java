package com.example.gead;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView NavigationView;



        NavigationView = findViewById(R.id.NavigationView);
        NavigationView.setOnNavigationItemSelectedListener(this);

        NavigationView.setSelectedItemId(R.id.fact);




    }

    FactFragment fact = new FactFragment();
    MapFragment map = new MapFragment();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {
            case R.id.fact:
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, fact).commit();
                return true;

            case R.id.map:
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, map).commit();
                return true;

        }

        return false;


}

}