package com.cs386.bvoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.cs386.bvoc.ui.JsonPlaceHolder;
import com.cs386.bvoc.ui.Post;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    

    public void logout(View view)
    {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void goToAdd(View view)
    {
        Intent goToAddFriend = new Intent(this,
                addFriendAct.class);

        startActivity(goToAddFriend);
    }

    public void goToMessage(View view)
    {
        Intent goToMessage = new Intent(this,
                Message.class);

        startActivity(goToMessage);
    }

    public void goToHistory(View view)
    {
        Intent goToHistory = new Intent(this,
                History.class);

        startActivity(goToHistory);
    }

    public void goToField(View view)
    {
        Intent goToField = new Intent(this,
                addField.class);

        startActivity(goToField);
    }

    public void goToProfile(View view)
    {
        Intent goToProfile = new Intent(this,
                MyProfile.class);

        startActivity(goToProfile);
    }
}

