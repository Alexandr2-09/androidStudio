package com.hmpf.raschet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mianMenu extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mian_menu);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

    }

    public void eda(View view) {
        Intent intent = new Intent(this,food.class);
        startActivity(intent);

    }
    public void medka(View view) {
        Intent intent = new Intent(this,medicine.class);
        startActivity(intent);

    }
    public void oborudovanie(View view) {
        Intent intent = new Intent(this,device.class);
        startActivity(intent);

    }
}
