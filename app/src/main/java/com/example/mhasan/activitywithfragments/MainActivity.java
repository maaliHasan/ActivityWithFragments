package com.example.mhasan.activitywithfragments;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LauncherFragment launcherFragment = new LauncherFragment();
        fragmentTransaction.add(R.id.FragmentsContent, launcherFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
