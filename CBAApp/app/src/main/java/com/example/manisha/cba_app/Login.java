package com.example.manisha.cba_app;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Login extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle drawer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        Remove title bar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//        //Remove notification bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}
