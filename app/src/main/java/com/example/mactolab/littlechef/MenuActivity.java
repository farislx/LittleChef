package com.example.mactolab.littlechef;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mactolab.littlecheff.R;

import org.json.JSONArray;

import java.util.ArrayList;

import Models.FoodItem;

public  class  MenuActivity extends AppCompatActivity  {
    private LinearLayoutManager iLayout;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_menu);

        Bundle bundle=getIntent().getExtras();
       String response= bundle.getString("response");
        ArrayList<FoodItem> arrayOfFoods = new ArrayList<FoodItem>();
        try {
           JSONArray jArray = new JSONArray(response);
            arrayOfFoods=    FoodItem.fromJson(jArray);

        }
        catch (Throwable t) {
        }
       // mRecyclerView = (RecyclerView) findViewById(R.id.listmenu);

        //mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        //mLayoutManager = new LinearLayoutManager(this);
        //mRecyclerView.setLayoutManager(mLayoutManager);
      //  ItemsAdapter  adapter = new ItemsAdapter(this, arrayOfFoods);

        // specify an adapter (see also next example)
        //mAdapter = new ItemsAdapter(arrayOfFoods);
        //mRecyclerView.setAdapter(mAdapter);



        arrayOfFoods = getAllItemList();

        iLayout = new LinearLayoutManager(MenuActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(iLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MenuActivity.this, arrayOfFoods);
        rView.setAdapter(rcAdapter);
    }
    private ArrayList<FoodItem> getAllItemList(){

        ArrayList<FoodItem> allItems = new ArrayList<FoodItem>();
        allItems.add(new FoodItem(0, "Chicken Broast", 100, R.drawable.face));
        allItems.add(new FoodItem(0, "Mutton Fry", 140, R.drawable.face));
        allItems.add(new FoodItem(0, "Chicken Chilly", 340, R.drawable.face));
        allItems.add(new FoodItem(0, "Fried Rice", 230, R.drawable.face));
        allItems.add(new FoodItem(0, "Kabai", 560, R.drawable.face));
        allItems.add(new FoodItem(0, "Shawai", 220, R.drawable.face));
        allItems.add(new FoodItem(0, "Burgur", 40, R.drawable.face));
        allItems.add(new FoodItem(0, "Cofee",20, R.drawable.face));
        allItems.add(new FoodItem(0, "Tea", 20, R.drawable.face));
        return allItems;
    }

}