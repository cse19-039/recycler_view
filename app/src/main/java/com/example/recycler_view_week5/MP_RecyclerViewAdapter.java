package com.example.recycler_view_week5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MP_RecyclerViewAdapter extends RecyclerView.Adapter<MP_RecyclerViewAdapter.MyViewHolder>{
        Context context;
        ArrayList<MegaPixelModel> megaPixelModels;

    public MP_RecyclerViewAdapter(Context context, ArrayList<MegaPixelModel> megaPixelModels){
            this.context = context;
            this.megaPixelModels= megaPixelModels;
    }
    @NonNull
    @Override
    public MP_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //This is where you inflate the layout(customizing how you want the rows to look)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mprecycler_view_row, parent, false);
        return new MP_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MP_RecyclerViewAdapter.MyViewHolder holder, int position) {
        //assigning values to each of our rows as the are shown on the screen based on
        // the position of the recycler view

        holder.tvFullName.setText(megaPixelModels.get(position).getMegapixelFullName());
        holder.tvNumberName.setText(megaPixelModels.get(position).getMegapixelNumberName());
        holder.tvAbbreviated.setText(megaPixelModels.get(position).getMegapixelAbbreviationName());
        holder.imageView.setImageResource(megaPixelModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
       //this tells the recycler view how many items you have in total
        return megaPixelModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //pulling views from our recycler_view_row layout file
        //similar to the onCreate method

        ImageView imageView;
        TextView tvFullName, tvNumberName, tvAbbreviated;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvFullName = itemView.findViewById(R.id.textView);
            tvNumberName = itemView.findViewById(R.id.textView2);
            tvAbbreviated = itemView.findViewById(R.id.textView3);
        }
    }
}
