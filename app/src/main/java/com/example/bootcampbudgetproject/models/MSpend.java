package com.example.bootcampbudgetproject.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.bootcampbudgetproject.enums.BudgetType;
import com.google.android.material.textfield.TextInputEditText;

@Entity(tableName = "spend_table")
public class MSpend {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "harcama_adi")
    String spendName;

    int spendMoney;
    BudgetType budgetType;

    public MSpend(String spendName, int spendMoney, BudgetType budgetType){
        this.spendName = spendName;
        this.spendMoney = spendMoney;
        this.budgetType = budgetType;
    }


    public String getSpendName() {
        return spendName;
    }

    public void setSpendName(String spendName) {
        this.spendName = spendName;
    }

    public int getSpendMoney() {
        return spendMoney;
    }

    public void setSpendMoney(int spendMoney) {
        this.spendMoney = spendMoney;
    }

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }
}
