package com.sherbrooke.paristennis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.sherbrooke.paristennis.repository.MatchRepository;
import com.sherbrooke.paristennis.viewModel.MainActivityViewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import retrofit2.Call;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private Button button;

    public void init(){
        button = findViewById(R.id.start);
        startServiceOnClick();
    }

    public void startServiceOnClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchRepository.getInstance().getParties();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        MainActivityViewModel model = new ViewModelProvider(this).get(MainActivityViewModel.class);
        model.getParties().observe(this, parties -> {
            parties.forEach(partie -> {
                Log.e("", partie.toString());
            });
        });
    }
}