package com.dyn.android.first.soker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.baselibrary.activitys.AppBarLayoutActivity;
import com.example.jpushdemo.ExampleApplication;


public class SokerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);
        ExampleApplication.init(this);

        startActivity(new Intent(this, AppBarLayoutActivity.class));

    }
}


