package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*Tanggal Pengerjaan:23/04/2022
NIM:10119258
Nama: Akmal Jihad Fauzan
Kelas: IF-7
 */
public class MainActivity extends AppCompatActivity {

    private Button tombolProfile;
    private Button tombolLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolProfile = findViewById(R.id.btn_profile);
        tombolLogout = findViewById(R.id.btn_logout);

        tombolProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        tombolLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}