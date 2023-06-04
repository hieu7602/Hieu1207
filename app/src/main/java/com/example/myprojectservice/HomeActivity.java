package com.example.myprojectservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class HomeActivity extends AppCompatActivity {

    private static final String STATE = "Trạng thái";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        super.onResume();
        Log.e(STATE, "onCrate");

    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.e(STATE, "onResume");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.e(STATE, "onStop");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.e(STATE, "onDestroy");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(STATE, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);

        Log.e(STATE, "onSaveInstanceState");
    }
}
