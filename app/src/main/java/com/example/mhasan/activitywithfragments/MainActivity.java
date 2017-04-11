package com.example.mhasan.activitywithfragments;

import android.graphics.Typeface;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity   {
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=(TextView)findViewById(R.id.title);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/smart watch.ttf");
        title.setTypeface(typeface);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LauncherFragment launcherFragment = new LauncherFragment();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.add(R.id.FragmentsContent, launcherFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();



    }



}
