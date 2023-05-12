package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    final ArrayList<DataModel>datalist;

    public RecyclerViewAdapter(ArrayList<DataModel> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rc_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
    DataModel dm = datalist.get(position);
    holder.tv.setText(dm.text);
    holder.im.setImageResource(dm.images);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView tv;
            public ImageView im;

        public ViewHolder(@NonNull View view){
            super(view);
            tv=view.findViewById(R.id.tx);
            im=view.findViewById(R.id.image);

        }
    }
}

