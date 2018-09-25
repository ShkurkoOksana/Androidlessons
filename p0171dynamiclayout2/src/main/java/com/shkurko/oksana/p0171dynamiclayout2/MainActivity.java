package com.shkurko.oksana.p0171dynamiclayout2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;
    Button btnNew;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = findViewById(R.id.llMain);
        rgGravity = findViewById(R.id.rgGravity);
        etName = findViewById(R.id.etName);
        btnCreate = findViewById(R.id.btnCreate);
        btnClear = findViewById(R.id.btnClear);

        // Create listener for button Create
        View.OnClickListener oclbtnCreate = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create layoutParams
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wrapContent, wrapContent);

                int btnGravity = Gravity.LEFT;

                switch (view.getId()) {
                    case R.id.btnCreate:
                        switch (rgGravity.getCheckedRadioButtonId()) {
                            case R.id.rbLeft:
                                btnGravity = Gravity.LEFT;
                                break;
                            case R.id.rbCenter:
                                btnGravity = Gravity.CENTER;
                                break;
                            case R.id.rbRight:
                                btnGravity = Gravity.RIGHT;
                                break;
                        }
                        layoutParams.gravity = btnGravity;

                        btnNew = new Button(MainActivity.this);
                        btnNew.setText(etName.getText().toString());
                        llMain.addView(btnNew, layoutParams);
                }
            }
        };

        btnCreate.setOnClickListener(oclbtnCreate);

        // Create listener for button Clear
        View.OnClickListener oclbtnClear = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llMain.removeAllViews();
                Toast.makeText(MainActivity.this, "All delete", Toast.LENGTH_SHORT).show();
            }
        };

        btnClear.setOnClickListener(oclbtnClear);



    }
}
