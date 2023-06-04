package com.example.myprojectservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    ImageView googleBtn;

    private Button btnRegisters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView usernam = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((usernam.getText().toString().equals("admin") && password.getText().toString().equals("admin"))){
                    //correct
                    Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFULL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(LoginActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });


                btnRegisters = findViewById(R.id.regbtn);
                btnRegisters = findViewById(R.id.regbtn);


                btnRegisters.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                        startActivity(intent);
                    }





                });



            }
        }
