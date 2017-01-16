package com.sample.rojesharunkumar.activitysample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toast.makeText(this, "On Create method of Activity B is called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start method of Activity B is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Activity is currently in Running state where user is interacting with the app
        Toast.makeText(this, "On Resume method of Activity B  is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        // Activity is still visible but not interacting with the user like dialog is opened or notification has arrivied
        super.onPause();
        Toast.makeText(this, "On Pause method of Activity B is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop method of Activity B is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy method of Activity B is called", Toast.LENGTH_SHORT).show();
    }

}
