package com.example.macbook.lookingbaru.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.macbook.lookingbaru.R;

import gr.net.maroulis.library.EasySplashScreen;

/**
 * Created by Macbook on 5/21/2017.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(LoginActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#26ae90"))
                .withLogo(R.drawable.logo)
                .withHeaderText("Selamat Datang")
                .withFooterText("Copyrigth 2017");
        //set Text color
        config.getHeaderTextView().setTextColor(android.graphics.Color.WHITE);
        config.getFooterTextView().setTextColor(android.graphics.Color.WHITE);

        //set to view
        View view = config.create();

        //set view to content view
        setContentView(view);
    }
}





