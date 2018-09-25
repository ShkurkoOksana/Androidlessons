package com.shkurko.oksana.p0081viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("New text in TextView");

        Button myBytton = (Button) findViewById(R.id.myButton);
        myBytton.setText("My button");
        myBytton.setEnabled(false);

        CheckBox myCheckBox = (CheckBox) findViewById(R.id.myCheckBox);
        myCheckBox.setChecked(true);
    }
}
