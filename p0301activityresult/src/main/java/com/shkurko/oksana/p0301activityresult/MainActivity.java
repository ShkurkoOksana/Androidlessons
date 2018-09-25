package com.shkurko.oksana.p0301activityresult;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final int REQUEST_CODE_COLOR = 1;
    final int REQUEST_CODE_ALIG = 2;

    TextView tvText;
    Button btnColor;
    Button btnAlig;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView)findViewById(R.id.tvText);

        btnColor = (Button) findViewById(R.id.btnColor);
        btnColor.setOnClickListener(this);

        btnAlig = (Button) findViewById(R.id.btnAlign);
        btnAlig.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnColor: {
                Intent intentColor = new Intent(this, ColorActivity.class);
                startActivityForResult(intentColor, REQUEST_CODE_COLOR);
            }
            break;
            case R.id.btnAlign: {
                Intent intentAlig = new Intent(this, AligActivity.class);
                startActivityForResult(intentAlig, REQUEST_CODE_ALIG);
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d("myLogs", "requestCode = " + requestCode + ", resultCode = " + resultCode);

        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUEST_CODE_COLOR: {
                    int color = data.getIntExtra("color", Color.WHITE);
                    tvText.setTextColor(color);
                }
                break;
                case REQUEST_CODE_ALIG: {
                    int gravity = data.getIntExtra("alig", Gravity.LEFT);
                    tvText.setGravity(gravity);
                }
                break;
            }
        } else {
            Toast.makeText(this, "Result is wrong", Toast.LENGTH_LONG);
        }
    }
}

