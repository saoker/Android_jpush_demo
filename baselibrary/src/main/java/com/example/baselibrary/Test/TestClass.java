package com.example.baselibrary.Test;

import android.util.Log;

import com.example.baselibrary.Net.RetrofitRequest;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.example.baselibrary.Test
 * PROJECT_NAME Soker
 * DATE  2018/4/9 13:39
 */

public class TestClass {

    public static void testEqualAndDenghao() {
        Integer i = 9, j = 9;
        Log.w("test", "int == " + (i == j)); //true
        Log.w("test", "int equal " + i.equals(j)); //true

        String name1 = "asd";
        String name2 = "asd";
        Log.w("test", "String == " + (name1 == name2)); //true
        Log.w("test", "String equal " + name1.equals(name2)); //true
        Log.w("test", "String hashcode " + " , name1 = " + name1.hashCode()
                + " , name2 = " + name2.hashCode()); //same

        RetrofitRequest js1 = new RetrofitRequest();
        RetrofitRequest js2 = new RetrofitRequest();
        Log.w("test", "JsonObject == " + (js1 == js2)); //false
        Log.w("test", "JsonObject equal " + js1.equals(js2)); //false
        Log.w("test", "JsonObject hashcode " + " , js1 = " + js1.hashCode()
                + " , js2 = " + js2.hashCode()); // unsame

        js2 = js1;

        Log.w("test", "yinyong == " + (js1 == js2));  //true
        Log.w("test", "yinyong equal " + js1.equals(js2)); //true
        Log.w("test", "yinyong hashcode " + " , js1 = " + js1.hashCode()
                + " , js2 = " + js2.hashCode());  //same
    }
}
