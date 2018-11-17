package com.example.android.food2forkrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;


import com.example.android.food2forkrecipes.model.Recipes;
import com.example.android.food2forkrecipes.rest.ApiClient;
import com.example.android.food2forkrecipes.rest.ApiInterface;
import com.example.android.food2forkrecipes.view.RecyclerAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    Recipes recipeList;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    RelativeLayout progressLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recipeList = new Recipes();
        recyclerView = findViewById(R.id.recyclerview);
        progressLayout = findViewById(R.id.progressLayout);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(getApplicationContext(), recipeList);
        recyclerView.setAdapter(recyclerAdapter);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Recipes> call = apiService.getRecipes();
        call.enqueue(new Callback<Recipes>() {
            @Override
            public void onResponse(Call<Recipes> call, Response<Recipes> response) {
                recipeList = response.body();
                Log.d("TAG", "Response = " + recipeList);
                recyclerAdapter.setRecipeList(recipeList);
                recyclerAdapter.notifyDataSetChanged();
                progressLayout.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFailure(Call<Recipes> call, Throwable t) {
                Log.d("TAG","Responseshit = "+ t.toString());
            }
        });
    }
}
