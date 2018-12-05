package com.example.arafat.flowers;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class MyAdpater extends RecyclerView.Adapter<MyAdpater.MyViewHolder> {

    private List<SetGet> mList;


    public MyAdpater(java.util.List<SetGet> list) {
        this.mList = list;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_flower, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(mView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
            SetGet elements = mList.get(i);
            viewHolder.flower.setImageResource(elements.getFlower_Image_ID());
            viewHolder.flowerName.setText(elements.getFlowers_Name());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView flower;
        TextView flowerName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

             flower = itemView.findViewById(R.id.my_flower);
             flowerName = itemView.findViewById(R.id.flower_name);


        }



    }
}
