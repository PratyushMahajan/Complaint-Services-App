package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsPlumber extends AppCompatActivity {
    View b;
    EditText washno, problem, bed;
    TextView t;
    Button submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsplumber);

        b=findViewById(R.id.back);
        washno=findViewById(R.id.editText);
        problem=findViewById(R.id.editText2);
        bed=findViewById(R.id.editText3);
        t=findViewById(R.id.textView);
        submit=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsPlumber.this, MainActivity.class);
                startActivity(intent);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View v) {
                String wash = washno.getText().toString();
                String prblm = problem.getText().toString();
                String bedno = bed.getText().toString();

                if(wash.isEmpty()|| prblm.isEmpty() || bedno.isEmpty()) {
                    Toast.makeText(DetailsPlumber.this, "Give Info", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(DetailsPlumber.this, "Service Registered", Toast.LENGTH_SHORT).show();
            }
        });

    }
}