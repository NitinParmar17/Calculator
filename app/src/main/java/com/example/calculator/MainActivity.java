package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnDot,btnEql,btnClear,btnfact;
    EditText status;
    float res1,res2;
    float fact;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEql = findViewById(R.id.btnEql);
        btnDot = findViewById(R.id.btnDot);
        btnClear = findViewById(R.id.btnClear);
        status = findViewById(R.id.status);
   //     btnfact = findViewById(R.id.btnfact);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(status.getText()+".");
            }
        });
   /*     btnfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res1 = Float.parseFloat(status.getText()+"");
                fact=1;
                for(float i=res1;i>=0;i--)
                {
                    fact = fact*i;
                }
                status.setText(fact+"");
            }
        });  */
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(status==null)
               {
                   status.setText("");
               }
               else
               {
                   res1 = Float.parseFloat(status.getText()+"");
                   Add = true;
                   status.setText(null);
               }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status==null)
                {
                    status.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(status.getText()+"");
                    Sub = true;
                    status.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status==null)
                {
                    status.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(status.getText()+"");
                    Mul = true;
                    status.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status==null)
                {
                    status.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(status.getText()+"");
                    Div = true;
                    status.setText(null);
                }
            }
        });
        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2 = Float.parseFloat(status.getText()+"");
                if(Add==true)
                {
                    status.setText(res1+res2+"");
                    Add = false;
                }
                if(Sub==true)
                {
                    status.setText((res1-res2+""));
                    Sub = false;
                }
                if(Mul==true)
                {
                    status.setText(res1*res2+"");
                    Mul = false;
                }
                if(Div==true)
                {
                    status.setText(res1/res2+"");
                    Div = false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setText(null);
            }
        });
    }
}