package com.lucia.cba_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

import com.example.manisha.cba_app.R;

public class PayBill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bill);

        Spinner dropdownPayee = findViewById(R.id.spinner);
        String[] items = new String[]{"Lucia","Aniela","Manisha"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdownPayee.setAdapter(adapter);

        Spinner dropdownAccount = findViewById(R.id.spinner2);
        String[] items2 = new String[]{"Chequing Account","Savings Account"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdownAccount.setAdapter(adapter2);

        Switch reoccuring = (Switch)findViewById(R.id.switchPB);

        toggleAll(8);

        RadioButtonGroup();

        Button cont = (Button) findViewById(R.id.buttonCont);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToConfirmActivity();
            }
        });

        reoccuring.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position
                if(isChecked){
                    toggleAll(0);
                    togglePay(8);
                    toggleDate(8);
                }else{
                    toggleAll(8);
                }
            }
        });


        Button dateButt = (Button) findViewById(R.id.button8);
        dateButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleDate(0);
                togglePay(8);
            }
        });

        Button payButt = (Button) findViewById(R.id.button10);
        payButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                togglePay(0);
                toggleDate(8);
            }
        });

        Button endButt = (Button) findViewById(R.id.button11);
        endButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                togglePay(8);
                toggleDate(8);
            }
        });
    }

    void toggleAll(int option){

        LinearLayout reoccuringLayout = (LinearLayout)findViewById(R.id.reoccuring);
        LinearLayout l1 = (LinearLayout)findViewById(R.id.l1);
        LinearLayout l2 = (LinearLayout)findViewById(R.id.l2);
        LinearLayout setDate = (LinearLayout)findViewById(R.id.setDate);
        LinearLayout setNum = (LinearLayout)findViewById(R.id.numPayments);

        for(int i=0; i < reoccuringLayout.getChildCount();i++){
            View child = reoccuringLayout.getChildAt(i);
            child.setVisibility(option);
        }

        for(int i=0; i < l1.getChildCount();i++){
            View child = l1.getChildAt(i);
            child.setVisibility(option);
         }

        for(int i=0; i < l2.getChildCount();i++){
            View child = l2.getChildAt(i);
            child.setVisibility(option);
        }

        for(int i=0; i < setDate.getChildCount();i++){
            View child = setDate.getChildAt(i);
            child.setVisibility(option);
        }

        for(int i=0; i < setNum.getChildCount();i++){
            View child = setNum.getChildAt(i);
            child.setVisibility(option);
        }

    }

    void toggleDate(int option) {
        LinearLayout setDate = (LinearLayout)findViewById(R.id.setDate);
        for(int i=0; i < setDate.getChildCount();i++){
            View child = setDate.getChildAt(i);
            child.setVisibility(option);
        }
    }

    void togglePay(int option) {
        LinearLayout setNum = (LinearLayout)findViewById(R.id.numPayments);

        for(int i=0; i < setNum.getChildCount();i++){
            View child = setNum.getChildAt(i);
            child.setVisibility(option);
        }
    }

    void RadioButtonGroup(){
        final RadioButton m_one = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton m_two = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton m_three = (RadioButton) findViewById(R.id.radioButton3);
        final RadioButton m_four = (RadioButton) findViewById(R.id.radioButton4);

        m_one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                m_one.setChecked(true);
                m_two.setChecked(false);
                m_three.setChecked(false);
                m_four.setChecked(false);
            }
        });

        m_two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                m_one.setChecked(false);
                m_two.setChecked(true);
                m_three.setChecked(false);
                m_four.setChecked(false);
            }
        });

        m_three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                m_one.setChecked(false);
                m_two.setChecked(false);
                m_three.setChecked(true);
                m_four.setChecked(false);
            }
        });

        m_four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                m_one.setChecked(false);
                m_two.setChecked(false);
                m_three.setChecked(false);
                m_four.setChecked(true);
            }
        });
    }

    void GoToConfirmActivity(){

        Intent myIntent = new Intent(this, ConfirmBill.class);
        startActivity(myIntent);
    }

    }
