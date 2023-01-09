package com.destination.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.destination.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



    }

    public void Register(View view) {

        startActivity(new Intent(this, Register.class));

    }

    public void Login(View view) {
        startActivity(new Intent(this, Login.class));
    }
}