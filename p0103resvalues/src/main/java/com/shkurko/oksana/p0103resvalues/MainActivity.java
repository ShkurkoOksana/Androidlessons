package com.shkurko.oksana.p0103resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout llTop;

    LinearLayout llBottom;
    TextView tvButtom;
    Button btnButtom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llTop = (LinearLayout) findViewById(R.id.llTop);

        llTop.setBackgroundResource(R.color.llTopColor);

        llBottom = (LinearLayout) findViewById(R.id.llBottom);
        tvButtom = (TextView) findViewById(R.id.tvBottom);
        btnButtom = (Button) findViewById(R.id.btnBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvButtom.setText(R.string.tvBottomText);
        btnButtom.setText(R.string.btnBottomText);
    }
}
