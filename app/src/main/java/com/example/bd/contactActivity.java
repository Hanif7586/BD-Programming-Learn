package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class contactActivity extends AppCompatActivity {
private Button buttonlast;
private  Button buttonyou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        buttonlast=findViewById(R.id.fb);

        buttonyou=findViewById(R.id.yt);

        buttonlast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(contactActivity.this,facebook.class);
                startActivity(intent);
            }
        });



        buttonyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(contactActivity.this,youtube.class);
                startActivity(intent);
            }
        });





    }
}