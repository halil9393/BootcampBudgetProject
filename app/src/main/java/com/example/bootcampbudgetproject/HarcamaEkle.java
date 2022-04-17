package com.example.bootcampbudgetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bootcampbudgetproject.enums.BudgetType;
import com.example.bootcampbudgetproject.models.MSpend;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class HarcamaEkle extends AppCompatActivity {

    private MSpendDao mSpendDao;
    public TextInputEditText textInputEditText,textInputEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harcama_ekle);

        textInputEditText = findViewById(R.id.textInputEditText);
        textInputEditText2 = findViewById(R.id.textInputEditText2);

    }

    public void btnEkle(View view){
//        Intent intent = new Intent(HarcamaEkle.this, MainActivity.class);
//        startActivity(intent);


        String name = Objects.requireNonNull(textInputEditText.getText()).toString();
        int harcama= Integer.parseInt(textInputEditText2.getText().toString());

//        MSpend mSpend = new MSpend(textInputEditText.toString(),Integer.parseInt(textInputEditText2.toString()), BudgetType.Fatura);
        MSpend mSpend = new MSpend(name,harcama, BudgetType.Fatura);

        insert(mSpend);

    }

    public void insert(MSpend mSpend) {

        SpendRoomDB db = SpendRoomDB.getDatabase(getApplication());
        mSpendDao = db.mSpendDao();


        SpendRoomDB.databaseWriteExecutor.execute(() -> {
            mSpendDao.insert(mSpend);
        });
    }
}