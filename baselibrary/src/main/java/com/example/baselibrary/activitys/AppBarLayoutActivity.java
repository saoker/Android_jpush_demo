package com.example.baselibrary.activitys;

import android.os.Bundle;
import android.util.Log;

import com.example.baselibrary.Base.BaseActivity;
import com.example.baselibrary.Net.InterfaceReTrofits;
import com.example.baselibrary.Net.RetrofitRequest;
import com.example.baselibrary.R;
import com.example.baselibrary.Test.TestClass;
import com.google.gson.JsonObject;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.example.baselibrary.activitys
 * PROJECT_NAME Soker
 * DATE  2018/4/2 15:58
 */

public class AppBarLayoutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);

        TestClass.testEqualAndDenghao();

    }

}
