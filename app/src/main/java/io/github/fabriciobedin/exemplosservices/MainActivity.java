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
    }

    public void finalizaStartedService(View view) {
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
