package com.shestakov.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class SelectTheme extends BaseActivity {
    Button btnApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_theme);

        initThemeChooser();
        btnApply = findViewById(R.id.buttonApply);
        btnApply.setOnClickListener(v -> {
            Intent intent = new Intent(SelectTheme.this, MainActivity.class);
            startActivity(intent);
        });
    }


    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMyStyleOrange),
                MyStyleOrangeCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMyStyleGreen),
                AppThemeGreenCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMyStyleDark),
                AppThemeDarkCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMyStyle),
                AppThemeCodeStyle);
        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(MyStyleOrangeCodeStyle))).setChecked(true);
    }


    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(v -> {
            setAppTheme(codeStyle);
            recreate();
        });
    }


}