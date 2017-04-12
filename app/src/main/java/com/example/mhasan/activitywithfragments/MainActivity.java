package com.example.mhasan.activitywithfragments;

import android.graphics.Typeface;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);// retrieve a reference to actionbar
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LauncherFragment launcherFragment = new LauncherFragment();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.add(R.id.FragmentsContent, launcherFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
    @Override
    public void onBackPressed() {
        int fragments = getSupportFragmentManager().getBackStackEntryCount();
        Log.d("fragments",String.valueOf(fragments));
        if (fragments == 1) {
            finish();
        }
        super.onBackPressed();
    }

    /*
    @Override
    public boolean onSupportNavigateUp() {
        getSupportFragmentManager().popBackStack();
        int fragments = getSupportFragmentManager().getBackStackEntryCount();
        Log.d("fragments",String.valueOf(fragments));
        if (fragments == 1) {
            finish();
        }
        return true;
    }*/


}
