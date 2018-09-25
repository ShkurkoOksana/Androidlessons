package com.shkurko.oksana.p0211twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnActTwo;
    Button btnActThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActTwo:
                Intent intent2 = new Intent(this, Main2Activity.class);
                startActivity(intent2);
                break;
            case R.id.btnActThree:
                Intent intent3 = new Intent(this, Main4Activity.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}
