package com.example.manisha.cba_app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BillInfoTab extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String strtext = getArguments().getString("sentence");

        View rootView = inflater.inflate(R.layout.bill_info, container, false);


        Button back = (Button) rootView.findViewById(R.id.button12);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoBack();
            }
        });

        TextView schedText = (TextView) rootView.findViewById(R.id.change);
        schedText.setText(strtext);

        return rootView;
    }

    void GoBack(){
        Intent myIntent = new Intent(getActivity(), ViewBillsActivity.class);
        startActivity(myIntent);
    }
}
