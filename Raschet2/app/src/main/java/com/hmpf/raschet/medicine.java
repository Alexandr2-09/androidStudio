package com.hmpf.raschet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class medicine extends AppCompatActivity {

    int a,b,c,d;
    Button button5;
    Button button10;
    EditText editText12;
    EditText editText13;
    EditText editText14;
    EditText editText15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        button5 = (Button) findViewById(R.id.button5);
        button10 = (Button) findViewById(R.id.button10);
        editText12 = (EditText) findViewById(R.id.editText12);
        editText13 = (EditText) findViewById(R.id.editText13);
        editText14 = (EditText) findViewById(R.id.editText14);
        editText15 = (EditText) findViewById(R.id.editText15);
    }

    public void schet2(View view) {
        if (editText12.getEditableText().toString().length() == 0){

            editText15.setText("пожалуйста заполните все числа");
            return;
        }
        if (editText13.getEditableText().toString().length() == 0){

            editText15.setText("пожалуйста заполните все числа");
            return;
        }
        if (editText14.getEditableText().toString().length() == 0){

            editText15.setText("пожалуйста заполните все числа");
            return;
        }

        try {
            a = Integer.parseInt(editText12.getText().toString());
            b = Integer.parseInt(editText13.getText().toString());
            c = Integer.parseInt(editText14.getText().toString());
        }
        catch (NumberFormatException e){

            a = 0;
            b = 0;
            c = 0;
        }
        a=a*600;
        b=b*3700;
        c=c*8300;
        d = a+b+c;
        editText15.setText(""+d+" ru");

    }
    public void back2(View view) {
        Intent intent = new Intent(this,mianMenu.class);
        startActivity(intent);

    }
}
