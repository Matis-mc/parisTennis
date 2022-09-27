package com.sherbrooke.paristennis.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.sherbrooke.paristennis.api.Client;
import com.sherbrooke.paristennis.model.Partie;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MatchRepository {

    private static MatchRepository instance;
    MutableLiveData<List<Partie>> parties;

    private MatchRepository(){

    }

    public static MatchRepository getInstance(){
        if(instance == null){
            instance = new MatchRepository();
        }
        return instance;
    }

    /**
     * move this in a component available anywhere in the application
     */
    public MutableLiveData<List<Partie>> getParties(){
        Call<List<Partie>> call = Client.getInstance().getApi().getActuelleParties();
        call.enqueue(new Callback<List<Partie>>() {
            @Override
            public void onResponse(Call<List<Partie>> call, Response<List<Partie>> response) {
                Log.e("Callback", response.body().toString());
                parties.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Partie>> call, Throwable t) {
                //Toast.makeText(context, "An error has occured", Toast.LENGTH_LONG).show();
            }
        });
        return parties;
    }


}
