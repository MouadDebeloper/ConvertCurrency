package com.developer.mouad.convertcurrency;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Handler hHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            hHandler.postDelayed(new Runnable() {
                                 @Override
                                 public void run() {
                                     Intent i = new Intent(getApplicationContext(),ConvertActivity.class);
                                     startActivity(i);
                                 }
                             }
                , 3000);

            }catch (Exception e){
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
            }
        }


}
