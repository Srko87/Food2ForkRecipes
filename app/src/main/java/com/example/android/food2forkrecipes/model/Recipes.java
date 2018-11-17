package com.example.android.food2forkrecipes.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Recipes {
    private int count;

    @SerializedName("recipes")
    private ArrayList<Recipe> recipeArrayList;

    public ArrayList<Recipe> getRecipeArrayList() {
        return recipeArrayList;
    }

    public void setRecipeArrayList(ArrayList<Recipe> recipeArrayList) {
        this.recipeArrayList = recipeArrayList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
