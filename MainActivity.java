package com.example.mahe.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View view)
    {
        ImageView iv = (ImageView) findViewById(R.id.img_view);
        iv.setImageResource(R.drawable.after_cookie);

         TextView tv = (TextView)  findViewById(R.id.txt_view);
         tv.setText("I'm so full");
    }
}
