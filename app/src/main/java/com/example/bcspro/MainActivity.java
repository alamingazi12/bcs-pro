package com.example.bcspro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFontToActionBar();
        setNavigation();
        final NavController navController= Navigation.findNavController(this,R.id.my_nav_host_fragment);
        // NavigationUI.setupActionBarWithNavController(this,Navigation.findNavController(this,R.id.my_nav_host_fragment));
        BottomNavigationView navigationView=findViewById(R.id.bottom_nav);
        //NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){


                    case R.id.home:
                        navController.navigate(R.id.homefragment);
                        break;
                    case R.id.search:
                        navController.navigate(R.id.profilefragment);
                        break;
                    case R.id.account:
                        navController.navigate(R.id.morefragment);
                        break;

                }
                return true;
            }
        });

    }

    private void setNavigation() {
    }

    private void setFontToActionBar() {
        TextView tv = new TextView(MainActivity.this);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        tv.setLayoutParams(lp);
        tv.setText("BCS Pro");
        tv.setTextSize(20);
        tv.setTextColor(Color.parseColor("#FFFFFF"));
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/PlayfairDisplay-Black.otf");
        tv.setTypeface(tf);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(tv);

    }










}