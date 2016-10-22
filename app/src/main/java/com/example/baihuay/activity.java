package com.example.baihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ComPuTer on 22/10/2559.
 */

public class activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        Intent intent = getIntent();

        String num = intent.getStringExtra("text");
        String num2  = intent.getStringExtra("huay");
        TextView t1 = (TextView) findViewById(R.id.textView);
        t1.setText(num);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText(num2);
    }
}
