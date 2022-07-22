package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class facebook extends AppCompatActivity {
private WebView webViewLast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        webViewLast=findViewById(R.id.weblastID);
        WebSettings webSettings= webViewLast.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewLast.setWebViewClient(new WebViewClient());
        webViewLast.loadUrl("https://www.facebook.com/hanifsangkate7");



    }


    @Override
    public void onBackPressed() {
        if(webViewLast.canGoBack())
        {
            webViewLast.goBack();
        }
        else{
            super.onBackPressed();
        }

    }

}