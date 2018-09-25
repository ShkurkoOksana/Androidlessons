package com.shkurko.oksana.p0241twoactivitystate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";

    Button btnActTwo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Main Activity: onRestart");
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(TAG, "Main Activity: onRestart");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "Main Activity: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Main Activity: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "Main Activity: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "Main Activity: onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Main Activity: onDestroy");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
