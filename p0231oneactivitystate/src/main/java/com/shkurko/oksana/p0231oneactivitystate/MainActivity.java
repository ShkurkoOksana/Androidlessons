package com.shkurko.oksana.p0231oneactivitystate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String TAG = "States";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Main Activity: onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "Main Activity: onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Main Activity: onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "Main Activity: onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "Main Activity: onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Main Activity: onDestroy()");
    }


}
