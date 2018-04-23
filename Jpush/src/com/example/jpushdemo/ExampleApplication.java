package com.example.jpushdemo;

import android.content.Context;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * For developer startup JPush SDK
 * 
 * 一般建议在自定义 Application 类里初始化。也可以在主 Activity 里。
 */
public class ExampleApplication {
    private static final String TAG = "JIGUANG-Example";

    public static void  init(Context context) {
    	 Log.d(TAG, "[ExampleApplication] onCreate");
         JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
         JPushInterface.init(context);     		// 初始化 JPush
    }
}
