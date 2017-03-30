package edu.uw.activitydemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "clicked");
            }
        });

        Log.v(TAG, "onCreate called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy called");
    }


}
