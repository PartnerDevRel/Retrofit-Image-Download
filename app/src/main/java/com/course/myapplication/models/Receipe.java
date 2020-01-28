package com.course.myapplication.models;

import java.util.Arrays;

public class Receipe {
    private String title;
    private String publisher;
    private String [] ingredients;
    private String  receipe_id;

    public Receipe(String title, String publisher, String[] ingredients, String receipe_id, String image_url, float social_rank) {
        this.title = title;
        this.publisher = publisher;
        this.ingredients = ingredients;
        this.receipe_id = receipe_id;
        this.image_url = image_url;
        this.social_rank = social_rank;
    }

    private String image_url;
    private float social_rank;


    public Receipe() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getReceipe_id() {
        return receipe_id;
    }

    public void setReceipe_id(String receipe_id) {
        this.receipe_id = receipe_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public float getSocial_rank() {
        return social_rank;
    }

    public void setSocial_rank(float social_rank) {
        this.social_rank = social_rank;
    }

    @Override
    public String toString() {
        return "Receipe{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", receipe_id='" + receipe_id + '\'' +
                ", image_url='" + image_url + '\'' +
                ", social_rank=" + social_rank +
                '}';
    }
}
