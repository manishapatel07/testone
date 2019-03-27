package com.example.rahul.activitylife;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;

public class MainActivity extends AppCompatActivity {
public static final String TAG="TEST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"OnCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"OnPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"OnStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ONDestroy called");
    }
}

