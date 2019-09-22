package com.my.admin.mathup;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Test extends AppCompatActivity {
    int number1,number2,number3,ope,ans,i=0;
    String op;
    int currAn;
    Random rn = new Random() ;
    private String mQuestions []= new String[10];
    private int mAnswers [] = new int[10];
    Button btn;
    TextView que;
    EditText ansr;

    // Make a quick 10 question quiz to check starting level
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        openDialog();

        btn = (Button) findViewById(R.id.btngo);
        que=(TextView) findViewById(R.id.question);
        ansr=(EditText) findViewById(R.id.answer);
       // 10 Questions to be answered.
        number1 = rn.nextInt(10);
        number2 = rn.nextInt(10);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
                op="-";
        mQuestions[0]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[0]=number1+number2;
        else
            mAnswers[0]=number1-number2;

        number1 = rn.nextInt(10);
        number2 = rn.nextInt(10);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[1]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[1]=number1+number2;
        else
            mAnswers[1]=number1-number2;

        number1 = rn.nextInt(30);
        number2 = rn.nextInt(30);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[2]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[2]=number1+number2;
        else
            mAnswers[2]=number1-number2;

        number1 = rn.nextInt(30);
        number2 = rn.nextInt(30);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[3]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[3]=number1+number2;
        else
            mAnswers[3]=number1-number2;

        number1 = rn.nextInt(50);
        number2 = rn.nextInt(50);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[4]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[4]=number1+number2;
        else
            mAnswers[4]=number1-number2;

        number1 = rn.nextInt(50);
        number2 = rn.nextInt(50);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[5]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[5]=number1+number2;
        else
            mAnswers[5]=number1-number2;

        number1 = rn.nextInt(60);
        number2 = rn.nextInt(60);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[6]=number1+" "+" "+op+" "+ " "+number2;
        if (ope==1)
            mAnswers[6]=number1+number2;
        else
            mAnswers[6]=number1-number2;

        number1 = rn.nextInt(60);
        number2 = rn.nextInt(60);
        number3 = rn.nextInt(60);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[7]=number1+" "+" "+op+" "+ " "+number2+" "+op+" "+ number3;
        if (ope==1)
            mAnswers[7]=number1+number2+number3;
        else
            mAnswers[7]=number1-number2-number3;

        number1 = rn.nextInt(100);
        number2 = rn.nextInt(100);
        number3 = rn.nextInt(100);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[8]=number1+" "+" "+op+" "+ " "+number2+" "+op+" "+ number3;
        if (ope==1)
            mAnswers[8]=number1+number2+number3;
        else
            mAnswers[8]=number1-number2-number3;

        number1 = rn.nextInt(100);
        number2 = rn.nextInt(100);
        number3 = rn.nextInt(100);
        ope = rn.nextInt(2);
        if (ope==1)
            op="+";
        else
            op="-";
        mQuestions[9]=number1+" "+" "+op+" "+ " "+number2+" "+op+" "+ number3;
        if (ope==1)
            mAnswers[9]=number1+number2+number3;
        else
            mAnswers[9]=number1-number2-number3;

      // view questions
      que.setText(mQuestions[i]);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              ans=Integer.valueOf(ansr.getText().toString());

              if (ans==mAnswers[i])
                  currAn++;
              i++;

              if(i==10)
              {
                  levelDialog();
                  return;
              }
              que.setText(mQuestions[i]);
              ansr.setText("");
          }
      });



    }
    // Display dialog box for information
    public void openDialog()
    {
        TestDialog dialog = new TestDialog();
        dialog.show(getSupportFragmentManager(),"Test Dialog");
    }

    public void levelDialog()
    {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if(currAn==0) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 1");
        }
       else if(currAn==1) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 1");
        }
       else if(currAn==2) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 1");
        }
       else if(currAn==3) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 2");
        }
       else if(currAn==4) {
            builder.setTitle("Alert");
            builder.setMessage("3");
        }
       else if(currAn==5) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 4");
        }
       else if(currAn==6) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 4");
        }
       else if(currAn==7) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 5");
        }
      else  if(currAn==8) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 6");
        }
       else if(currAn==9) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 7");
        }
       else if(currAn==10) {
            builder.setTitle("Alert");
            builder.setMessage("We recommend you start at level 8");
        }
        else
        {
            builder.setTitle("Alert");
            builder.setMessage(""+currAn);
        }
        // add a button
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(Test.this, MainActivity.class));
                finish();
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }


}
