package com.sherbrooke.paristennis.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sherbrooke.paristennis.model.Partie;
import com.sherbrooke.paristennis.repository.MatchRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Partie>> parties = new MutableLiveData<List<Partie>>();;

    public MutableLiveData<List<Partie>> getParties(){
           return loadParties();
    }

    private MutableLiveData<List<Partie>> loadParties(){
        return MatchRepository.getInstance().getParties();
    }
}
