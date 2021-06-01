package com.example.examenminimo2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//BASE URL :  https://api.github.com/users/JLOPEZR

public interface UserService {

    //Badges
    @GET("/badges")
    Call<List<Medalla>> getInfo();


    //Badges de un User
    @GET("/users/{user}")
    Call<User> getLanguage(@Path("user") String name);


}