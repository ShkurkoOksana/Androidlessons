package com.shkurko.oksana.p0261intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewDateActivity extends AppCompatActivity {

    TextView tvNewDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_date);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        String newDate = sdf.format(new Date(System.currentTimeMillis()));

        tvNewDate = (TextView) findViewById(R.id.tvNewDate);
        tvNewDate.setText(newDate);
    }
}
