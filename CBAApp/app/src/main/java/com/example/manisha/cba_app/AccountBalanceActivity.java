package com.example.manisha.cba_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lucia.cba_app.ViewBillsActivity;

import org.w3c.dom.Text;

public class AccountBalanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_balance);
        TextView title = (TextView)findViewById(R.id.tvAccountType);
        title.setText(this.getIntent().getStringExtra("type"));
        TextView balance = (TextView)findViewById(R.id.moneys);
        balance.setText(this.getIntent().getStringExtra("amount"));
        TextView accountnum = (TextView)findViewById(R.id.accountNum);
        accountnum.setText(this.getIntent().getStringExtra("accountNum"));
    }

    private void goToBills(View view){
        Intent billsIntent = new Intent(this, ViewBillsActivity.class);
        startActivity(billsIntent);
    }
}
