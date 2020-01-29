package com.freehdmovies.movies.freehdmovies_network.apis;

import com.freehdmovies.movies.freehdmovies_network.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SignUpApi {

    @GET("signup")
    Call<User> signUp(@Query("api_secret_key") String key,
                      @Query("email") String email, @Query("password") String password, @Query("name") String name);

}
