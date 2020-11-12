package com.example.dictionary1;

import android.app.Application;
import android.content.Context;

public class WordsApplication extends Application {
    private static Context context;
    public static Context getContext(){
        System.out.println("运行WordsApplication.context"+WordsApplication.context);
        return WordsApplication.context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        WordsApplication.context= context.getApplicationContext();
    }
}
