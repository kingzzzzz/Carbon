package com.hamzah.android.carbon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opencarbon(View view) {
        Log.i("clicks", "You Clicked 1");
        Intent i = new Intent(MainActivity.this, Carboncalc.class);
        startActivity(i);
        }

}