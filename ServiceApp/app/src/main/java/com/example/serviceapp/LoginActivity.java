package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity
{
    TextView createaccount;
    EditText email;
    EditText password;
    MaterialButton loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login_activity_main);

        createaccount = findViewById(R.id.create);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        loginbtn = findViewById(R.id.loginbtn);

        //admin and admin
        createaccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(email.getText().toString().equals(""))
                {
                    //error
                    email.setError("This Field is Mandatory");
                }
                if(password.getText().toString().equals(""))
                {
                    //error
                    password.setError("This Field is Mandatory");
                }
                else if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    //correct
                    Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, Dashboard.class);
                    startActivity(intent);
                }
                else
                {
                    //incorrect
                    Toast.makeText(LoginActivity.this, "Incorrect Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}