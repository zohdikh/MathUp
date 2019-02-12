package com.example.admin.mathup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MathActivity extends AppCompatActivity implements View.OnClickListener {
    String level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        Bundle b = getIntent().getExtras();
        level = b.getString("level");
        EditText n1 = (EditText) findViewById(R.id.N1);
        EditText n2 = (EditText) findViewById(R.id.N2);
        EditText op = (EditText) findViewById(R.id.Op);
        EditText ans = (EditText) findViewById(R.id.Ans);
        int num1 , num2 , num3 ,ope;
        String operation;
        Random r1 = new Random();
        Random r2 = new Random();
       // user picked level 1
        if(level.equals("1"))
        {
            num1 = r1.nextInt(10);
            num2 = r2.nextInt(10);
            ope = r1.nextInt(2);
            if (ope == 1)
                operation = "+";
            else
                operation = "-";
            n1.setText(String.valueOf(num1));
            n2.setText(String.valueOf(num2));
            op.setText(operation.toString());
            operation = op.getText().toString();
        }
        //user picked level 2
        if(level.equals("2"))
        {
            num1 = r1.nextInt(100);
            num2 = r2.nextInt(100);
            ope = r1.nextInt(2);
            if (ope == 1)
                operation = "+";
            else
                operation = "-";
            n1.setText(String.valueOf(num1));
            n2.setText(String.valueOf(num2));
            op.setText(operation.toString());
            operation = op.getText().toString();
        }
        // user picked level 3
        if(level.equals("3"))
        {
            num1 = r1.nextInt(10);
            num2 = r2.nextInt(10);
            ope = r1.nextInt(4);
            if (ope == 1)
                operation = "+";
            else if (ope == 2)
                operation = "-";
            else if (ope == 3)
                operation = "*";
            else
                operation = "/";

            n1.setText(String.valueOf(num1));
            n2.setText(String.valueOf(num2));
            op.setText(operation.toString());
            operation = op.getText().toString();
        }
        //user picked level 4
        if(level.equals("4"))
        {
            num1 = r1.nextInt(100);
            num2 = r2.nextInt(100);
            ope = r1.nextInt(4);
            if (ope == 1)
                operation = "+";
            else if (ope == 2)
                operation = "-";
            else if (ope == 3)
                operation = "*";
            else
                operation = "/";
            n1.setText(String.valueOf(num1));
            n2.setText(String.valueOf(num2));
            op.setText(operation.toString());
            operation = op.getText().toString();
        }
        //user picked level 5
        if(level.equals("5"))
        {
            num1 = r1.nextInt(100);
            num2 = r2.nextInt(100);
            ope = r1.nextInt(4);
            if (ope == 1)
                operation = "+";
            else if (ope == 2)
                operation = "-";
            else if (ope == 3)
                operation = "*";
            else
                operation = "/";
            n1.setText(String.valueOf(num1));
            n2.setText(String.valueOf(num2));
            op.setText(operation.toString());
            operation = op.getText().toString();
        }
        //user picked level 6
        if(level.equals("6"))
        {
            num1 = r1.nextInt(999);
            num2 = r2.nextInt(999);
            ope = r1.nextInt(4);
            if (ope == 1)
                operation = "+";
            else if (ope == 2)
                operation = "-";
            else if (ope == 3)
                operation = "*";
            else
                operation = "/";
            n1.setText(String.valueOf(num1));
            n2.setText(String.valueOf(num2));
            op.setText(operation.toString());
            operation = op.getText().toString();
        }

    }

    public void ClickMath()
    {
        EditText n1 = (EditText) findViewById(R.id.N1);
        EditText n2 = (EditText) findViewById(R.id.N2);
        EditText op = (EditText) findViewById(R.id.Op);
        EditText ans = (EditText) findViewById(R.id.Ans);
        int num1 , num2 , num3 ,ope;
        String operation;
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        num3 = Integer.parseInt(ans.getText().toString());
        operation = op.getText().toString();
        if(operation.equals("+"))
        {
            if(num3 == (num1+num2))
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
            else
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
        }

        if(operation.equals("-"))
        {
            if(num3 == Math.max(num1,num2)-Math.min(num1,num2))
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
            else if(num3== num1-num2)
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
            else
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
        }
        if(operation.equals("*"))
        {
            if(num3 == num1*num2)
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
            else
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
        }
        if(operation.equals("/"))
        {
            if(num3 == num1/num2)
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
            else
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
        }


    }
    public void Start(int x)
    {

    }
    @Override
    public void onClick(View v) {
        ClickMath();


    }
    public void MoveTo(View v){
        finish();
        Intent intent = new Intent(MathActivity.this, MathActivity.class);
        Bundle b = new Bundle();
        b.putString("level",String.valueOf(level));
        intent.putExtras(b);
        startActivity(intent);
    }

}
