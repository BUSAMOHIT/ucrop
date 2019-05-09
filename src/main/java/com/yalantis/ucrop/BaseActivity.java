package com.yalantis.ucrop;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
//            Drawable background = getResources().getDrawable(R.drawable.app_gradient);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(getResources().getColor(android.R.color.transparent));
            window.setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.ucrop_color_widget));
//            window.setBackgroundDrawable(background);
        }
        super.onCreate(savedInstanceState);
    }
}
