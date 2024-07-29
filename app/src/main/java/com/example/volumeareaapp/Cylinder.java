package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Cylinder extends AppCompatActivity {

    TextView title;
    TextView result;
    EditText heightCylinder;
    EditText radiusCylinder;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        title = findViewById(R.id.titleCylinder);
        result = findViewById(R.id.resultCylinder);
        heightCylinder = findViewById(R.id.heightCylinder);
        radiusCylinder = findViewById(R.id.radiusCylinder);
        btn = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = radiusCylinder.getText().toString();
                int r = Integer.parseInt(radius);

                String height = heightCylinder.getText().toString();
                int h = Integer.parseInt(height);

                double volume = 3.14149 * r*r * h;
                result.setText("V "+volume+" m^3");
            }
        });
    }
}