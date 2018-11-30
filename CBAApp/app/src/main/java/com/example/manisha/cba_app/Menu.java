package com.example.manisha.cba_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button login = (Button) findViewById(R.id.view_bills_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToBills();
            }
        });
    }


    void GoToBills(){
        Intent myIntent = new Intent(this, ViewBillsActivity.class);
        startActivity(myIntent);
    }

}
