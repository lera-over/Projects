package com.example.TrafficLight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout backgroundColor;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundColor = findViewById(R.id.background);
    }

    /**
     * Метод красной кнопки;
     * При нажатии цвет фона меняется на красный
     */
    public void onRedButtonClick(View view) {
        backgroundColor.setBackgroundColor(getResources().getColor(R.color.red));
    }

    /**
     * Метод желтой кнопки;
     * При нажатии цвет фона меняется на желтый
     */
    public void onYellowButtonClick(View view) {
        backgroundColor.setBackgroundColor(getResources().getColor(R.color.yellow));
    }

    /**
     * Метод зеленой кнопки;
     * При нажатии цвет фона меняется на зеленый
     */
    public void onGreenButtonClick(View view) {
        backgroundColor.setBackgroundColor(getResources().getColor(R.color.green));
    }

}
