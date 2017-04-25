package yixingu.koudaiweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by likaisong on 17-4-25.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
