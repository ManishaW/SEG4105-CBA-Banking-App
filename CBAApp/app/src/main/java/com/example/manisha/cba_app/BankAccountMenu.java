package com.example.manisha.cba_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BankAccountMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account_menu);
    }

    protected void onClickChequing(View view){
        Intent bankCheq = new Intent(this, AccountBalanceActivity.class);
        bankCheq.putExtra("type","CHEQUING");
        bankCheq.putExtra("amount", "$2000.00");
        bankCheq.putExtra("accountNum","#7676543686787" );
        startActivity(bankCheq);
    }
    protected void onClickSaving(View view){
        Intent bankCheq = new Intent(this, AccountBalanceActivity.class);
        bankCheq.putExtra("type","SAVING");
        bankCheq.putExtra("amount", "$5481.94");
        bankCheq.putExtra("accountNum","#7675345345435" );

        startActivity(bankCheq);
    }
    protected void onClickCredit(View view){
        Intent bankCheq = new Intent(this, AccountBalanceActivity.class);
        bankCheq.putExtra("type","CREDIT");
        bankCheq.putExtra("amount", "$450.00");
        bankCheq.putExtra("accountNum","#5876542247980" );

        startActivity(bankCheq);
    }

}
