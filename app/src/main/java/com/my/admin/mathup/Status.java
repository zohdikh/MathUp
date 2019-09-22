package com.my.admin.mathup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Status extends AppCompatActivity {
    ListView listView;
    ArrayList<String> List;
    ArrayAdapter<String> adapter;
    FirebaseDatabase database;
    DatabaseReference ref;
    User user;
    // Get All student status for teachers review
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        user =new User();
        List = new ArrayList<>();
        listView =(ListView) findViewById(R.id.statuslist);
        database=FirebaseDatabase.getInstance();
        adapter = new ArrayAdapter<String>(this,R.layout.user_info,R.id.userInfo,List);
        ref = FirebaseDatabase.getInstance().getReference().child("user").child("user");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    user = ds.getValue(User.class);
                    List.add(" Name : "+user.getName()+"\n Class :"+user.getClassroom()+"\n Teacher : "+user.getTeacher()+"\n Number of questions answered : "+ user.getNumberOfAnswered()+"\n Number of right answers : "+user.getNumberOfRightAnswers()+"\n Number of wrong answers :"+user.getNumberOfWrongAnswers());
                }
                listView.setAdapter(adapter);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

}
