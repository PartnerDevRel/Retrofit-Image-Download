package com.course.myapplication.request.responses;

import com.course.myapplication.models.Receipe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeSearchResponse {

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("recipes")
    @Expose
    private List<Receipe> list_recipes;

    public int getCount() {
        return count;
    }

    public List<Receipe> getList_recipes() {
        return list_recipes;
    }
}
