package com.example.admin.mathup;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import de.nitri.gauge.Gauge;

public class Status extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        DBConnections db = new DBConnections(this);
        Bundle b = getIntent().getExtras();
        String level = b.getString("level");
        long c = db.Count(level);
        Gauge gauge = (Gauge) findViewById(R.id.gauge);
        int currv = 0;
        gauge.setValue(currv);
        currv=currv+(int)c;
        gauge.moveToValue(currv);








    }

}
