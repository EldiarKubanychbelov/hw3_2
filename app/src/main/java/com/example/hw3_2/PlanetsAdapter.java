package com.example.hw3_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class PlanetsAdapter extends RecyclerView.Adapter<PlanetsAdapter.PlanetsViewHolder> {

    String data1[],data2[];
    int images[];
    Context context;

    public PlanetsAdapter (Context ct,String s1[],String s2[],int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }
    @NonNull
    @Override
    public PlanetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
         View view = inflater.inflate(R.layout.item_planets,parent,false);
        return new PlanetsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetsViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class PlanetsViewHolder extends RecyclerView.ViewHolder{

        TextView myText1,myText2;
        ImageView myImage;


        public PlanetsViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage = itemView.findViewById(R.id.imageView);
            myText1 = itemView.findViewById(R.id.item_title_txt);
            myText2 = itemView.findViewById(R.id.item_description_txt);
        }
    }
}
