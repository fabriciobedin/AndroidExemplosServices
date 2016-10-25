package io.github.fabriciobedin.exemplosservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by fabricio on 25/10/2016.
 */

public class StartedService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //o int retornado serve pra fazer o teste
        Log.e("SERVICES", "onStartCommand StartedService");
        return Service.START_STICKY;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("SERVICES", "onCreate StartService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("SERVICES", "onDestroy StartService");
    }
}
