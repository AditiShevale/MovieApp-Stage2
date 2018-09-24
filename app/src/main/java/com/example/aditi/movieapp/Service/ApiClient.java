package com.example.aditi.movieapp.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    final static String MOVIE_DB_URL = "http://api.themoviedb.org/3/";
    final static String API_KEY = "api_key";
    public static String api_key = "00bab64ed019eded1ab3d951af1bb2a0";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(MOVIE_DB_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
