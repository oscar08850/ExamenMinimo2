package com.example.examenminimo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InsigniasActivity extends AppCompatActivity {

    ProgressBar progressBar;
    RecyclerView recyclerView;
    TextView name;
    String user = "toni11";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insignias);

        getUsers(user);
        progressBar.setVisibility(View.INVISIBLE);


    }

    private void getUsers(String user) {
        progressBar.setVisibility(View.VISIBLE);

        Call<List<Medalla>> call = ApiClient.getUserService().getInfo();

        call.enqueue(new Callback<List<Medalla>>() {
            @Override
            public void onResponse(Call<List<Medalla>> call, Response<List<Medalla>> response) {
                if (response.code()==201){

                }
            }

            @Override
            public void onFailure(Call<List<Medalla>> call, Throwable t) {

            }
        });


    }
}