package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Prism extends AppCompatActivity {

    TextView title;
    EditText basePrism;
    EditText heightPrism;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        title = findViewById(R.id.titlePrism);
        basePrism = findViewById(R.id.basePrism);
        heightPrism = findViewById(R.id.heightPrism);
        btn = findViewById(R.id.btn4);
        result = findViewById(R.id.resultPrism);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String base = basePrism.getText().toString();
                int b = Integer.parseInt(base);

                String height = heightPrism.getText().toString();
                int h = Integer.parseInt(height);

                double volume = b*h;

                result.setText("V = "+volume+" m^3");
            }
        });
    }
}