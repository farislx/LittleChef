package Utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mactolab on 10/4/2016.
 */

public  class SqlHelper  extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 4;

    // Database Name
    private static final String DATABASE_NAME = "littlecheff.db";

    public SqlHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here

        String CREATE_TblFoods = "CREATE TABLE TblFoods(FoodID INTEGER PRIMARY KEY AUTOINCREMENT ," +
                "FoodCode TEXT,FoodName TEXT,FoodPrice  TEXT )";

        db.execSQL(CREATE_TblFoods);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS TblFoods");

        // Create tables again
        onCreate(db);

    }

}