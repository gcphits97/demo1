package com.example.simplifyv2.demo1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WorldActivity extends Fragment {
    private WebView webview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_world, container, false);
        webview = view.findViewById(R.id.webview);
        webview.loadUrl("https://vnexpress.net/rss/the-gioi.rss");
        webview.setWebViewClient(new WebViewClient());
        return view;
    }
}
