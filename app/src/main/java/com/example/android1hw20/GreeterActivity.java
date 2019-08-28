package com.example.android1hw20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GreeterActivity extends AppCompatActivity {

    TextView numberField1;   // поле для ввода числа
    TextView numberField2;   // поле для ввода числа
    Button plus;
    Button minus;
    Button divide;
    Button multiply;
    float sum;
    int numF1;
    int numF2;
    String num1;
    String num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeter);
        numberField1 = findViewById(R.id.textView2);
        numberField2 = findViewById(R.id.textView3);
        plus = findViewById(R.id.buttonPlus);
        minus = findViewById(R.id.buttonMinus);
        divide = findViewById(R.id.buttonDivide);
        multiply = findViewById(R.id.buttonMultiply);

        Intent intent = getIntent();
      num1 = intent.getStringExtra("KEY");
        numberField1.setText(num1);
      num2 = intent.getStringExtra("KEY2");
        numberField2.setText(num2);




        numF1 = Integer.parseInt(num1);
        numF2 = Integer.parseInt(num2);

//        number1 = numberField1.getText().toString();
//        number2 = numberField2.getText().toString();

//        Intent intent2 = new Intent(GreeterActivity.this, LastActivity.class);
//        intent.putExtra("KEY", number11);
//        intent.putExtra("KEY2", number21);
//        startActivity(intent2);

    }

    public void onOperationClick(View view) {
        Intent intent2 = new Intent(GreeterActivity.this, LastActivity.class);

        switch (view.getId()) {
            case R.id.buttonPlus:
                sum=numF1+numF2;
                intent2.putExtra("result", sum);
                //numberField.setText(sum);
                break;

            case R.id.buttonMinus:
                sum=numF1-numF2;
                intent2.putExtra("result", sum);

                //numberField.setText(sum);
                break;

            case R.id.buttonDivide:
                sum=numF1/numF2;
                intent2.putExtra("result", sum);

                //numberField.setText(sum);
                break;

            case R.id.buttonMultiply:
                sum=numF1*numF2;
                intent2.putExtra("result", sum);

                //numberField.setText(sum);
                break;

        }
        startActivity(intent2);
    }
}