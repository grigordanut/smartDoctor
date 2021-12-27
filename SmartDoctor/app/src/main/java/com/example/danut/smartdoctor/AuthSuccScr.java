package com.example.danut.smartdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthSuccScr extends AppCompatActivity {

    private Button buttonDoctor, buttonHospital,buttonContactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_succ_scr);

        buttonDoctor = (Button)findViewById(R.id.btnCheckCode);
        buttonDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AuthSuccScr.this, CheckUniqueCode.class));
            }
        });

        buttonHospital = (Button)findViewById(R.id.btnScanFinger);
        buttonHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AuthSuccScr.this, HospitalPage.class));
            }
        });
    }
}