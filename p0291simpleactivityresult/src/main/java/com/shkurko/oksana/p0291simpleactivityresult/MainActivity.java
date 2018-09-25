package com.shkurko.oksana.p0291simpleactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnName;
    TextView tvName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnName = (Button) findViewById(R.id.btnName);
        btnName.setOnClickListener(this);

        tvName = (TextView) findViewById(R.id.tvName);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, NameActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent dataIntent) {
        if (dataIntent == null) {return;}
        String name = dataIntent.getStringExtra("name");
        tvName.setText("Your name is " + name);
    }

}
