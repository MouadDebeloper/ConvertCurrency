package com.developer.mouad.convertcurrency;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ConvertActivity extends AppCompatActivity {

    Button btnConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        Spinner spcurrencyfrom = (Spinner) findViewById(R.id.spcurrencyfrom);
        Spinner spcurrencyto = (Spinner) findViewById(R.id.spcurrencyto);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.currency_array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spcurrencyfrom.setAdapter(adapter);
        spcurrencyto.setAdapter(adapter);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnConvert.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                if(isConnected()){
                    Toast.makeText(getApplicationContext(),"Connected to internet",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Not Connected to internet",Toast.LENGTH_LONG).show();
                }
            }
        });

    }







        public boolean isConnected(){
            ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected())
                return true;
            else
                return false;
        }




}


//<>