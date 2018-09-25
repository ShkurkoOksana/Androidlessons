package com.shkurko.oksana.p0091onclickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    /* Called when activity first created */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find a view element
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // Create a click handler for button OK
        View.OnClickListener oclbtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка ОK");
            }
        };
        // Assign the handler button OK
        btnOk.setOnClickListener(oclbtnOk);

        // Create a click handler for button Cancel
        View.OnClickListener oclbtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        // Assign the handler button Cancel
        btnCancel.setOnClickListener(oclbtnCancel);


        /* Part for select dish*/

        // Declare a variable
        final TextView dish;
        Button btnBreakfast;
        Button btnLunch;
        final Button btnDinner;

        //Find a view element
        dish = (TextView) findViewById(R.id.dish);
        btnBreakfast = (Button) findViewById(R.id.breakfast);
        btnLunch = (Button) findViewById(R.id.lunch);
        btnDinner = (Button) findViewById(R.id.dinner);

        // Create listener for button breakfast
        View.OnClickListener oclBtnBreakfast = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dish.setText("Eggs");
            }
        };

        // Assign the handler for button breakfast
        btnBreakfast.setOnClickListener(oclBtnBreakfast);

        // Create listener for button lunch
        View.OnClickListener oclBtnLunch = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dish.setText("Soup");
            }
        };

        // Assign the handler for button lunch
        btnLunch.setOnClickListener(oclBtnLunch);

        // Create listener for button dinner
        View.OnClickListener oclBtnDinner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dish.setText("Salad");
            }
        };

        // Assign the handler for button Dinner
        btnDinner.setOnClickListener(oclBtnDinner);
    }
}
