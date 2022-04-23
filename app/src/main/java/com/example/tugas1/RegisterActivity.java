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
public class RegisterActivity extends AppCompatActivity {

    private Button tombolRegis;
    private Button tombolCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tombolRegis = findViewById(R.id.btn_register);
        tombolCancel =findViewById(R.id.btn_cancel);

        tombolRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        tombolCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}