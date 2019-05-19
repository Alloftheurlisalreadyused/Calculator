package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonc, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttondot, buttonadd, buttonsub, buttoneq, buttonpercent, buttondiv, buttondel, buttonminplus, buttonmulti;
    boolean add, substract, divide, multi, percent;
    float val1, val2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonadd = (Button) findViewById(R.id.add);
        buttonsub = (Button) findViewById(R.id.substract);
        buttonmulti = (Button) findViewById(R.id.multi);
        buttondiv = (Button) findViewById(R.id.div);
        buttoneq = (Button) findViewById(R.id.eq);
        buttonpercent = (Button) findViewById(R.id.percent);
        buttondel = (Button) findViewById(R.id.del);
        buttondot = (Button) findViewById(R.id.dot);
        buttonminplus = (Button) findViewById(R.id.plusmin);
        buttonc = (Button) findViewById(R.id.c);

        String str = (String) textView.getText();
        final int len;
        len = str.length();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText() == "0") {
                    textView.setText("0");
                } else {
                    textView.setText(textView.getText() + "0");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (len<2){
                    textView.setText("0");
                }
                String text=textView.getText().toString();
                if(text.length()>1){
                    String newText=text.substring(0,text.length()-1);
                    textView.setText(newText);
                }
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    add = true;
                    textView.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    substract = true;
                    textView.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    divide = true;
                    textView.setText(null);
                }
            }
        });

        buttonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    multi = true;
                    textView.setText(null);
                }
            }
        });

        buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    percent = true;
                    textView.setText(null);
                }
            }
        });

        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(textView.getText()+"");
                if (add==true) {
                    textView.setText(val1+val2+"");
                    add=false;
                }
                if (substract==true) {
                    textView.setText(val1-val2+"");
                    substract=false;
                }
                if (multi==true) {
                    textView.setText(val1*val2+"");
                    multi=false;
                }
                if (divide==true) {
                    textView.setText(val1/val2+"");
                    divide=false;
                }
                if (percent==true) {
                    float inc=val2-val1;
                    float perinc=inc/val1*100;
                    if(perinc<0){
                        float dec=val1-val2;
                        float perdec=dec/val1*100;
                        textView.setText(perdec+"");
                    }else{
                        textView.setText(perinc+"");
                    }
                    percent=false;
                }
            }
        });
    }
}
