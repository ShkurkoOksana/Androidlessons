package com.shkurko.oksana.p0261intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDate;
    Button btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime = (Button) findViewById(R.id.btnTime);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDate:
                // Create Activity for Date
                Intent intentDate = new Intent("com.shkurko.oksana.intent.action.showdate");
                startActivity(intentDate);
                break;
            case R.id.btnTime:
                // Create Activity for Time
                Intent intentTime = new Intent("com.shkurko.oksana.intent.action.showtime");
                startActivity(intentTime);
                break;
        }
    }
}
