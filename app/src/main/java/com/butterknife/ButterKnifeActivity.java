package com.butterknife;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ButterKnifeActivity extends AppCompatActivity {
    @BindView(R.id.text_one)
    TextView textOne;

    @BindView(R.id.text_two)
    TextView textTwo;


    @BindView(R.id.image)
    ImageView image;

    @BindString(R.string.app_name)
    String appName;

    @BindDrawable(R.drawable.ic_launcher)
    Drawable launchIcon;

    @BindColor(R.color.colorAccent)
    int accent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        ButterKnife.bind(this);

        // using views
        textOne.setText(R.string.string_one);
        textTwo.setText(appName);
        image.setImageDrawable(launchIcon);
        textTwo.setTextColor(accent);
    }

}
