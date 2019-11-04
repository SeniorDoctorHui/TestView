package com.demo.widget;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.demo.widget.test.RxTest;
import com.demo.widget.test.Timer;

import test.com.flutter_app.SecondActivity;

public class TestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        RxTest.test();
        Timer.INSTANCE.schedlueTimeTask(new Timer.MyTimerTask(),200);
        TextView textView = findViewById(R.id.tv_paint);
        textView.getPaint().setAntiAlias(true);//抗锯齿
        textView.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG); //中划线
        textView.setText("                   ");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
