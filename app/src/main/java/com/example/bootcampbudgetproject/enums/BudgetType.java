package com.example.bootcampbudgetproject.enums;

import com.example.bootcampbudgetproject.R;

public enum BudgetType {

    Fatura,
    Kira,
    Diger;

    public int getIcon(){
        switch (this){
            case Fatura:
                return R.drawable.ic_home;
            case Kira:
                return R.drawable.ic_assignement;
            case Diger:
                return R.drawable.ic_launcher_background;
            default:
                return R.drawable.ic_launcher_foreground;
        }

    }
}
