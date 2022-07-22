package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class youtube extends AppCompatActivity {
private WebView you;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);


        you=findViewById(R.id.ytlastId);

        WebSettings webSettings= you.getSettings();
        webSettings.setJavaScriptEnabled(true);
        you.setWebViewClient(new WebViewClient());
        you.loadUrl("https://www.youtube.com/channel/UC81X5g3Z_AU6wwRQAzaGTnA");



    }

    @Override
    public void onBackPressed() {
        if(you.canGoBack())
        {
            you.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
}