package com.sample.rojesharunkumar.activitysample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    // Button variables
    private Button mButton,mFinishAndGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Addes XML desing in java code
        setContentView(R.layout.activity_main);

        // First Method in activity life cycle to be called
        Toast.makeText(this, "On Create method of Activity A is called", Toast.LENGTH_SHORT).show();

        mButton = (Button) findViewById(R.id.btn_click);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Observe the Activity life cycle method calls
                gotoActivityB();
            }
        });

        mFinishAndGo = (Button) findViewById(R.id.btn_click_finish);
        mFinishAndGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finishes the current activity and goes to next activity
                finish();
                gotoActivityB();
            }
        });
    }

    private void gotoActivityB() {
        Intent mIntent = new Intent(this,ActivityB.class);
        startActivity(mIntent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start method of Activity A is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Activity is currently in Running state where user is interacting with the app
        Toast.makeText(this, "On Resume method of Activity A  is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        // Activity is still visible but not interacting with the user like dialog is opened or notification has arrivied
        super.onPause();
        Toast.makeText(this, "On Pause method of Activity A is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop method of Activity A is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy method of Activity A is called", Toast.LENGTH_SHORT).show();
    }
}
