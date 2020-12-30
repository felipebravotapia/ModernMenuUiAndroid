package com.smartlocation.menuui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    Animation atg, atgtwo;
    ImageView logo;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);

        logo = findViewById(R.id.logo);
        ll = findViewById(R.id.Ll);

        logo.startAnimation(atg);
        ll.startAnimation(atgtwo);

    }
}