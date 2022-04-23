package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*Tanggal Pengerjaan:22/04/2022
NIM:10119258
Nama: Akmal Jihad Fauzan
Kelas: IF-7
 */
public class LoginActivity extends AppCompatActivity {

    private Button tombolLogin;
    private Button tombolSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tombolLogin = findViewById(R.id.btn_login);
        tombolSignup = findViewById(R.id.btn_daftar);


        tombolLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }


        });
        tombolSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}