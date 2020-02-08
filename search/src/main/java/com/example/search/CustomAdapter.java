package com.example.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Model> modelList;


    public CustomAdapter(ArrayList<Model> exampleList) {
        modelList = exampleList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ViewHolder evh = new ViewHolder(v);
        return evh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    Model currentItem = modelList.get(position);

    holder.mTitleTv.setText(currentItem.getTitle());
    holder.mDescriptionTv.setText(currentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public void filterList(ArrayList<Model> filteredList){
        modelList = filteredList;
        notifyDataSetChanged();
    }
}
