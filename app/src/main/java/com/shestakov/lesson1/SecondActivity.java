package com.shestakov.lesson1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Counter counter;
    private TextView textCounter1;
    private TextView textCounter2;
    private TextView textCounter3;


    private static final String TAG = "SecondActivity";
    private static final String COUNTER_PARAM = "COUNTER_PARAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate");

        counter = new Counter();

        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2);
        textCounter3 = findViewById(R.id.textView3);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.incrementCounter2();
                textCounter2.setText(String.format(Locale.getDefault(), "[%d]", counter.getCounter2()));
            }
        });
       /* findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3++;
                textCounter3.setText(String.format(Locale.getDefault(),"[%d]",counter3));
            }
        });*/
        findViewById(R.id.button3).setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
        outState.putSerializable(COUNTER_PARAM, counter);

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
        counter = (Counter) savedInstanceState.getSerializable(COUNTER_PARAM);
        textCounter1.setText(String.format(Locale.getDefault(),"[%d]",counter.getCounter1()));
        textCounter2.setText(String.format(Locale.getDefault(),"[%d]",counter.getCounter2()));
        textCounter3.setText(String.format(Locale.getDefault(),"[%d]",counter.getCounter3()));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void button_onClick(View view) {
        counter.getCounter1();
        textCounter1.setText(String.format(Locale.getDefault(), "[%d]", counter.getCounter1()));//форматировнаие строк
        // textCounter1.setText(String.valueOf(counter));
    }

    @Override
    public void onClick(View v) {
        counter.incrementCounter3();
        textCounter3.setText(String.format(Locale.getDefault(), "[%d]", counter.getCounter3()));
    }
}
