package com.sherbrooke.paristennis.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MatchService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //If a component calls bindService() to create the service and onStartCommand() is not called, the service runs only as long as the component is bound to it. After the service is unbound from all of its clients, the system destroys it.
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.e("Service", "service is started");
        return START_NOT_STICKY;
    }

    @Override
    public void onCreate(){

    }

    @Override
    public void onDestroy(){

    }
}
