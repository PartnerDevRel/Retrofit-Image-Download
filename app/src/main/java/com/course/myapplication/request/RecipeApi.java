package com.course.myapplication.request;

import com.course.myapplication.request.responses.RecipeResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {
    @GET("api/get")
    Call<RecipeResponse> getRecipe(
            @Query("key") String key,
            @Query("rId") String recipe_id
    );

    @GET("api/search")
    Call<RecipeResponse> searchRecipe(
            @Query("key") String key,
            @Query("q")String dishSearch,
            @Query("page") String page
            );
}
