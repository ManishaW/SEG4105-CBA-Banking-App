package com.lucia.cba_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.manisha.cba_app.R;

public class ConfirmBill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_bill);


        Button back = (Button) findViewById(R.id.button13);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoBack();
            }
        });
    }

    void GoBack(){
        Intent myIntent = new Intent(this, ViewBillsActivity.class);
        startActivity(myIntent);
    }

}
