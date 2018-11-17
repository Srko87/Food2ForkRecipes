package com.example.android.food2forkrecipes.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.android.food2forkrecipes.R;
import com.example.android.food2forkrecipes.model.Recipe;
import com.example.android.food2forkrecipes.model.Recipes;


import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyviewHolder> {

    Context context;
    List<Recipe> recipeList;

    public RecyclerAdapter(Context context, Recipes recipeList) {
        this.context = context;
        this.recipeList = recipeList.getRecipeArrayList();
    }

    public void setRecipeList(Recipes recipeList) {
        this.recipeList = recipeList.getRecipeArrayList();
        notifyDataSetChanged();
    }

    @Override
    public RecyclerAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_adapter,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyviewHolder holder, int position) {
        holder.recipeName.setText(recipeList.get(position).getTitle());
        holder.recipeRank.setText("Social rank: " + recipeList.get(position).getSocialRank());
        Glide.with(context).load(recipeList.get(position).getImageUrl()).apply(RequestOptions.centerCropTransform()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        if(recipeList != null){
            return recipeList.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView recipeName;
        ImageView image;
        TextView recipeRank;

        public MyviewHolder(View itemView) {
            super(itemView);
            recipeName = (TextView)itemView.findViewById(R.id.textViewRecipeName);
            image = (ImageView)itemView.findViewById(R.id.imageRecipeImage);
            recipeRank = (TextView)itemView.findViewById(R.id.textViewRecipeRank);
        }
    }
}