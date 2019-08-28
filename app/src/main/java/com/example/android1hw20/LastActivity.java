package com.example.android1hw20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        result = findViewById(R.id.result);
        Intent intent2 = getIntent();
        float sum = intent2.getFloatExtra("result", 0);
//        numberField1.setText(num1);
//        num2 = intent3.getStringExtra("KEY2");
//        numberField2.setText(num2);
        result.setText("RESULT is = " + sum+"");


    }
}
