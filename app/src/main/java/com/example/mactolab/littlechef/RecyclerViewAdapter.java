package com.example.mactolab.littlechef;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mactolab.littlecheff.R;

import java.util.ArrayList;

import Models.FoodItem;

/**
 * Created by Mactolab on 10/4/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private ArrayList<FoodItem>  mDataset;

    private Context context;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public RecyclerViewAdapter(Context context, ArrayList<FoodItem> itemList) {
        this.mDataset = itemList;
        this.context = context;
    }

    // Provide a suitable constructor (depends on the kind of dataset)


    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerViewHolders  onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View layoutView = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.billing_activity, parent, false);
        // set the view's size, margins, paddings and layout parameters
       // ...
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
       holder.foodItem.setText(mDataset.get(position).getfoodItemName());
        holder.foodPrice.setText("Price:"+mDataset.get(position).getfoodItemPrice());
       holder.foodPhoto.setImageResource(mDataset.get(position).getPhotoId());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
