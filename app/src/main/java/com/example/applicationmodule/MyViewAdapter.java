package com.example.applicationmodule;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyViewAdapter extends RecyclerView.Adapter<MyViewAdapter.myviewholder> {

    List<ApplicationModel> data;

    public MyViewAdapter(List<ApplicationModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        //holder.upfill.setText(data.get(position).getUserId());
       // holder.tofill.setText(data.get(position).getId());
           //  holder.descrptionfill.setText(data.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        EditText descrptionfill,tofill,upfill;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            upfill =(EditText) itemView.findViewById(R.id.upfill);
            tofill =(EditText)itemView.findViewById(R.id.tofill);
            descrptionfill =(EditText) itemView.findViewById(R.id.descrptionfill);


        }
    }
}
