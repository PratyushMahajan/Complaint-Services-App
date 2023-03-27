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

public class DetailsWifi extends AppCompatActivity {

    View b;
    EditText roomno, problem;
    TextView t;
    Button submit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailswifi);

        b=findViewById(R.id.back);
        roomno=findViewById(R.id.editText);
        problem=findViewById(R.id.editText2);
        t=findViewById(R.id.textView);
        submit=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsWifi.this, MainActivity.class);
                startActivity(intent);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String room = roomno.getText().toString();
                String prblm = problem.getText().toString();

                if((room.isEmpty() ) || (prblm.isEmpty())) {
                    Toast.makeText(DetailsWifi.this, "Give Info", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(DetailsWifi.this, "Service Registered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}