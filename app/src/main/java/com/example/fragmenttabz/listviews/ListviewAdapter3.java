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

public class ListviewAdapter3 extends RecyclerView.Adapter<ListviewAdapter3.MyViewHolder> {
    private Context context;
    private List arraylist;
    @NonNull
    @Override
    public ListviewAdapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab3recy, parent, false);
        return new ListviewAdapter3.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewAdapter3.MyViewHolder holder, int position) {
        holder.EName3.setText(Datas.name[position]);
        holder.imageView3.setImageResource(Datas.picture[position]);
    }

    @Override
    public int getItemCount() {
        return Datas.name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView EName3;
        public ImageView imageView3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            EName3 = itemView.findViewById(R.id.txtname3);
            imageView3=itemView.findViewById(R.id.dp3);
        }
    }
}
