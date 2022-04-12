package com.example.multiactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    private Button signout;
    private String username;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "ProfileActivity resumed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "ProfileActivity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "ProfileActivity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "ProfileActivity destroyed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d("==>", "ProfileActivity created.");

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            username = extras.getString("username");
        }else{
            username = "No name given!";
        }
        Log.d("==>", "Username sent through Intent:"+username);

        signout = findViewById(R.id.sign_out);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Sign out clicked.");
                finish();
            }
        });
    }
}