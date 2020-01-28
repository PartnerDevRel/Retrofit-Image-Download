package com.course.myapplication.request;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*whole code is from https://square.github.io/retrofit/*/
public class ServiceGenerator {
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://recipesapi.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static RecipeApi recipeApi =retrofit.create(RecipeApi.class);
    //How to access the private retrofit instance from other activities , check the following code
    public static RecipeApi getRecipeApi(){
        return recipeApi;
    }

}
