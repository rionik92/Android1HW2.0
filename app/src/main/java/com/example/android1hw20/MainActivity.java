package com.example.android1hw20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberField;   // поле для ввода числа
    EditText numberField2;   // поле для ввода числа
    Double operand = null;  // операнд операции
    String lastOperation = "="; // последняя операция
    Button saveButton;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button dot;
    String number1;
    String number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField = findViewById(R.id.numberField);
        numberField2 = findViewById(R.id.numberField2);
        saveButton = findViewById(R.id.save_button);
        zero = findViewById(R.id.buttonZero);
        one = findViewById(R.id.buttonOne);
        two = findViewById(R.id.buttonTwo);
        three = findViewById(R.id.buttonThree);
        four = findViewById(R.id.buttonFour);
        five = findViewById(R.id.buttonFive);
        six = findViewById(R.id.buttonSix);
        seven = findViewById(R.id.buttonSeven);
        eight = findViewById(R.id.buttonEight);
        nine = findViewById(R.id.buttonNine);
        dot = findViewById(R.id.buttonDot);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            number1 = numberField.getText().toString();
             number2 = numberField2.getText().toString();

                Intent intent = new Intent(MainActivity.this, GreeterActivity.class);
                intent.putExtra("KEY", number1);
                intent.putExtra("KEY2", number2);
                startActivity(intent);
            }

        });

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.buttonZero:
                numberField.setText("0");
                break;
            case 1:
                findViewById(R.id.buttonOne);
                numberField.setText("1");
                break;
            case 2:
                findViewById(R.id.buttonTwo);
                numberField.setText("2");
                break;
            case 3:
                findViewById(R.id.buttonThree);
                numberField.setText("3");
                break;
            case 4:
                findViewById(R.id.buttonFour);
                numberField.setText("4");
                break;
            case 5:
                findViewById(R.id.buttonFive);
                numberField.setText("5");
                break;
            case 6:
                findViewById(R.id.buttonSix);
                numberField.setText("6");
                break;
            case 7:
                findViewById(R.id.buttonSeven);
                numberField.setText("7");
                break;
            case 8:
                findViewById(R.id.buttonEight);
                numberField.setText("8");
                break;
            case 9:
                findViewById(R.id.buttonNine);
                numberField.setText("9");
                break;
            case 10:
                findViewById(R.id.buttonDot);
                numberField.setText(".");
                break;

        }


    }
}