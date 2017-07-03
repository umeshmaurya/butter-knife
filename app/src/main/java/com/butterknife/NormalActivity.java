package com.butterknife;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {
    TextView textOne;
    TextView textTwo;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        textOne= (TextView) findViewById(R.id.text_one);
        textTwo= (TextView) findViewById(R.id.text_two);
        image= (ImageView) findViewById(R.id.image);

        textOne.setText(this.getResources().getString(R.string.string_one));
        textTwo.setText(this.getResources().getString(R.string.app_name));

        image.setImageDrawable(this.getResources().getDrawable(R.drawable.ic_launcher));
        textTwo.setTextColor(this.getResources().getColor(R.color.colorAccent));
    }
}
