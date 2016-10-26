package io.github.fabriciobedin.exemplosservices;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private BoundedService.MeuBinder meuBinder;

    private TextView txtNrSorteado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNrSorteado = (TextView) findViewById(R.id.txtNrSorteado);
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
        Intent intent = new Intent(this, BoundedService.class);

        ServiceConnection serviceConnection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                //elo criado
                meuBinder = (BoundedService.MeuBinder)iBinder;
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
                //elo quebrado
            }
        };


        //o Service connection é uma especie de integer pra saber se o elo está ativo
        bindService(intent, serviceConnection, Service.BIND_AUTO_CREATE);
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

    public void ramdomNumber(View view) {
       txtNrSorteado.setText("Numero Sorteado: " + meuBinder.ownerService().randomNumber());
    }
}
