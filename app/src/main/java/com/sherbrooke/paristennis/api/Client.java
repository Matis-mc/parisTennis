package com.sherbrooke.paristennis.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static Client instance = null;
    private Api api;

    private Client(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(Api.class);
    }

    public static synchronized Client getInstance() {
        if(instance == null){
            instance = new Client();
        }
        return instance;
    }

    public Api getApi(){
        return api;
    }
}
