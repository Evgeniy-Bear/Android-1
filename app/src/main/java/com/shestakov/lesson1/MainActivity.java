package com.shestakov.lesson1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {
    private static final String NUMBER_PARAM = "NUMBER_PARAM";
    String oldNumber = "";
    String saveText = "";
    String op = "+";
    EditText et;
    boolean isNewOp = true;
    Button button1, button2, button3, button4;
    Button button5, button6, button7, button8;
    Button button9, button0, buttonMultiplication, buttonDivision;
    Button buttonPlus, buttonMinus, buttonCline;
    Button buttonEqual, buttonDot, buttonPercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        buttonSetOnClickListeners();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        saveText = et.getText().toString();
        outState.putSerializable(NUMBER_PARAM, saveText);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        saveText = (String) savedInstanceState.getSerializable(NUMBER_PARAM);
        et.setText(saveText);
    }

    private void setupUIViews() {
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);

        buttonPlus = findViewById(R.id.button_Plus);
        buttonMinus = findViewById(R.id.button_Minus);
        buttonMultiplication = findViewById(R.id.button_Multiplication);
        buttonDivision = findViewById(R.id.button_Division);

        buttonEqual = findViewById(R.id.button_Equal);
        buttonCline = findViewById(R.id.button_AC);
        buttonDot = findViewById(R.id.button_Dot);

        buttonPercent = findViewById(R.id.button_Percent);

        et = findViewById(R.id.editTextNumber);

    }

    private void buttonSetOnClickListeners() {

        button1.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "1";
            et.setText(number);
        });
        button2.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "2";
            et.setText(number);
        });
        button3.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "3";
            et.setText(number);
        });
        button4.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "4";
            et.setText(number);
        });
        button5.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "5";
            et.setText(number);
        });
        button6.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "6";
            et.setText(number);
        });
        button7.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "7";
            et.setText(number);
        });
        button8.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "8";
            et.setText(number);
        });
        button9.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "9";
            et.setText(number);
        });
        button0.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += "0";
            et.setText(number);
        });
        buttonDot.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp = false;
            String number = et.getText().toString();
            number += ".";
            et.setText(number);
        });
        buttonPlus.setOnClickListener(v -> {
            isNewOp = true;
            oldNumber = et.getText().toString();
            op = "+";
        });
        buttonMinus.setOnClickListener(v -> {
            isNewOp = true;
            oldNumber = et.getText().toString();
            op = "-";
        });
        buttonMultiplication.setOnClickListener(v -> {
            isNewOp = true;
            oldNumber = et.getText().toString();
            op = "*";
        });
        buttonDivision.setOnClickListener(v -> {
            isNewOp = true;
            oldNumber = et.getText().toString();
            op = "/";
        });
        buttonCline.setOnClickListener(v -> {
            et.setText("0");
            isNewOp = true;
        });
        buttonPercent.setOnClickListener(v -> {
            double no = Double.parseDouble(et.getText().toString()) / 100;
            et.setText(no + "");
            isNewOp = true;
        });


        buttonEqual.setOnClickListener(v -> {
            String newNumber = et.getText().toString();
            double result = 0.0;
            switch (op) {
                case "+":
                    result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                    break;
                case "-":
                    result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                    break;
                case "/":
                    result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                    break;
                case "*":
                    result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                    break;
            }
            et.setText(result + "");
        });
    }

}