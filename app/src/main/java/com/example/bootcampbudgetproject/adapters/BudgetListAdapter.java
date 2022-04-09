package com.example.bootcampbudgetproject.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampbudgetproject.R;
import com.example.bootcampbudgetproject.models.MSpend;

import java.util.ArrayList;


public class BudgetListAdapter extends RecyclerView.Adapter<BudgetListAdapter.MyCustomViewHolder> {


    ArrayList<MSpend> mDataList;
    LayoutInflater mInflater;

    public BudgetListAdapter(Context context, ArrayList<MSpend> data){
//        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        /*
         * Yukarıdakinin daha kolayı aşağıda;
         * */
        mInflater = LayoutInflater.from(context);

        this.mDataList = data;

    }



    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        /*
         *   Bu kısım ekrana sığacak olan listeleri bir defaya mahsus üretecek,
         *   yani inflate edecek, daha sonrasında bu üretilen viewleri sürekli yenileyecek
         */

        View v = mInflater.inflate(R.layout.item_harcama,parent, false);
        MyCustomViewHolder holder = new MyCustomViewHolder(v);
        return holder;



    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {

        /*
         *
         * Listede ki elemanlara, bilgileri bağlıyacak olan kısım
         *
         */

        holder.setData(mDataList.get(position),position);


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



    class MyCustomViewHolder extends RecyclerView.ViewHolder{

        TextView mManzaraTitle, mManzaraTanim;
        ImageView mManzaraImage, mDeleteImage, mCopyImage;

        public MyCustomViewHolder(@NonNull View itemView) {

            /*
             *
             * Tanımlama işlemleri yapılacak, datalar yazılacak,
             * */
            super(itemView);

//            mManzaraTitle = itemView.findViewById(R.id.tvManzaraTitle);
//            mManzaraTanim = itemView.findViewById(R.id.tvManzaraTanim);
//            mManzaraImage = itemView.findViewById(R.id.imageManzara);
//            mDeleteImage = itemView.findViewById(R.id.imageDelete);
//            mCopyImage = itemView.findViewById(R.id.imageCopy);



        }

        public void setData(MSpend spend, int position) {

//            this.mManzaraTitle.setText(tiklanilanManzara.getTitle());
//            this.mManzaraTanim.setText(tiklanilanManzara.getTanim());
//            this.mManzaraImage.setImageResource(tiklanilanManzara.getImageID());

        }
    }

}