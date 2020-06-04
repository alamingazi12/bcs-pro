package com.example.bcspro;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = new TextView(getApplicationContext());
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        tv.setLayoutParams(lp);
        tv.setText("BCS Pro");
                tv.setTextSize(20);
        tv.setTextColor(Color.parseColor("#FFFFFF"));
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/PlayfairDisplay-Black.otf");
        tv.setTypeface(tf);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(tv);
        Log.d("method","onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("method","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("method","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("method","Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("method","onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("method","Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("method","stop");
    }
}