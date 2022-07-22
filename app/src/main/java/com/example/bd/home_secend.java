package com.example.bd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.navigation.NavigationView;

public class home_secend extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
private Button button1;
    private Button button2;
    private Button button3;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_secend);




        button1=findViewById(R.id.programmingstartId);
        button2=findViewById(R.id.programminghelpId);
         button3=findViewById(R.id.IncomevedioID);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home_secend.this,programming_start.class);
                startActivity(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home_secend.this,programming_help.class);
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home_secend.this,onlineEarn.class);
           startActivity(intent);
            }
        });



        NavigationView navigationView=findViewById(R.id.navigationid);
        navigationView.setNavigationItemSelectedListener(this);
         drawerLayout=findViewById(R.id.drawerId);
         toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if(item.getItemId()==R.id.homeMenuId)
        {
            intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.aboutMenuId)
        {
            intent=new Intent(this,aboutActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.contactMenuId)
        {
            intent=new Intent(this,contactActivity.class);
            startActivity(intent);
        }
        return false;
    }


}