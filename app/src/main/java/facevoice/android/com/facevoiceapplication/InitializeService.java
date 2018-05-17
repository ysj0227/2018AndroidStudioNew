package facevoice.android.com.facevoiceapplication;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by shijie.yang on 2018/5/10.
 */

public class InitializeService extends IntentService {
    private static final String ACTION_INIT_WHEN_APP_CREATE = "com.maweiqi";

    public InitializeService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if (intent!=null){
            final String action=intent.getAction();
            if (ACTION_INIT_WHEN_APP_CREATE.equals(action)) {
                performInit();
            }
        }

    }

    /**
     * 后台预加载
     */
    private void performInit() {

        //操作代码
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, InitializeService.class);
        intent.setAction(ACTION_INIT_WHEN_APP_CREATE);
        context.startService(intent);
    }


}
