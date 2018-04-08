package com.example.j.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup rg;
    Button btn1;
    Button btn2;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        LL = (LinearLayout) findViewById(R.id.LL);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg.getCheckedRadioButtonId();
    }

    public void yair1(View view) {


        if (rb1.isChecked()) {
            LL.setBackgroundColor(Color.GREEN);
            rg.clearCheck();



        }  if (rb2.isChecked()) {
            LL.setBackgroundColor(Color.BLUE);
            rg.clearCheck();


        }  if (rb3.isChecked()) {
            LL.setBackgroundColor(Color.RED);
            rg.clearCheck();


        }  if (!rb1.isChecked() || !rb2.isChecked() || !rb3.isChecked()) {
            Toast.makeText(this, " please select one of the marks", Toast.LENGTH_LONG).show();
        }

    }

    public void yair2(View view) {

        if (view.getId() == R.id.btn2&&(rb1.isChecked())||(rb2.isChecked())||(rb3.isChecked())) {

            Toast.makeText(this, " please cancel the check", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.btn2&&(!rb1.isChecked())&&(!rb2.isChecked())&&(!rb3.isChecked())) {

            LL.setBackgroundColor(Color.WHITE);

        }


    }
}

























