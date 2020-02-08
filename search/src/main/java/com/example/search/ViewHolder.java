package com.example.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView mTitleTv, mDescriptionTv;

    public ViewHolder(View itemView) {
        super(itemView);
        mTitleTv = (TextView) itemView.findViewById(R.id.text_view_title);
        mDescriptionTv = (TextView) itemView.findViewById(R.id.text_view_description);
    }
}