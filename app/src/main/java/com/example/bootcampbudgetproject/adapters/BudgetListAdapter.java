package com.example.bootcampbudgetproject.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampbudgetproject.R;
import com.example.bootcampbudgetproject.models.MSpend;

import java.util.ArrayList;


public class BudgetListAdapter extends RecyclerView.Adapter<BudgetListAdapter.BudgetListViewHolder> {


    ArrayList<MSpend> mDataList;
    LayoutInflater mInflater;
    Context context;

    public BudgetListAdapter(Context context, ArrayList<MSpend> data){
//        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        /*
         * Yukarıdakinin daha kolayı aşağıda;
         * */
        this.context = context;
        mInflater = LayoutInflater.from(context);

        this.mDataList = data;

    }



    @NonNull
    @Override
    public BudgetListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        /*
         *   Bu kısım ekrana sığacak olan listeleri bir defaya mahsus üretecek,
         *   yani inflate edecek, daha sonrasında bu üretilen viewleri sürekli yenileyecek
         */

        View v = mInflater.inflate(R.layout.item_harcama,parent, false);
        BudgetListViewHolder holder = new BudgetListViewHolder(v);
        return holder;



    }

    @Override
    public void onBindViewHolder(@NonNull BudgetListViewHolder holder, int position) {

        /*
         *
         * Listede ki elemanlara, bilgileri bağlıyacak olan kısım
         *
         */

        holder.setData(mDataList.get(position),position,context);


    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }


    @SuppressLint("NotifyDataSetChanged")
    public void updateDataList(ArrayList<MSpend> list){
        mDataList = list;
        this.notifyDataSetChanged();
    }



    class BudgetListViewHolder extends RecyclerView.ViewHolder{

        TextView tvHarcamaAdi,tvMiktar;
        ImageView ivIcon;
        CardView cvBudget;

        public BudgetListViewHolder(@NonNull View itemView) {

            /*
             *
             * Tanımlama işlemleri yapılacak, datalar yazılacak,
             * */
            super(itemView);

            tvHarcamaAdi = itemView.findViewById(R.id.tvHarcamaAdi);
            tvMiktar = itemView.findViewById(R.id.tvMiktar);
            ivIcon = itemView.findViewById(R.id.ivIcon);
            cvBudget = itemView.findViewById(R.id.cvBudget);


        }

        public void setData(MSpend spend, int position, Context context) {


            this.ivIcon.setBackgroundResource(spend.getBudgetType().getIcon());
            this.tvHarcamaAdi.setText(spend.getSpendName());
            this.tvMiktar.setText(String.valueOf(spend.getSpendMoney()));

            if(position%2==0) cvBudget.setCardBackgroundColor(ContextCompat.getColor(context,R.color.cardview_dark_background));

        }
    }

}