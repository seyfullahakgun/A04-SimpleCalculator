package com.seyf.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.seyf.simplecalculator.R.id.textResult;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.textNumber1);
        number2 = findViewById(R.id.textNumber2);
        result = findViewById(R.id.textResult);
    }
    public void add(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Lütfen Bir Sayı Giriniz!");
        }else {
            int entry1 = Integer.parseInt(number1.getText().toString());
            int entry2 = Integer.parseInt(number2.getText().toString());
            int finalResult = entry1 + entry2;
            result.setText("Result: " + finalResult);
        }

    }
    public void deduct(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Lütfen Bir Sayı Giriniz!");
        }else {
            int entry1 = Integer.parseInt(number1.getText().toString());
            int entry2 = Integer.parseInt(number2.getText().toString());
            int finalResult = entry1 - entry2;
            result.setText("Result: " + finalResult);
        }
    }
    public void multi(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Lütfen Bir Sayı Giriniz!");
        }else {
            int entry1 = Integer.parseInt(number1.getText().toString());
            int entry2 = Integer.parseInt(number2.getText().toString());
            int finalResult = entry1 * entry2;
            result.setText("Result: " + finalResult);
        }
    }
    public void divide(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Lütfen Bir Sayı Giriniz!");
        }else {
            int entry1 = Integer.parseInt(number1.getText().toString());
            int entry2 = Integer.parseInt(number2.getText().toString());
            int finalResult = entry1 / entry2;
            result.setText("Result: " + finalResult);
        }
    }
}

