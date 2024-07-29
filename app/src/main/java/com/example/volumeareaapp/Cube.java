package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    TextView title;
    EditText sideCube;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        title = findViewById(R.id.titleCube);
        sideCube = findViewById(R.id.sideCube);
        btn = findViewById(R.id.btn3);
        result = findViewById(R.id.resultCube);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String side = sideCube.getText().toString();
                int s = Integer.parseInt(side);

                double Volume = s*s*s;

                result.setText("V = "+Volume+" m^3");
            }
        });
    }
}