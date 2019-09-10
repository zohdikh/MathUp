package com.example.admin.mathup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    DatabaseReference databaseUsers;
    Button btnsignup;
    EditText editName ,email,password , schoolclass;
    Spinner spinnerTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        databaseUsers = FirebaseDatabase.getInstance().getReference("user");
        btnsignup = (Button) findViewById(R.id.btnsignup);
        editName = (EditText) findViewById(R.id.edtname);
        email = (EditText) findViewById(R.id.edtmail);
        password = (EditText) findViewById(R.id.edtpass);
        schoolclass = (EditText) findViewById(R.id.edtclass);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUp();
            }
        });
    }
    private void SignUp() {
        String name = editName.getText().toString().trim();
        String Email = email.getText().toString().trim();
        String Pass = password.getText().toString().trim();
        String SchoolClass = schoolclass.getText().toString().trim();
        //String Teacher = spinnerTeacher.getSelectedItem().toString();
        String Teacher = "Zohde";

            String id = databaseUsers.push().getKey();
            User user = new User(id, name, Email, SchoolClass, Teacher);
            databaseUsers.child("user").child(id).setValue(user);
            Toast.makeText(this, "added user", Toast.LENGTH_SHORT).show();
         /*else {
                Toast.makeText(this, "Please Fill Everything", Toast.LENGTH_SHORT).show();
    }*/
    }
}
