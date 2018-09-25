package com.shkurko.oksana.p0271getintentaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

    public class TimeDateActivity extends AppCompatActivity {

        TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_date);

        Intent intent = getIntent();

        String action = intent.getAction();

        String format = "", textInfo = "";

        if (action.equals("com.shkurko.oksana.intent.action.showtime")) {
            format = "HH:mm:ss";
            textInfo = "Time: ";
        } else if (action.equals("com.shkurko.oksana.intent.action.showdate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String info = sdf.format(new Date(System.currentTimeMillis()));

        tv = (TextView) findViewById(R.id.tv);
        tv.setText(textInfo + info);

    }
}
