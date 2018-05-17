package facevoice.android.com.facevoiceapplication.Leak;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by shijie.yang on 2018/4/8.
 */

public class LeakApplication extends Application {
//    private RefWatcher refWatcher;

//    @Override
//    public void onCreate() {
//        super.onCreate();
//        LeakCanary.install(this);
//        refWatcher = setupLeakCanary();
//    }

//    private RefWatcher setupLeakCanary() {
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            return RefWatcher.DISABLED;
//        }
//        return LeakCanary.install(this);
//    }
//
//    public static RefWatcher getRefWatcher(Context context) {
//        LeakApplication leakApplication = (LeakApplication) context.getApplicationContext();
//        return leakApplication.refWatcher;
//    }


    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        if (context == null) {
            context = getApplicationContext();
        }
    }

    private static Context getContext() {
        return context;
    }


}