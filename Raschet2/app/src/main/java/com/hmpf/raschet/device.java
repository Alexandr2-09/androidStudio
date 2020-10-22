package com.hmpf.raschet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class device extends AppCompatActivity {

    TextView textView14;
    TextView textView15;
    TextView textView22;
    Button button6;
    int a,b,c,d;
    Button button7;
    EditText editText;
    EditText editText2;
    EditText editText7;
    EditText editText8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView22 = (TextView) findViewById(R.id.textView22);
    }

    public void schet3(View view) {
        if (editText.getEditableText().toString().length() == 0){

            editText8.setText("пожалуйста заполните все числа");
            return;
        }
        if (editText2.getEditableText().toString().length() == 0){

            editText8.setText("пожалуйста заполните все числа");
            return;
        }
        if (editText7.getEditableText().toString().length() == 0){

            editText8.setText("пожалуйста заполните все числа");
            return;
        }

        try {
            a = Integer.parseInt(editText.getText().toString());
            b = Integer.parseInt(editText2.getText().toString());
            c = Integer.parseInt(editText7.getText().toString());
        }
        catch (NumberFormatException e){

            a = 0;
            b = 0;
            c = 0;
        }
        d = a+b+c;
        editText8.setText(""+d+" ru");
        if(a<13000){
        textView14.setText("оборудование будет плохого качества");}
        else if(a<20000){
            textView14.setText("оборудование будет среднего качества"); }
        else {
            textView14.setText("оборудование будет хорошего качества");}
        if(a<27000){
            textView15.setText("аппаратура будет плохого качества");}
        else if(a<53000){
            textView15.setText("аппаратура будет среднего качества"); }
        else {
            textView15.setText("аппаратура будет хорошего качества");}
        if(a<8000){
            textView22.setText("инструменты будут плохого качества");}
        else if(a<15000){
            textView22.setText("инструменты будут среднего качества"); }
        else {
            textView22.setText("инструменты будут хорошего качества");}

    }
    public void back3(View view) {
        Intent intent = new Intent(this,mianMenu.class);
        startActivity(intent);

    }
}
