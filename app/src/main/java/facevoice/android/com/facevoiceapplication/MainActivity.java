package facevoice.android.com.facevoiceapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import facevoice.android.com.facevoiceapplication.utils.AESUtil;

public class MainActivity extends Activity {
    private FloatingActionButton floatingActionButton;
    String imageUri = "http://pic5.photophoto.cn/20071020/0034034881477679_b.jpg";
    String gifUrl = "http://p1.pstatp.com/large/166200019850062839d3";

    private int aa=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", "*************************************");
        Log.i("TAG", AESUtil.getAESEncode("000000"));
        Log.i("TAG", AESUtil.getDecodeString(AESUtil.getAESEncode("000000")));


//        Button add = findViewById(R.id.buttonAdd);
//        Button query = findViewById(R.id.buttonQuery);
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//        query.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });





    }

//    private void loadPicture() {
//        final ImageView imageView = findViewById(R.id.image);
//        Button btnGlide = findViewById(R.id.btnGlide);
//        Button btnPicasso = findViewById(R.id.btnPicasso);
//
//        /*
//        Glide
//         */
//        btnGlide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                RequestOptions options = new RequestOptions();
//                options.placeholder(R.mipmap.ic_launcher);//预加载图片
//                options.error(R.mipmap.ic_launcher);//图片加载错误时显示的图片
//                options.priority(Priority.HIGH);
//
//                Glide.with(MainActivity.this)
//                        .load(imageUri)
//                        .apply(options)
//                        .into(imageView);
//            }
//        });
//
//        /*
//        Picasso
//         */
//        btnPicasso.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Picasso.get()
//                        .load(imageUri)
//                        .into(imageView);
//            }
//        });
//    }

    private void xiancehng() {
        ExecutorService newSingle = Executors.newSingleThreadExecutor();
        newSingle.execute(new Runnable() {
            @Override
            public void run() {
                Log.i("TAG", "*************");
            }
        });

        newSingle.submit(new Runnable() {
            @Override
            public void run() {
                Log.i("TAG", "###############");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "*************onStart()    ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "*************onRestart()    ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "*************onResume()    ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "*************onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "################ onDestroy()");
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.i("TAG", "*************onSaveInstanceState()");
//        aa=99;
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        Log.i("TAG", "*************onRestoreInstanceState()");
//    }


    private void test(){
        List<String> list= new ArrayList<>();
        List<String> list1=new LinkedList<>();
    }

}
