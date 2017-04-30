package Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Mactolab on 3/12/2017.
 */
public class FoodItem {
    private int foodItemId;

    public int getFoodItemId()
    {
        return foodItemId;
    }
    public void setFoodItemId(int foodItemId)
    {
         foodItemId=foodItemId;
    }
    private  String foodItemName;

    public String getfoodItemName()
    {
        return foodItemName;
    }
    public void setfoodItemName(int foodItemName)
    {
         foodItemName=foodItemName;
    }
    private float foodItemPrice;

    public float getfoodItemPrice()
    {
        return foodItemPrice;
    }
    public void setfoodItemPrice(float foodItemPrice)
    {
         foodItemPrice=foodItemPrice;
    }
    private int photoId;
    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
    public int getPhotoId() {
        return photoId;
    }
    public FoodItem(int foodItemId,String foodItemName,float foodItemPrice,int photoId)
    {
        this.foodItemId=foodItemId;
        this.foodItemName=foodItemName;
        this.foodItemPrice=foodItemPrice;
        this.photoId = photoId;

    }
    public FoodItem(JSONObject object){
        try {
            this.foodItemName = object.getString("name");
            this.foodItemPrice = 90;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    // Factory method to convert an array of JSON objects into a list of objects
    // User.fromJson(jsonArray);
    public static ArrayList<FoodItem> fromJson(JSONArray jsonObjects) {
        ArrayList<FoodItem> foods = new ArrayList<FoodItem>();
        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                foods.add(new FoodItem(jsonObjects.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return foods;
    }

}
