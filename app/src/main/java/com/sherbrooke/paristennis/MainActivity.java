package com.sherbrooke.paristennis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sherbrooke.paristennis.api.Client;
import com.sherbrooke.paristennis.model.Partie;
import com.sherbrooke.paristennis.service.MatchService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

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
                getParties();
            }
        });
    }

    /**
     * move this in a component available anywhere in the application
     */
    public void getParties(){
        Call<List<Partie>> call = Client.getInstance().getApi().getActuelleParties();
        call.enqueue(new Callback<List<Partie>>() {
            @Override
            public void onResponse(Call<List<Partie>> call, Response<List<Partie>> response) {
                Log.e("Callback", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<Partie>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}