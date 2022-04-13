package com.example.bootcampbudgetproject.models;

import com.example.bootcampbudgetproject.enums.BudgetType;

public class MSpend {

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
