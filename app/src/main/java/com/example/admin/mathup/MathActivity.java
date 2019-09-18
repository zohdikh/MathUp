package com.example.admin.mathup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;


public class MathActivity extends AppCompatActivity implements View.OnClickListener {
    String level;
    String currUid;
    FirebaseAuth auth;
    FirebaseUser curruser;
    DatabaseReference reference;
    int numor,numow,numoa;



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
        int num1 , num2 , num3 ,num4,ope;
        String operation;
        Random r1 = new Random();
        Random r2 = new Random();
        DBConnections db = new DBConnections(this);
        auth=FirebaseAuth.getInstance();
        curruser=auth.getCurrentUser();


        reference=FirebaseDatabase.getInstance().getReference().child("user").child("user");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String nor = "",now="",noa="";

                 nor = dataSnapshot.child(curruser.getUid()).child("numberOfRightAnswers").getValue().toString();
                 now = dataSnapshot.child(curruser.getUid()).child("numberOfWrongAnswers").getValue().toString();
                noa = dataSnapshot.child(curruser.getUid()).child("numberOfAnswered").getValue().toString();
                numor = Integer.parseInt(nor);
                numow = Integer.parseInt(now);
                numoa=numor+numow;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),databaseError.getMessage(),Toast.LENGTH_LONG).show();

            }
        });


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
    /* save RIGHT answered questions to DB*/
    public void Savetodb(String lvl , int no1,int no2,String ope)
    {
        DBConnections db = new DBConnections(this);
        switch (lvl)
        {
            case "1":
             db.InsertRowlvl1(no1,no2,ope);
             numor++;
             break;
            case "2":
                db.InsertRowlvl2(no1,no2,ope);
                numor++;
                 break;
            case "3":
                db.InsertRowlvl3(no1,no2,ope);
                numor++;
                break;
            case "4":
                db.InsertRowlvl4(no1,no2,ope);
                numor++;
                break;
            case "5":
                db.InsertRowlvl5(no1,no2,ope);
                numor++;
                break;
            case "6":
                db.InsertRowlvl6(no1,no2,ope);
                numor++;
                break;
        }
        FirebaseDatabase.getInstance().getReference().child("user").child("user").child(curruser.getUid()).child("numberOfRightAnswers").setValue(numor);
        FirebaseDatabase.getInstance().getReference().child("user").child("user").child(curruser.getUid()).child("numberOfAnswered").setValue(numoa+1);

    }
    /* save WRONG answered questions to DB*/
    public void Savetodbw(String lvl , int no1,int no2,String ope) {
        DBConnections db = new DBConnections(this);
        switch (lvl) {
            case "1":
                db.InsertRowlvl1w(no1, no2, ope);
                numow++;
                break;
            case "2":
                db.InsertRowlvl2w(no1, no2, ope);
                numow++;
                break;
            case "3":
                db.InsertRowlvl3w(no1, no2, ope);
                numow++;
                break;
            case "4":
                db.InsertRowlvl4w(no1, no2, ope);
                numow++;
                break;
            case "5":
                db.InsertRowlvl5w(no1, no2, ope);
                numow++;
                break;
            case "6":
                db.InsertRowlvl6w(no1, no2, ope);
                numow++;
                break;
        }
        FirebaseDatabase.getInstance().getReference().child("user").child("user").child(curruser.getUid()).child("numberOfWrongAnswers").setValue(numow);
        FirebaseDatabase.getInstance().getReference().child("user").child("user").child(curruser.getUid()).child("numberOfAnswered").setValue(numoa+1);

    }
    public void ClickMath()
    {
        Bundle b = getIntent().getExtras();
        level = b.getString("level");
        EditText n1 = (EditText) findViewById(R.id.N1);
        EditText n2 = (EditText) findViewById(R.id.N2);
        EditText op = (EditText) findViewById(R.id.Op);
        EditText ans = (EditText) findViewById(R.id.Ans);
        int num1 , num2  ,ope,imagesource;
        double num3;
        ImageView ansflg = (ImageView)findViewById(R.id.ansflag);
        String operation;
        String empt = getResources().getString(R.string.err);
        ans.onEditorAction(EditorInfo.IME_ACTION_DONE);
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        if(TextUtils.isEmpty(ans.getText().toString()))
        {
            ans.setError(empt);
            return;
        }
        num3 = Double.parseDouble(ans.getText().toString());
        operation = op.getText().toString();
        if(operation.equals("+"))
        {
            if(num3 == (num1+num2)) {
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
                Glide.with(this).load(R.drawable.right).into(ansflg);
                Savetodb(level,num1,num2,operation);
            }
            else
            {
                Toast.makeText(MathActivity.this, "False",Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/redx",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodbw(level,num1,num2,operation);
            }
        }

        if(operation.equals("-"))
        {
            if(num3 == Math.max(num1,num2)-Math.min(num1,num2))
            {
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/right",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodb(level,num1,num2,operation);
            }
            else if(num3== num1-num2)
            {
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/right",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodb(level,num1,num2,operation);
            }
            else
            {
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/redx",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodbw(level,num1,num2,operation);
            }
        }
        if(operation.equals("*"))
        {
            if(num3 == num1*num2)
            {
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/right",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodb(level,num1,num2,operation);
            }
            else
            {
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/redx",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodbw(level,num1,num2,operation);
            }
        }
        if(operation.equals("/"))
        {
            if(num3 == (double)num1/(double)num2)
            {
                Toast.makeText(MathActivity.this, "Excellent",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/right",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodb(level,num1,num2,operation);
            }
            else
            {
                Toast.makeText(MathActivity.this, "False",
                        Toast.LENGTH_LONG).show();
                imagesource = getResources().getIdentifier("@drawable/redx",null,getPackageName());
                ansflg.setImageResource(imagesource);
                Savetodbw(level,num1,num2,operation);
            }
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
