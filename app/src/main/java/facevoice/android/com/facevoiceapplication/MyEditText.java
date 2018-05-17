package facevoice.android.com.facevoiceapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by shijie.yang on 2018/3/7.
 */

@SuppressLint("AppCompatCustomView")
public class MyEditText extends EditText implements TextWatcher {

    private Drawable mClearDrawable;
    public MyEditText(Context context) {
        super(context);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs, android.R.attr.editTextStyle);


    }

    public MyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        //获取EditText的DrawableRight,假如没有设置我们就使用默认的图片,getCompoundDrawables()获取Drawable的四个位置的数组
        mClearDrawable = getCompoundDrawables()[2];
        if (mClearDrawable == null) {
            mClearDrawable = getResources().getDrawable(R.drawable.ic_launcher_background);
        }
        //设置图标的位置以及大小,getIntrinsicWidth()获取显示出来的大小而不是原图片的带小
        mClearDrawable.setBounds(0, 0, mClearDrawable.getIntrinsicWidth(), mClearDrawable.getIntrinsicHeight());
        //默认设置隐藏图标
        setClearIconVisible(false);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence s, int i, int i1, int i2) {
        if (s.toString().length()==0) {
             setText("");
        }

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

    /**
     * 设置清除图标的显示与隐藏，调用setCompoundDrawables为EditText绘制上去
     * @param visible
     */
    protected void setClearIconVisible(boolean visible) {
        Drawable right = visible ? mClearDrawable : null;
        setCompoundDrawables(getCompoundDrawables()[0],
                getCompoundDrawables()[1], right, getCompoundDrawables()[3]);
    }
}
