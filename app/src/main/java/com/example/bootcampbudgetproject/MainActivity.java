package com.example.bootcampbudgetproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampbudgetproject.adapters.BudgetListAdapter;
import com.example.bootcampbudgetproject.enums.BudgetType;
import com.example.bootcampbudgetproject.models.MSpend;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tvName, tvHarcama,tvMiktar, btnTL, btnDOLAR, btnSTERLIN, btnEURO;
    private RecyclerView recyclerView;
    private ArrayList<MSpend> spendList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initRecyclerView();

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
        spendList = new ArrayList<>();


        //mock
        MSpend mSpend = new MSpend("Ev Kirası",1000, BudgetType.Kira);
        spendList.add(mSpend);
        mSpend = new MSpend("Elektrik Faturası",500,BudgetType.Fatura);
        spendList.add(mSpend);
        mSpend = new MSpend("Ev Aidatı",100,BudgetType.Diger);
        spendList.add(mSpend);
        mSpend = new MSpend("Su Faturası",300,BudgetType.Fatura);
        spendList.add(mSpend);


    }

    private void initRecyclerView() {

        BudgetListAdapter budgetListAdapter = new BudgetListAdapter(MainActivity.this, spendList);
        recyclerView.setAdapter(budgetListAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }



}