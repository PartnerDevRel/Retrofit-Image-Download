package com.course.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.course.myapplication.request.RecipeApi;
import com.course.myapplication.request.ServiceGenerator;
import com.course.myapplication.request.responses.RecipeResponse;
import com.course.myapplication.request.responses.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button_clickl);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testRetrofitResponse();
            }
        });
    }


    private void testRetrofitResponse (){
        final RecipeApi receiApi= ServiceGenerator.getRecipeApi();

        Call<RecipeResponse> recipeResponseCall = receiApi.getRecipe(
                "key","47070"
        );

        recipeResponseCall.enqueue(new Callback<RecipeResponse>() {
            @Override
            public void onResponse(Call<RecipeResponse> call, Response<RecipeResponse> response) {
                if (response.code()==200){
                    Log.d("Rohan","the response code title is "+response.body().getRecipe().getTitle());

                }

            }

            @Override
            public void onFailure(Call<RecipeResponse> call, Throwable t) {

            }
        });

    }
}
