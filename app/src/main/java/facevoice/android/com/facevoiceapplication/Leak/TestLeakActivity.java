package facevoice.android.com.facevoiceapplication.Leak;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.squareup.leakcanary.RefWatcher;

import facevoice.android.com.facevoiceapplication.MainActivity;
import facevoice.android.com.facevoiceapplication.R;

/**
 * Created by shijie.yang on 2018/4/8.
 */

public class TestLeakActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LeakThread leakThread = new LeakThread();
        leakThread.start();

        startActivity(new Intent(TestLeakActivity.this, MainActivity.class));





    }

    class LeakThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(6 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    class test {

    }

    @Override
    protected void onPause() {
        super.onPause();
    }








}
