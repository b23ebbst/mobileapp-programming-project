package com.example.project;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private WebView myWebView;

    public void showInternalWebPage(){
        myWebView.loadUrl("file:///android_asset/About.html");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        myWebView = findViewById(R.id.my_webview);
        myWebView.loadUrl("file:///android_asset/About.html");

        WebView myWebView = findViewById(R.id.my_webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}