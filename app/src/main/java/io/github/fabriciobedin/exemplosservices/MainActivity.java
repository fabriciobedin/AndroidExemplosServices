package io.github.fabriciobedin.exemplosservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inicializaStartedService(View view) {
        Intent intent = new Intent(this, StartedService.class);
        startService(intent);
        startService(intent);
        startService(intent);
        startService(intent);
        startService(intent);
    }

    public void finalizaStartedService(View view) {
        Intent intent = new Intent(this, StartedService.class);
        stopService(intent);
    }

    public void inicializaBoundedService(View view) {
    }

    public void chamaIntentService(View view) {
        Intent intent = new Intent(this, ExIntentService.class);
        //ver a fila de intents funcionando
        startService(intent);
        startService(intent);
        startService(intent);
        startService(intent);
        startService(intent);
        finish();
    }
}
