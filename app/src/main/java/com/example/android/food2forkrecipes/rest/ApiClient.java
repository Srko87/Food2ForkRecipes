package com.example.android.food2forkrecipes.rest;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static String BASE_URL ="http://food2fork.com/api/";

    private static Retrofit retrofit;
    private static OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();


    public static Retrofit getClient(){

        OkHttpClient client = httpClientBuilder.build();

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofit;
    }



}