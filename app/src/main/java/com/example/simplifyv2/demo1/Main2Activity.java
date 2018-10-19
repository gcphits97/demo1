package com.example.simplifyv2.demo1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Toolbar mTextMessage;
    private WebView webview;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setTitle(R.string.title_home);
                    webview.loadUrl("https://vnexpress.net/tin-tuc/thoi-su");
                    webview.setWebViewClient(new WebViewClient());
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextMessage = findViewById(R.id.message);
        webview = findViewById(R.id.webview);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        webview.loadUrl("https://vnexpress.net/tin-tuc/thoi-su");
        webview.setWebViewClient(new WebViewClient());
    }
}
