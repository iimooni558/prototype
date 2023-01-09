package com.destination.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.destination.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void Login(View view) {
        startActivity(new Intent(this, Home.class));
    }

    public void Reg(View view) {
        startActivity(new Intent(this, Register.class));
    }

    public void Forget(View view) {
        startActivity(new Intent(this, ForgetPass.class));
    }
}