package com.example.simplifyv2.demo1;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Toolbar mTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setTitle(R.string.title_home);
                    return true;
                case R.id.navigation_sport:
                    mTextMessage.setTitle(R.string.title_sport);
                    return true;
                case R.id.navigation_world:
                    mTextMessage.setTitle(R.string.title_world);
                    return true;
                case R.id.navigation_entertainment:
                    mTextMessage.setTitle(R.string.title_entertainment);
                    return true;
                case R.id.navigation_account:
                    mTextMessage.setTitle(R.string.title_account);
                    return true;
            }
            return false;
        }
    };
}
