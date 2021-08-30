package com.example.assignment_1___setup_layout_and_event_handling_rbf4504;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView info = (TextView) findViewById(R.id.wilmington_sites);
        Spinner historic_sites = (Spinner) findViewById(R.id.historic_sites);
        historic_sites.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String extraInfo = String.valueOf(historic_sites.getSelectedItem());
                info.setText(extraInfo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
