package com.example.admin.mathup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TeachersLogin extends AppCompatActivity {
    ImageButton tlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_login);
        tlogin = (ImageButton) findViewById(R.id.imgbtn);
        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeachersLogin.this, Status.class));
            }
        });
    }
}
