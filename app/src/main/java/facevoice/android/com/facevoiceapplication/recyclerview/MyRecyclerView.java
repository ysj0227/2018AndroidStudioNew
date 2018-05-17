package facevoice.android.com.facevoiceapplication.recyclerview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by shijie.yang on 2018/4/10.
 */

@RequiresApi(api = Build.VERSION_CODES.M)
public class MyRecyclerView extends RecyclerView implements View.OnScrollChangeListener{
    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onScrollChange(View view, int i, int i1, int i2, int i3) {

    }
}
