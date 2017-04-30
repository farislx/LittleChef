package com.example.mactolab.littlechef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mactolab.littlecheff.R;

/**
 * Created by Mactolab on 3/30/2017.
 */
public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        ImageView img=(ImageView)findViewById(R.id.imgmenu);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MenuActivity.class);
                String resp="[{\"name\":\"Chicken fry\"},{\"name\":\"Chicken Broast\"},{\"name\":\"Chicken Curry\"}," +
                        "{\"name\":\"Chilly Chicken\"}]";
                intent.putExtra("response",resp);
                startActivity(intent); }
        });
    }

}
