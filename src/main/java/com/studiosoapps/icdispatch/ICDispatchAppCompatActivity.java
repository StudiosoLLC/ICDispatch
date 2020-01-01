/*
 * Copyright (c) Studioso Inc if you are in positon of this material with proper explicit permissions for Studioso Inc then you must destroy this property on your machine
 */

package com.studiosoapps.icdispatch;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by johanrisch on 6/21/13.
 */
public class ICDispatchAppCompatActivity extends AppCompatActivity {
    protected static ICDispatch sICDispatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sICDispatch = new ICDispatch();
        initICDispatch();
        sICDispatch.initICDispatch();
    }
    public static boolean executeOn(int queue, ICBlock block){
        return sICDispatch.executeOn(queue,block);
    }
    public static boolean executeMethodOn(int queue,Object instance, String methodName, Object... args) throws NoSuchMethodException{
        return sICDispatch.executeMethodOn(queue,instance,methodName,args);
    }
    /**
     * Override this method if you want to initialize {@link ICDispatch} with custom params.
     * 
     */
    protected void initICDispatch(){
        
    }
}
