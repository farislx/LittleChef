package com.example.mactolab.littlechef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.mactolab.littlecheff.R;

import org.json.JSONObject;


/**
 * Created by Mactolab on 10/30/2016.
 */
public class LoginActivity extends Activity implements android.view.View.OnClickListener,Response.Listener<JSONObject>,Response.ErrorListener {
    Button btnLogin;
    EditText mTxtDisplay;
    String url = "https://httpbin.org/get";
//faris
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        mTxtDisplay = (EditText) findViewById(R.id.txtUsername);

        btnLogin.setOnClickListener(this);
        ((Button) findViewById(R.id.btnCancel)).setOnClickListener(this);
    }
    @Override
    public void onErrorResponse(VolleyError error) {
        // TODO Auto-generated method stub

    }    @Override
    public void onResponse(JSONObject response) {

        Intent intent = new Intent(this,MenuActivity.class);
        String resp="[{\"name\":\"Chicken fry\"},{\"name\":\"Chicken Broast\"},{\"name\":\"Chicken Curry\"}," +
                "{\"name\":\"Chilly Chicken\"}]";
        intent.putExtra("response",resp);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        if (view == findViewById(R.id.btnLogin)) {

            Intent intent = new Intent(this,StartActivity.class);
            startActivity(intent);

            //JsonObjectRequest jsObjRequest = new JsonObjectRequest(Request.Method.GET,url,this,this);

          // HttWebRequest.getInstance(this).addToRequestQueue(jsObjRequest);
   }
        if (view == findViewById(R.id.btnCancel))
        {
        }
    }
}