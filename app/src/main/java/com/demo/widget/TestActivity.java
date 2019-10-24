package com.demo.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.widget.test.RxTest;
import com.demo.widget.test.Timer;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        RxTest.test();
        Timer.INSTANCE.schedlueTimeTask(new Timer.MyTimerTask(),200);
    }
}
