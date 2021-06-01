package com.example.examenminimo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class PerfilActivity extends AppCompatActivity {

    TextView descripcion;
    ImageView imagen;
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    ProgressBar progressBar;
    List<Medalla> elements;

    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);


    }
}