package com.shestakov.lesson1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
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
        button0 = findViewById(R.id.button_18);
        button1 = findViewById(R.id.button_13);
        button2 = findViewById(R.id.button_14);
        button3 = findViewById(R.id.button15);
        button4 = findViewById(R.id.button_9);
        button5 = findViewById(R.id.button_10);
        button6 = findViewById(R.id.button_11);
        button7 = findViewById(R.id.button_5);
        button8 = findViewById(R.id.button_6);
        button9 = findViewById(R.id.button_7);

        buttonPlus = findViewById(R.id.button_16);
        buttonMinus = findViewById(R.id.button_12);
        buttonMultiplication = findViewById(R.id.button_8);
        buttonDivision = findViewById(R.id.button_4);

        buttonEqual = findViewById(R.id.button_20);
        buttonCline = findViewById(R.id.button_1);
        buttonDot = findViewById(R.id.button_19);

        buttonPercent = findViewById(R.id.button_3);

        et = findViewById(R.id.editTextNumber);

    }

    private void buttonSetOnClickListeners() {

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "1";
                et.setText(number);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "2";
                et.setText(number);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "3";
                et.setText(number);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "4";
                et.setText(number);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "5";
                et.setText(number);
            }
        });
        button6.setOnClickListener(v -> {
            if (isNewOp) et.setText("");
            isNewOp=false;
            String number = et.getText().toString();
            number += "6";
            et.setText(number);
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "7";
                et.setText(number);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "8";
                et.setText(number);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "9";
                et.setText(number);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += "0";
                et.setText(number);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOp) et.setText("");
                isNewOp=false;
                String number = et.getText().toString();
                number += ".";
                et.setText(number);
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOp = true;
                oldNumber = et.getText().toString();
                op = "+";
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOp = true;
                oldNumber = et.getText().toString();
                op = "-";
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOp = true;
                oldNumber = et.getText().toString();
                op = "*";
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOp = true;
                oldNumber = et.getText().toString();
                op = "/";
            }
        });
        buttonCline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("0");
                isNewOp = true;
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no = Double.parseDouble(et.getText().toString()) / 100;
                et.setText(no + "");
                isNewOp = true;
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });
    }

}