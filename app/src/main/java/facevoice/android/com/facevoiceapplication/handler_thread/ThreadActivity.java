package facevoice.android.com.facevoiceapplication.handler_thread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import facevoice.android.com.facevoiceapplication.R;

public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
    }
}


/**
 * 1、newCachedThreadPool 方法，
 * 它创建了一个可缓存的线程池，如果线程池的长度超过处理需要，它可灵活回收空闲线程，若无可回收，则新建线程。
 * <p>
 * 2、newScheduledThreadPool 方法，
 * 它创建了一个定长线程池，支持定时及周期性的任务执行。
 * <p>
 * 3、newFixedThreadPool 方法，
 * 它创建了一个定长线程池，可以控制线程最大并发数，超出的线程会在队列中等待。
 * <p>
 * 4、newSingleThreadExecutor 方法，
 * 它创建了一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有的任务按照指定的顺序(FIFO, LIFO, 优先级)来执行的。
 */

class XianChengOperations {

    private void myExecutors() {
        /**
         * 缓存的线程池
         * 创建一个可以缓存的线程池，如果线程池的长度超过了处理需要的话，
         * 它可灵活的回收空闲的线程，若无可回收的线程，则就新建线程
         */
        ExecutorService cached=Executors.newCachedThreadPool();
        cached.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        /**
         * 线程池它支持定时及周期性的任务执行
         */
        ScheduledExecutorService schedule=Executors.newScheduledThreadPool(3);


        /**
         * 单线程
         */
        ExecutorService newSingle = Executors.newSingleThreadExecutor();
        newSingle.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

        /**
         * 我们一起来创建一个定长的线程池，可以控制线程最大并发数，超出的线程会在队列中等待
         */
        ExecutorService newFixed = Executors.newFixedThreadPool(3);
        newFixed.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

}
