package com.example.project_gabungan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


import Acara_10.Acara_10; package Acara_10;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Deklarasi tombol-tombol dari Acara_10 hingga Acara_35
        int[] buttonIds = {
                R.id.button_acara_10,
                R.id.button_acara_11,
                R.id.button_acara_12,
                R.id.button_acara_13,
                R.id.button_acara_14,
                R.id.button_acara_15,
                R.id.button_acara_16,
                R.id.button_acara_17,
                R.id.button_acara_18,
                R.id.button_acara_19,
                R.id.button_acara_20,
                R.id.button_acara_21,
                R.id.button_acara_22,
                R.id.button_acara_23,
                R.id.button_acara_24,
                R.id.button_acara_25,
                R.id.button_acara_26,
                R.id.button_acara_27,
                R.id.button_acara_28,
                R.id.button_acara_29,
                R.id.button_acara_30,
                R.id.button_acara_31,
                R.id.button_acara_32,
                R.id.button_acara_33,
                R.id.button_acara_34,
                R.id.button_acara_35
        };

        // Looping untuk mengatur onClickListener pada semua tombol
        for (int id : buttonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(this);  // Mengatur listener ke activity ini
        }
    }

    @Override
    public void onClick(View v) {
        // Cek tombol mana yang diklik berdasarkan id-nya menggunakan if-else
        if (v.getId() == R.id.button_acara_10) {
            Toast.makeText(this, "Tombol Acara 10 diklik!", Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.button_acara_11) {
            Toast.makeText(this, "Tombol Acara 11 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_12) {
            Toast.makeText(this, "Tombol Acara 12 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_13) {
            Toast.makeText(this, "Tombol Acara 13 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_14) {
            Toast.makeText(this, "Tombol Acara 14 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_15) {
            Toast.makeText(this, "Tombol Acara 15 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_16) {
            Toast.makeText(this, "Tombol Acara 16 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_17) {
            Toast.makeText(this, "Tombol Acara 17 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_18) {
            Toast.makeText(this, "Tombol Acara 18 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_19) {
            Toast.makeText(this, "Tombol Acara 19 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_20) {
            Toast.makeText(this, "Tombol Acara 20 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_21) {
            Toast.makeText(this, "Tombol Acara 21 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_22) {
            Toast.makeText(this, "Tombol Acara 22 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_23) {
            Toast.makeText(this, "Tombol Acara 23 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_24) {
            Toast.makeText(this, "Tombol Acara 24 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_25) {
            Toast.makeText(this, "Tombol Acara 25 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_26) {
            Toast.makeText(this, "Tombol Acara 26 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_27) {
            Toast.makeText(this, "Tombol Acara 27 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_28) {
            Toast.makeText(this, "Tombol Acara 28 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_29) {
            Toast.makeText(this, "Tombol Acara 29 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_30) {
            Toast.makeText(this, "Tombol Acara 30 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_31) {
            Toast.makeText(this, "Tombol Acara 31 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_32) {
            Toast.makeText(this, "Tombol Acara 32 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_33) {
            Toast.makeText(this, "Tombol Acara 33 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_34) {
            Toast.makeText(this, "Tombol Acara 34 diklik!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button_acara_35) {
            Toast.makeText(this, "Tombol Acara 35 diklik!", Toast.LENGTH_SHORT).show();
        }
    }
}
