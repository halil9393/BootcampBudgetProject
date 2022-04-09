package com.example.bootcampbudgetproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private TextView tvName, tvHarcama,tvMiktar, btnTL, btnDOLAR, btnSTERLIN, btnEURO;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        tvName = findViewById(R.id.tvName);
        tvHarcama = findViewById(R.id.tvHarcama);
        tvMiktar = findViewById(R.id.tvMiktar);
        btnTL = findViewById(R.id.btnTL);
        btnDOLAR = findViewById(R.id.btnDOLAR);
        btnSTERLIN = findViewById(R.id.btnSTERLIN);
        btnEURO = findViewById(R.id.btnEURO);
        recyclerView = findViewById(R.id.recyclerView);
    }




}