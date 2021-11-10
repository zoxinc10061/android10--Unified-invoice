package com.example.unifiedinvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button JanFeb,MarApr,MayJun,JulAug,SepOct,NovDec,reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JanFeb = (Button)findViewById(R.id.JanFeb);
        MarApr = (Button)findViewById(R.id.MarApr);
        MayJun = (Button)findViewById(R.id.MayJun);
        JulAug = (Button)findViewById(R.id.JulAug);
        SepOct = (Button)findViewById(R.id.SepOct);
        NovDec = (Button)findViewById(R.id.NovDec);
        reward = (Button)findViewById(R.id.reward);
        reward.setEnabled(false);
    }
    int i = 0,num = 0;
    public void janfeb(View view) {
        if(i==0){
            MarApr.setEnabled(false);
            MayJun.setEnabled(false);
            JulAug.setEnabled(false);
            SepOct.setEnabled(false);
            NovDec.setEnabled(false);
            reward.setEnabled(true);
            i = 1;
            num=12;
        }
        else{
            MarApr.setEnabled(true);
            MayJun.setEnabled(true);
            JulAug.setEnabled(true);
            SepOct.setEnabled(true);
            NovDec.setEnabled(true);
            reward.setEnabled(false);
            i=0;
            num=0;
        }
    }

    public void marapr(View view) {
        if(i==0){
            JanFeb.setEnabled(false);
            MayJun.setEnabled(false);
            JulAug.setEnabled(false);
            SepOct.setEnabled(false);
            NovDec.setEnabled(false);
            reward.setEnabled(true);
            i = 1;
            num=34;
        }
        else{
            JanFeb.setEnabled(true);
            MayJun.setEnabled(true);
            JulAug.setEnabled(true);
            SepOct.setEnabled(true);
            NovDec.setEnabled(true);
            reward.setEnabled(false);
            i=0;
            num=0;
        }
    }

    public void mayjun(View view) {
        if(i==0){
            JanFeb.setEnabled(false);
            MarApr.setEnabled(false);
            JulAug.setEnabled(false);
            SepOct.setEnabled(false);
            NovDec.setEnabled(false);
            reward.setEnabled(true);
            i = 1;
            num=56;
        }
        else{
            JanFeb.setEnabled(true);
            MarApr.setEnabled(true);
            JulAug.setEnabled(true);
            SepOct.setEnabled(true);
            NovDec.setEnabled(true);
            reward.setEnabled(false);
            i=0;
            num=0;
        }
    }

    public void julaug(View view) {
        if(i==0){
            JanFeb.setEnabled(false);
            MarApr.setEnabled(false);
            MayJun.setEnabled(false);
            SepOct.setEnabled(false);
            NovDec.setEnabled(false);
            reward.setEnabled(true);
            i = 1;
            num=78;
        }
        else{
            JanFeb.setEnabled(true);
            MarApr.setEnabled(true);
            MayJun.setEnabled(true);
            SepOct.setEnabled(true);
            NovDec.setEnabled(true);
            reward.setEnabled(false);
            i=0;
            num=0;
        }
    }

    public void sepoct(View view) {
        if(i==0){
            JanFeb.setEnabled(false);
            MarApr.setEnabled(false);
            MayJun.setEnabled(false);
            JulAug.setEnabled(false);
            NovDec.setEnabled(false);
            reward.setEnabled(true);
            i = 1;
            num=910;
        }
        else{
            JanFeb.setEnabled(true);
            MarApr.setEnabled(true);
            MayJun.setEnabled(true);
            JulAug.setEnabled(true);
            NovDec.setEnabled(true);
            reward.setEnabled(false);
            i=0;
            num=0;
        }
    }

    public void novdec(View view) {
        if(i==0){
            JanFeb.setEnabled(false);
            MarApr.setEnabled(false);
            MayJun.setEnabled(false);
            JulAug.setEnabled(false);
            SepOct.setEnabled(false);
            reward.setEnabled(true);
            i = 1;
            num=1112;
        }
        else{
            JanFeb.setEnabled(true);
            MarApr.setEnabled(true);
            MayJun.setEnabled(true);
            JulAug.setEnabled(true);
            SepOct.setEnabled(true);
            reward.setEnabled(false);
            i=0;
            num=0;
        }
    }

    public void start(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        switch (num){
            case 12:
                intent.putExtra("Num","JanFeb");
                break;
            case 34:
                intent.putExtra("Num","MarApr");
                break;
            case 56:
                intent.putExtra("Num","MayJun");
                break;
            case 78:
                intent.putExtra("Num","JulAug");
                break;
            case 910:
                intent.putExtra("Num","SepOct");
                break;
            case 1112:
                intent.putExtra("Num","NovDec");
                break;
        }
        startActivity(intent);
        MainActivity.this.finish();
    }
}