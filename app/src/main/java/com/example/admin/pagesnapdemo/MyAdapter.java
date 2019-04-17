package com.example.admin.pagesnapdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> mData;
    private LayoutInflater mInflater;
    private Context mContext;

    MyAdapter(Context context, ArrayList<String> data) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.list_item_view, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int index) {
        myViewHolder.idTvListItem.setText(mData.get(index));
        if (index % 6 == 0) {
            myViewHolder.idCvParentCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorMint));
        } else if (index % 5 == 0) {
            myViewHolder.idCvParentCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorLime));
        } else if (index % 4 == 0) {
            myViewHolder.idCvParentCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorCoral));
        } else if (index % 3 == 0) {
            myViewHolder.idCvParentCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorLily));
        } else if (index % 2 == 0) {
            myViewHolder.idCvParentCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorBlush));
        } else {
            myViewHolder.idCvParentCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView idTvListItem;
        CardView idCvParentCard;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            idTvListItem = itemView.findViewById(R.id.idTvListItem);
            idCvParentCard = itemView.findViewById(R.id.idCvParentCard);
        }
    }
}
