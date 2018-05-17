package facevoice.android.com.facevoiceapplication.animation;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

import facevoice.android.com.facevoiceapplication.R;

/**
 * Created by shijie.yang on 2018/4/20.
 */

public class AnimationActivity extends Activity {
    ImageView imgView;
    Button btnAlpha,btnScale;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imgView=findViewById(R.id.imgView);
        btnAlpha=findViewById(R.id.btnAlpha);
        btnScale=findViewById(R.id.btnScale);

        DisplayMetrics metrics=getResources().getDisplayMetrics();
        int w=metrics.widthPixels;
        int h=metrics.heightPixels;
        Log.i("TAG",w+"*"+h);


        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationSet set=new AnimationSet(true);
                AlphaAnimation alpha=new AlphaAnimation(1,0);
                alpha.setDuration(3000);
                set.addAnimation(alpha);
                imgView.startAnimation(set);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationSet set=new AnimationSet(true);
                ScaleAnimation scale=new ScaleAnimation(
                        1f,0.0f,
                        1f,0.0f,
                        Animation.RELATIVE_TO_SELF,0.5f,
                        Animation.RELATIVE_TO_SELF,0.5f);
                scale.setDuration(4000);
                set.addAnimation(scale);
                imgView.startAnimation(set);

            }
        });




    }
}
