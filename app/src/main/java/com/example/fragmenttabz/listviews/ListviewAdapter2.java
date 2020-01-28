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

public class ListviewAdapter2 extends RecyclerView.Adapter<ListviewAdapter2.MyViewHolder2> {
    private Context context;
    private List arraylist;

    @NonNull
    @Override
    public ListviewAdapter2.MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab2_recy, parent, false);
        return new MyViewHolder2(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewAdapter2.MyViewHolder2 holder, int position) {
        holder.EName2.setText(Datas.name[position]);
        holder.imageViewpro2.setImageResource(Datas.picture[position]);
        holder.imageView2.setImageResource(Datas.picuplod[position]);

    }

    @Override
    public int getItemCount() {
        return Datas.name.length;
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        public TextView EName2;
        public ImageView imageView2,imageViewpro2;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            EName2=itemView.findViewById(R.id.txtname2);
            imageView2=itemView.findViewById(R.id.imageview2);
            imageViewpro2=itemView.findViewById(R.id.imageViewpro2);
        }
    }
}
