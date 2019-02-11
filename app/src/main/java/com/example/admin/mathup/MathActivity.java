package com.example.admin.mathup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MathActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void MathupClick()
    {
        EditText n1 = (EditText) findViewById(R.id.N1);
        EditText n2 = (EditText) findViewById(R.id.N2);
        EditText ans = (EditText) findViewById(R.id.Ans);
        int num1 , num2 , num3;
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        num3 = num1+num2;
        ans.setText(String.valueOf(num3));
    }

    @Override
    public void onClick(View v) {
        MathupClick();


    }

}
