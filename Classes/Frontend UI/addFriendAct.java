package com.cs386.bvoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class addFriendAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_freind);
    }

    public void addProfile(View view)
    {

    }

    public void backToMain(View view)
    {
        Intent backToMainAct = new Intent(this, MainActivity.class);

        startActivity(backToMainAct);
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
            json.put("name", "az");

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

