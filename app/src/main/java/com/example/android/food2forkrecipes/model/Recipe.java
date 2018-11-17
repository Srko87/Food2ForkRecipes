package com.example.android.food2forkrecipes.model;

import com.google.gson.annotations.SerializedName;

public class Recipe {
    @SerializedName("publisher")
    private String publisher;

    @SerializedName("f2f_url")
    private String f2fUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("recipe_id")
    private String recipeId;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("social_rank")
    private String socialRank;

    @SerializedName("publisher_url")
    private String publisherUrl;


    public Recipe(String publisher, String f2fUrl, String title,String sourceUrl, String recipeId, String imageUrl, String socialRank, String publisherUrl) {

        this.publisher = publisher;
        this.f2fUrl = f2fUrl;
        this.title = title;
        this.sourceUrl = sourceUrl;
        this.recipeId = recipeId;
        this.imageUrl = imageUrl;
        this.socialRank = socialRank;
        this.publisherUrl = publisherUrl;

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getF2fUrl() {
        return f2fUrl;
    }

    public void setF2fUrl(String f2fUrl) {
        this.f2fUrl = f2fUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSocialRank() {
        return socialRank;
    }

    public void setSocialRank(String socialRank) {
        this.socialRank = socialRank;
    }

    public String getPublisherUrl() {
        return publisherUrl;
    }

    public void setPublisherUrl(String publisherUrl) {
        this.publisherUrl = publisherUrl;
    }
}