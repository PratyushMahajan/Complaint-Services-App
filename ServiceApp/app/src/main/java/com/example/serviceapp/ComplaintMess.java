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

public class ComplaintMess extends AppCompatActivity {

    View b;
    EditText problem;
    TextView t;
    Button submit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaintmess);

        b=findViewById(R.id.back);
        problem=findViewById(R.id.editText2);
        t=findViewById(R.id.textView);
        submit=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComplaintMess.this, MainActivity.class);
                startActivity(intent);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String prblm = problem.getText().toString();

                if(prblm.isEmpty()) {
                    Toast.makeText(ComplaintMess.this, "Give Info", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(ComplaintMess.this, "Service Registered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}