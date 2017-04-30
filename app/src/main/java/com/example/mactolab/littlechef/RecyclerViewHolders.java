package com.example.mactolab.littlechef;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mactolab.littlecheff.R;

/**
 * Created by Mactolab on 3/27/2017.
 */
public class RecyclerViewHolders extends RecyclerView.ViewHolder{

    public TextView foodItem;
    public TextView foodPrice;
    public ImageView foodPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);

        foodItem = (TextView)itemView.findViewById(R.id.tvFoodItem);
        foodPrice = (TextView)itemView.findViewById(R.id.tvFoodPrice);
        foodPhoto = (ImageView)itemView.findViewById(R.id.cvFoodPhoto);
    }

}