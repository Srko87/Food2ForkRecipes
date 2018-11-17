package com.example.android.food2forkrecipes.rest;


import com.example.android.food2forkrecipes.model.Recipes;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("search/?key=291b7e7495709e9263fc1df6f88b0612")
    Call<Recipes> getRecipes();
}