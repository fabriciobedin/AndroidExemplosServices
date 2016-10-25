package io.github.fabriciobedin.exemplosservices;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by fabricio on 25/10/2016.
 */

public class ExIntentService extends IntentService {


    public ExIntentService() {
        super("ExIntentService");
    }

    //controla e trata cada intent da fila
    @Override
    protected void onHandleIntent(Intent intent) {
        //cria uma thread para cada um que chama ele
        //apenas o intent service não precisa

        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Log.e("SERVICES", "saindo do onHandleIntent IntentService");

    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("SERVICES", "onCreate IntentService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("SERVICES", "onDestroy IntentService");
    }
}
