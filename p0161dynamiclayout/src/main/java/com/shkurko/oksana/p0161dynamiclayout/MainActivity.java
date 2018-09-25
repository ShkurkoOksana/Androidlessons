package com.shkurko.oksana.p0161dynamiclayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonOk;
    Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // Create LinearLayout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        setContentView(linearLayout, layoutParams);

        // Create a ViewText
        LinearLayout.LayoutParams lpTextView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lpTextView.gravity = 1;

        textView = new TextView(this);
        textView.setText("Press a button");
        linearLayout.addView(textView, lpTextView);

        // Create a button OK
        LinearLayout.LayoutParams lpButtonOk = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lpButtonOk.gravity = 1;

        buttonOk = new Button(this);
        buttonOk.setText("Ok");
        linearLayout.addView(buttonOk, lpButtonOk);

        View.OnClickListener onClickListenerButtonOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Press the button Ok");
            }
        };

        buttonOk.setOnClickListener(onClickListenerButtonOk);

        // Create a button Cance
        LinearLayout.LayoutParams lpButtonCancel = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lpButtonCancel.gravity = 1;

        buttonCancel = new Button(this);
        buttonCancel.setText("Cancel");
        linearLayout.addView(buttonCancel, lpButtonCancel);

        View.OnClickListener onClickListenerButtonCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Press the button Cancel");
            }
        };

        buttonCancel.setOnClickListener(onClickListenerButtonCancel);
        }
}
