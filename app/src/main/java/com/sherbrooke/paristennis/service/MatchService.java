package com.sherbrooke.paristennis.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.sherbrooke.paristennis.api.MatchRepository;
import com.sherbrooke.paristennis.model.Partie;

import java.util.HashMap;

public class MatchService {

    private static MatchService instance;

    private HashMap<Partie, Long> allParties;
    private HashMap<Partie, Long> finishededParties;
    private HashMap<Partie, Long> currentParties;
    private HashMap<Partie, Long> futureParties;


    public void getAllParties(){
        MatchRepository.getInstance().getParties();
    }

    public void refreshCurrentParties(){

    }

    public void refreshPartie(Long id){
        
    }

    private MatchService(){
    }

    public MatchService getInstance(){
        if(instance == null){
            instance = new MatchService();
        }
        return instance;
    }


}
