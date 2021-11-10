package com.example.unifiedinvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView result2;
    String Num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        result2 = (TextView)findViewById(R.id.result2);
        Intent intent =this.getIntent();
        String Money = intent.getStringExtra("Money");
        Num = intent.getStringExtra("Num");
        result2.setText("中獎金額："+Money);
    }

    public void back(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity.class);
        startActivity(intent);
        MainActivity3.this.finish();
    }

    public void backnum(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity2.class);
        intent.putExtra("Num",Num);
        startActivity(intent);
        MainActivity3.this.finish();
    }
}