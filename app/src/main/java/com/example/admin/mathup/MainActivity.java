package com.example.admin.mathup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private static final String[] paths = {"Level 1", "Level  2", "Level 3", "Level 4", "Level 5", "Level 6"};
    int level;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] levels = getResources().getStringArray(R.array.levels);
        spinner = (Spinner)findViewById(R.id.teacherSpinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(MainActivity.this, "Level 1 Selected",
                        Toast.LENGTH_SHORT).show();
                        level = 1;
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                Toast.makeText(MainActivity.this, "Level 2 Selected",
                        Toast.LENGTH_SHORT).show();
                level =2;
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                Toast.makeText(MainActivity.this, "Level 3 Selected",
                        Toast.LENGTH_SHORT).show();
                level =3;
                break;
            case 3:
                // Whatever you want to happen when the thrid item gets selected
                Toast.makeText(MainActivity.this, "Level 4 Selected",
                        Toast.LENGTH_SHORT).show();
                level =4;
                break;
            case 4:
                // Whatever you want to happen when the thrid item gets selected
                Toast.makeText(MainActivity.this, "Level 5 Selected",
                        Toast.LENGTH_SHORT).show();
                level =5;
                break;
            case 5:
                // Whatever you want to happen when the thrid item gets selected
                Toast.makeText(MainActivity.this, "Level 6 Selected",
                        Toast.LENGTH_SHORT).show();
                level =6;

                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}

    public void MoveTo(View v)
    {
        Intent intent = new Intent(MainActivity.this, MathActivity.class);
        Bundle b = new Bundle();
        b.putString("level",String.valueOf(level));
        intent.putExtras(b);
        startActivity(intent);
    }

    public void MoveTo2(View v)
    {
        Intent intent = new Intent(MainActivity.this, Status.class);
        Bundle b = new Bundle();
        b.putString("level",String.valueOf(level));
        intent.putExtras(b);
        startActivity(intent);
    }
}

