package com.example.cal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView view1, view2;
    private double firstOperand, secondOperand, res;
    private String op, finalres;
    private Button btn0,  btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnBackspace, btnDivide, btnMultiply, btnMinus, btnPlus, btnPercent, btnDot, btnEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnClear = findViewById(R.id.btnClear);
        btnBackspace = findViewById(R.id.btnBackspace);
        btnPercent = findViewById(R.id.btnPercent);
        btnPlus = findViewById(R.id.btnPlus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(null);
                view2.setText(null);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn0.getText().toString();
                view2.setText(text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn1.getText().toString();
                view2.setText(text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn2.getText().toString();
                view2.setText(text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn3.getText().toString();
                view2.setText(text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn4.getText().toString();
                view2.setText(text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn5.getText().toString();
                view2.setText(text);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn6.getText().toString();
                view2.setText(text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn7.getText().toString();
                view2.setText(text);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn8.getText().toString();
                view2.setText(text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btn9.getText().toString();
                view2.setText(text);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = view2.getText().toString()+btnDot.getText().toString();
                view2.setText(text);
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace;
                if(view2.getText().length()>0)
                {
                    StringBuilder stringBuilder = new StringBuilder(view2.getText());
                    stringBuilder.deleteCharAt(view2.getText().length()-1);
                    backspace = stringBuilder.toString();
                    view2.setText(backspace);
                }
            }
        });

        // code for operators

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                firstOperand = Double.parseDouble((String)view2.getText());
                primary = String.format("%.2f",firstOperand);
                view1.setText(primary);
                view2.setText("");
                op = "%";
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                firstOperand = Double.parseDouble((String)view2.getText());
                primary = String.format("%.2f",firstOperand);
                view1.setText(primary);
                view2.setText("");
                op = "+";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                firstOperand = Double.parseDouble((String)view2.getText());
                primary = String.format("%.2f",firstOperand);
                view1.setText(primary);
                view2.setText("");
                op = "-";
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                firstOperand = Double.parseDouble((String)view2.getText());
                primary = String.format("%.2f",firstOperand);
                view1.setText(primary);
                view2.setText("");
                op = "*";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                firstOperand = Double.parseDouble((String)view2.getText());
                primary = String.format("%.2f",firstOperand);
                view1.setText(primary);
                view2.setText("");
                op = "/";
            }
        });

        //Equal operator

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondOperand = Double.parseDouble((String) view2.getText());
                if(op == "+")
                {
                    res = firstOperand+secondOperand;
                    finalres=String.format("%.2f",res);
                    view2.setText(finalres);
                    view1.setText(null);
                }
                if(op == "-")
                {
                    res = firstOperand-secondOperand;
                    finalres=String.format("%.2f",res);
                    view2.setText(finalres);
                    view1.setText(null);
                }
                if(op == "*")
                {
                    res = firstOperand*secondOperand;
                    finalres=String.format("%.2f",res);
                    view2.setText(finalres);
                    view1.setText(null);
                }
                if(op == "/")
                {
                    res = firstOperand/secondOperand;
                    finalres=String.format("%.2f",res);
                    view2.setText(finalres);
                    view1.setText(null);
                }
                if(op == "%")
                {
                    res = firstOperand%secondOperand;
                    finalres=String.format("%.2f",res);
                    view2.setText(finalres);
                    view1.setText(null);
                }
            }
        });


    }
}