package com.cs386.bvoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;

public class Login extends AppCompatActivity
{
    EditText uEmail, uPassword;
    Button uLogInbtn;
    TextView uCreateBtn;
    ProgressBar prgBar;
    FirebaseAuth fbAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uEmail     = findViewById(R.id.userEmaill);
        uPassword  = findViewById(R.id.userPass);
        uLogInbtn  = findViewById(R.id.loginbtn);
        uCreateBtn = findViewById(R.id.newMemRegister);

        fbAuth     = FirebaseAuth.getInstance();
        prgBar     = findViewById(R.id.progressBar2);

        uLogInbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String email = uEmail.getText().toString().trim();
                String password = uPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email))
                {
                    uEmail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    uPassword.setError("Password is Required");
                    return;
                }
                if(password.length() < 8)
                {
                    uPassword.setError("Password Must Be 8 or More Characters");
                    return;
                }

                prgBar.setVisibility(View.VISIBLE);

                // log the user to firebase

               fbAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {

                       if(task.isSuccessful())
                       {
                           Toast.makeText(Login.this, "Logged In Successfully", Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(getApplicationContext(), MainActivity.class));
                       }
                       else
                       {
                           Toast.makeText(Login.this, "Error! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                           prgBar.setVisibility(View.GONE);
                       }
                   }
               });

            }
        });

        uCreateBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterPage.class));
            }
        });

    }
}

