package com.sherbrooke.paristennis.api;

import com.sherbrooke.paristennis.model.Partie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String URL_BASE = "http://192.168.224.1:3000/parties/";

    @GET(".")
    Call<List<Partie>> getActuelleParties();

    @GET("parties/")
    Call<List<Partie>> getAllParties();
}
