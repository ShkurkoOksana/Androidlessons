package com.shkurko.oksana.p0301activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AligActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLeft;
    Button btnCenter;
    Button btnRight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alig);

        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnLeft.setOnClickListener(this);

        btnCenter = (Button) findViewById(R.id.btnCenter);
        btnCenter.setOnClickListener(this);

        btnRight = (Button) findViewById(R.id.btnRight);
        btnRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.btnLeft: {
                intent.putExtra("alig", Gravity.LEFT);
                setResult(RESULT_OK, intent);
                finish();
            }
            break;
            case R.id.btnCenter: {
                intent.putExtra("alig", Gravity.CENTER);
                setResult(RESULT_OK, intent);
                finish();
            }
            break;
            case R.id.btnRight: {
                intent.putExtra("alig", Gravity.RIGHT);
                setResult(RESULT_OK, intent);
                finish();
            }
            break;
        }
    }
}
