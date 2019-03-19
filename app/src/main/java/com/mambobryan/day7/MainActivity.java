package com.mambobryan.day7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Declaring the ImageView variable
    ImageView rapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the ImageView variable to image with resource id
        rapper = findViewById(R.id.rapper_image_view);

    }


    public void setImageVisibility(View view) {

        if (rapper.getVisibility() == View.INVISIBLE){
            rapper.setVisibility(View.VISIBLE);
        } else {
            rapper.setVisibility(View.INVISIBLE);
        }


    }
}
