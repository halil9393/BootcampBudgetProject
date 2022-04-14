package com.example.bootcampbudgetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HarcamaEkle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harcama_ekle);


    }

    public void btnEkle(View view){
        Intent intent = new Intent(HarcamaEkle.this, MainActivity.class);
        startActivity(intent);
    }
}