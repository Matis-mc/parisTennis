package com.sherbrooke.paristennis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sherbrooke.paristennis.api.Client;
import com.sherbrooke.paristennis.api.MatchRepository;
import com.sherbrooke.paristennis.model.Partie;
import com.sherbrooke.paristennis.service.MatchService;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import retrofit2.Call;
import retrofit2.Callback;
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



    /**
     * move this in a component available anywhere in the application
     */
    EventSourceListener eventSourceListener = new EventSourceListener() {
        @Override
        public void onClosed(@NotNull EventSource eventSource) {
            super.onClosed(eventSource);
        }

        @Override
        public void onEvent(@NotNull EventSource eventSource, @Nullable String id, @Nullable String type, @NotNull String data) {
            Log.e("data-sse", data);
            super.onEvent(eventSource, id, type, data);
        }

        @Override
        public void onFailure(@NotNull EventSource eventSource, @Nullable Throwable t, @Nullable okhttp3.Response response) {
            super.onFailure(eventSource, t, response);
        }

        @Override
        public void onOpen(@NotNull EventSource eventSource, @NotNull okhttp3.Response response) {
            super.onOpen(eventSource, response);
        }
    };

    OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.MINUTES)
            .writeTimeout(10, TimeUnit.MINUTES)
            .build();

    Request request = new Request.Builder()
            .url("http://192.168.224.1:3000/events")
            .header("Accept", "application/json; q=0.5")
            .addHeader("Accept", "text/event-stream")
            .build();

    Call call = (Call) client.newCall(request);
    Response response;

    {
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}