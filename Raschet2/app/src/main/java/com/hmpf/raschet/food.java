package com.hmpf.raschet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class food extends AppCompatActivity {

    int a,b,c,d;
    Button button4;
    Button button8;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        button4 = (Button) findViewById(R.id.button4);
        button8 = (Button) findViewById(R.id.button8);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);

    }

    public void schet(View view) {
        if (editText3.getEditableText().toString().length() == 0){

            editText5.setText("пожалуйста заполните все числа");
            return;
        }
        if (editText4.getEditableText().toString().length() == 0){

            editText5.setText("пожалуйста заполните все числа");
            return;
        }
        if (editText6.getEditableText().toString().length() == 0){

            editText5.setText("пожалуйста заполните все числа");
            return;
        }

        try {
            a = Integer.parseInt(editText3.getText().toString());
            b = Integer.parseInt(editText4.getText().toString());
            d = Integer.parseInt(editText6.getText().toString());
        }
        catch (NumberFormatException e){

            a = 0;
            b = 0;
            d = 0;
        }
        a=a*500;
        b=b*300;
        d=d*1000;
        c = a+b+d;
        editText5.setText(""+c+" ru");

    }
    public void back(View view) {
        Intent intent = new Intent(this,mianMenu.class);
        startActivity(intent);

    }
}
