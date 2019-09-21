package com.example.admin.mathup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


import java.util.ArrayList;
import java.util.List;

public class SignUp extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    DatabaseReference databaseUsers;
    Button btnsignup;
    EditText editName ,email,password , schoolclass,school;
    Spinner spinnerTeacher;
    String Teacher;
    private FirebaseAuth auth;
    String name;
    String Email;
    String Pass ;
    String SchoolClass;
    String School;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        auth = FirebaseAuth.getInstance();
        databaseUsers = FirebaseDatabase.getInstance().getReference("user");
        btnsignup = (Button) findViewById(R.id.btnsignup);
        editName = (EditText) findViewById(R.id.edtname);
        email = (EditText) findViewById(R.id.edtEmail);
        password = (EditText) findViewById(R.id.edtpass);
        schoolclass = (EditText) findViewById(R.id.edtclass);
        spinnerTeacher = (Spinner) findViewById(R.id.teacherSpinner);
        school =(EditText) findViewById(R.id.edtSchool);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUp();
            }
        });
        addItemsOnSpinner();
        spinnerTeacher.getOnItemSelectedListener();


    }
    //Add Teachers Names To Spinner
    public void addItemsOnSpinner() {

        spinnerTeacher = (Spinner) findViewById(R.id.teacherSpinner);
        List<String> list = new ArrayList<String>();
        list.add("Zohde");
        list.add("Amir");
        list.add("Ishay");
        list.add("Nadya");
        list.add("Leen");
        list.add("Sahar");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTeacher.setAdapter(dataAdapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Teacher = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    //Sign Up User To FirebaseDB and Authintication
    private void SignUp() {
         name = editName.getText().toString().trim();
         Email = email.getText().toString().trim();
         Pass = password.getText().toString().trim();
         SchoolClass = schoolclass.getText().toString().trim();
        Teacher = spinnerTeacher.getSelectedItem().toString();
        School = school.getText().toString().trim();


            //id = databaseUsers.push().getKey();
           // User user = new User(id, name, Email, SchoolClass, Teacher);
           // databaseUsers.child("user").child(id).setValue(user);
           // Toast.makeText(this, "added user", Toast.LENGTH_SHORT).show();
         /*else {
                Toast.makeText(this, "Please Fill Everything", Toast.LENGTH_SHORT).show();
    }*/
        Task<AuthResult> authResultTask = auth.createUserWithEmailAndPassword(Email, Pass)
                .addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {


                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        User user = new User(auth.getCurrentUser().getUid(), name, Email, SchoolClass, Teacher,School);
                        databaseUsers.child("user").

                                child(auth.getCurrentUser().getUid()).setValue(user);
                        Toast.makeText(SignUp.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                        //progressBar.setVisibility(View.GONE);
                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(SignUp.this, "Authentication failed." + task.getException(),
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            startActivity(new Intent(SignUp.this, MainActivity.class));
                            finish();
                        }
                    }
                });

    }
}
