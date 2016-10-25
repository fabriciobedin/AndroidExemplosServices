package io.github.fabriciobedin.exemplosservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by fabricio on 25/10/2016.
 */

public class BoundedService extends Service {

    public class MeuBinder extends Binder {

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MeuBinder();
    }
}
