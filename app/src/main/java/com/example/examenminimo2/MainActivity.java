package com.example.examenminimo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void perfilButton(View view) {

        Intent intent = new Intent(this, PerfilActivity.class);
        startActivity(intent);
    }


    public void insigniasButton(View view) {

        Intent intent = new Intent(this, InsigniasActivity.class);
        startActivity(intent);
    }


}