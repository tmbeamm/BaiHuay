package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baihuay.model.Huay;

public class MainActivity extends AppCompatActivity {


    Huay h = new Huay();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,activity.class);
                intent.putExtra("text","เลขท้าย 2 ตัว");
                intent.putExtra("huay",h.getRandomTwoDigits());
                startActivity(intent);
            }
        });
        Button btn2 = (Button)findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,activity.class);
                intent.putExtra("text","เลขท้ายสาม 3 ตัว");
                intent.putExtra("huay",h.getRandomThreeDigits());
                startActivity(intent);
            }
        });
    }
}
