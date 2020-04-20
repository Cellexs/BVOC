package com.cs386.bvoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RegisterPage extends AppCompatActivity {

    private EditText uFullName, uEmail, uPassword;
    private Button uRegisterBtn;
    private TextView uLoginBtn;
    private FirebaseAuth fbAuth;
    private ProgressBar prgBar;

    String currentUser = fbAuth.getCurrentUser().getUid();

    

    private void sendToMain()
    {
        Intent backToMainAct = new Intent(this, MainActivity.class);

        startActivity(backToMainAct);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        uFullName = findViewById(R.id.userName);
        uEmail = findViewById(R.id.userEmail);
        uPassword = findViewById(R.id.userPassword);
        uRegisterBtn = findViewById(R.id.signupbtn);
        uLoginBtn = findViewById(R.id.toLogin);

        fbAuth = FirebaseAuth.getInstance();
        prgBar = findViewById(R.id.progressBar);



        if (fbAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        uRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = uEmail.getText().toString().trim();
                String password = uPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    uEmail.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    uPassword.setError("Password is Required");
                    return;
                }
                if (password.length() < 8) {
                    uPassword.setError("Password Must Be 8 or More Characters");
                    return;
                }

                prgBar.setVisibility(View.VISIBLE);

                // register the user to firebase

                fbAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful())
                        {

                            Toast.makeText(RegisterPage.this, "Account Created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            prgBar.setVisibility(View.GONE);
                            sendData();
                        } else {
                            Toast.makeText(RegisterPage.this, "Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            prgBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        uLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });



    }
    public void sendData()
    {
        try
        {
            HttpURLConnection client = null;
            URL url = new URL("tbd");

            client = (HttpURLConnection) url.openConnection();
            client.setRequestMethod("POST");
            client.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            client.setRequestProperty("Accept", "application/json");
            client.setDoOutput(true);
            client.setDoInput(true);


            JSONObject json = new JSONObject();
            json.put("problem", "profile");
            json.put("profID", currentUser);
            json.put("profName", uFullName);


            Log.i("JSON", json.toString());
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeBytes(json.toString());

            output.flush();
            output.close();

            Log.i("STATUS", String.valueOf(client.getResponseCode()));
            Log.i("MSG", client.getResponseMessage());

            client.disconnect();


        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
