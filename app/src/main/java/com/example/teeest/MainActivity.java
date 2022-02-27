package com.example.teeest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zero, one, two, three, four, five, six, seven, eight, nine, plus, sub, mul, div, equal, mod , c;
    TextView txt;
    double num1 , num2;
    String op ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        plus = (Button) findViewById(R.id.plus);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        equal = (Button) findViewById(R.id.equal);
        mod = (Button) findViewById(R.id.mod);
        c = (Button) findViewById(R.id.c);
        txt = (TextView) findViewById(R.id.txt);

        zero.setOnClickListener(view -> txt.append("0"));
        one.setOnClickListener(view -> txt.append("1"));
        two.setOnClickListener(view -> txt.append("2"));
        three.setOnClickListener(view -> txt.append("3"));
        four.setOnClickListener(view -> txt.append("4"));
        five.setOnClickListener(view -> txt.append("5"));
        six.setOnClickListener(view -> txt.append("6"));
        seven.setOnClickListener(view -> txt.append("7"));
        eight.setOnClickListener(view -> txt.append("8"));
        nine.setOnClickListener(view -> txt.append("9"));
        mod.setOnClickListener(view -> txt.append("."));

        plus.setOnClickListener(view ->
        {
             num1 = Double.parseDouble(txt.getText().toString());
            txt.setText("");
            op = "+";
        });
        sub.setOnClickListener(view ->
        {
            num1 = Double.parseDouble(txt.getText().toString());
            txt.setText("");
            op = "-";
        });
        mul.setOnClickListener(view ->
        {
            num1 = Double.parseDouble(txt.getText().toString());
            txt.setText("");
            op = "*";
        });
        div.setOnClickListener(view ->
        {
            num1 = Double.parseDouble(txt.getText().toString());
            txt.setText("");
            op = "/";
        });
        equal.setOnClickListener(view ->
        {
            switch (op)
            {
                case "+" :
                    num2 = Double.parseDouble(txt.getText().toString());
                    txt.setText(Double.toString((num1+num2)));
                    break;

                case "-" :
                    num2 = Double.parseDouble(txt.getText().toString());
                    txt.setText(Double.toString((num1-num2)));
                    break;

                case "*" :
                    num2 = Double.parseDouble(txt.getText().toString());
                    txt.setText(Double.toString((num1*num2)));
                    break;

                case "/" :
                    num2 = Double.parseDouble(txt.getText().toString());
                    txt.setText(Double.toString((num1/num2)));
                    break;

            }
        });
        c.setOnClickListener(view -> txt.setText(""));
    }
}