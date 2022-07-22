package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class onlineEarn extends AppCompatActivity {
    private WebView webViewh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_earn);

        webViewh=findViewById(R.id.ytbuttonId);

        WebSettings webSettings= webViewh.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewh.setWebViewClient(new WebViewClient());
        webViewh.loadUrl("https://sites.google.com/view/highsoftwaretechnology/home");




    }

    @Override
    public void onBackPressed() {
        if(webViewh.canGoBack())
        {
            webViewh.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
            }


