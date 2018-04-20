package com.obike.widgets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ScreenRainView srvMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        srvMain = findViewById(R.id.srvMain);
        srvMain.setRainStartPadding(10);
        srvMain.setRainDestroyAfterEnds(false);
        srvMain.setRainMinScale(0.8f);
        srvMain.setRainMaxScale(1.2f);
        srvMain.setRainDuration(2500);
        srvMain.setRainAppearInterval(200);
        srvMain.setRainAppearDuration(1500);
        srvMain.addRaindropImages(R.drawable.pic_vip_bought_gift_orange,
                R.drawable.pic_vip_bought_gift_yellow);
    }

    public void onClick(View v) {
        srvMain.start();
    }
}