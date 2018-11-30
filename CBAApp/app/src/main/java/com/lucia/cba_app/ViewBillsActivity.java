package com.lucia.cba_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.manisha.cba_app.R;

public class ViewBillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bills);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

       Button cadBill = (Button) findViewById(R.id.button2);
       cadBill.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              GoToPayBillActivity();
            }
        });

        Button usaBill = (Button) findViewById(R.id.button3);
        usaBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToPayBillActivity();
            }
        });

        LinearLayout scheduledButtonsLayout = (LinearLayout)findViewById(R.id.scheduled);

        for(int i=0; i < scheduledButtonsLayout.getChildCount();i++){
            View child = scheduledButtonsLayout.getChildAt(i);

            child.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    ViewBillActivity();
                }
            });
        }

    }

    void GoToPayBillActivity(){
        Intent myIntent = new Intent(this, PayBill.class);
        startActivity(myIntent);
    }

    void ViewBillActivity(){

        Intent myIntent = new Intent(this, SelectedBill.class);
        startActivity(myIntent);
    }


}
