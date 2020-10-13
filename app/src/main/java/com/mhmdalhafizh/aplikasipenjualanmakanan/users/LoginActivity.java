package com.mhmdalhafizh.aplikasipenjualanmakanan.users;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mhmdalhafizh.aplikasipenjualanmakanan.R;
import com.mhmdalhafizh.aplikasipenjualanmakanan.admin.HomeAdminActivity;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {

    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnLogin = (NoboButton) findViewById(R.id.loginbtn);

        btnLogin .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });

        
    }
}