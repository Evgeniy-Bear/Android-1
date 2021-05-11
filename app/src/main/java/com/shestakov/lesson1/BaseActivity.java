package com.shestakov.lesson1;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    private static final String NameSharedPreference = "APP_THEME_COLOR";
    private static final String AppTheme = "APP_THEME";
    protected static final int MyStyleOrangeCodeStyle = 0;
    protected static final int AppThemeGreenCodeStyle = 1;
    protected static final int AppThemeCodeStyle = 2;
    protected static final int AppThemeDarkCodeStyle = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.MyStyleOrange));
    }

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    protected int getCodeStyle(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        return sharedPref.getInt(AppTheme, codeStyle);
    }


    protected void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(AppTheme, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle) {
            case AppThemeCodeStyle:
                return R.style.AppTheme;
            case AppThemeGreenCodeStyle:
                return R.style.AppThemeGreen;
            case AppThemeDarkCodeStyle:
                return R.style.AppThemeDark;
            default:
                return R.style.MyStyleOrange;
        }
    }
}
