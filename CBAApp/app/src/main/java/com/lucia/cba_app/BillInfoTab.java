package com.lucia.cba_app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.manisha.cba_app.R;

import org.w3c.dom.Text;

public class BillInfoTab extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String strtext = getArguments().getString("sentence");

        View rootView = inflater.inflate(R.layout.bill_info, container, false);

        TextView schedText = (TextView) rootView.findViewById(R.id.change);
        schedText.setText(strtext);

        return rootView;
    }
}
