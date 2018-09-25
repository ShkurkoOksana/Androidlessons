package com.shkurko.oksana.p0201simpleanimation;

import android.app.Activity;
import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int MENU_ALPHA_ID = 1;
    final int MENU_COMBO_ID = 2;
    final int MENU_ROTATE_ID = 3;
    final int MENU_SCALE_ID = 4;
    final int MENU_TRANS_ID = 5;

    TextView tv;

    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_ALPHA_ID, 0, "alpha");
        menu.add(0, MENU_COMBO_ID, 0, "combo");
        menu.add(0, MENU_ROTATE_ID, 0, "rotate");
        menu.add(0, MENU_SCALE_ID, 0, "scale");
        menu.add(0, MENU_TRANS_ID, 0, "trans");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_ALPHA_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MENU_COMBO_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
            case MENU_ROTATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MENU_SCALE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MENU_TRANS_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
        }
        tv.startAnimation(anim);

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo menuInfo) {
        switch (view.getId()) {
            case R.id.tv:
                menu.add(0, MENU_ALPHA_ID, 0, "alpha");
                menu.add(0, MENU_COMBO_ID, 0, "combo");
                menu.add(0, MENU_ROTATE_ID, 0, "rotate");
                menu.add(0, MENU_SCALE_ID, 0, "scale");
                menu.add(0, MENU_TRANS_ID, 0, "trans");
                break;
        }
        super.onCreateContextMenu(menu, view, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_ALPHA_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MENU_COMBO_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
            case MENU_ROTATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MENU_SCALE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MENU_TRANS_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
        }
        tv.startAnimation(anim);

        return super.onContextItemSelected(item);
    }
}
