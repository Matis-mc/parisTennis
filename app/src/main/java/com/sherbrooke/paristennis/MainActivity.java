package com.sherbrooke.paristennis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.sherbrooke.paristennis.service.MatchService;

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
                Intent intent = new Intent(MainActivity.this, MatchService.class);
                Log.e("MainActivity","start service");
                startService(intent);
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