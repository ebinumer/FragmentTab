package com.example.fragmenttabz.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmenttabz.Datas;
import com.example.fragmenttabz.R;

import java.util.List;

public class ListviewAdapter1 extends RecyclerView.Adapter<ListviewAdapter1.MyViewHolder> {

    private Context context;
    private List arraylist;



    @NonNull
    @Override
    public ListviewAdapter1.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab1_recy, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewAdapter1.MyViewHolder holder, int position) {

        holder.EName.setText(Datas.name[position]);
        holder.imageView.setImageResource(Datas.picture[position]);



    }

    @Override
    public int getItemCount() {
        return Datas.name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView EName;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            EName = itemView.findViewById(R.id.txtname);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}