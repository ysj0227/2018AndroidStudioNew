package facevoice.android.com.facevoiceapplication.setRecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import facevoice.android.com.facevoiceapplication.R;
import facevoice.android.com.facevoiceapplication.recyclerview.StudentBean;
import facevoice.android.com.facevoiceapplication.utils.CommonListAdapter;
import facevoice.android.com.facevoiceapplication.utils.ViewHolder;

/**
 * Created by shijie.yang on 2018/4/10.
 */

public class TestActivity extends Activity {
    PullRefreshRecyclerView recyclerView;
    private List<StudentBean> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_recyclerview);
        recyclerView = findViewById(R.id.recyclerView);
        setList();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        recyclerView.setAdapter(new CommonListAdapter<StudentBean>(this, R.layout.activity_recycler_item1, list) {
            @Override
            public void convert(ViewHolder holder, StudentBean studentBean) {

                holder.setText(R.id.tvName, studentBean.getName());
                holder.setText(R.id.tvSex, studentBean.getSex());
                holder.setText(R.id.tvIntroduce, studentBean.getIntroduce());
//                holder.setImageResource(R.id.img, studentBean.getImgPerson());
            }
        });

    }

    private void setList() {
        StudentBean bean;
        for (int i = 0; i < 5; i++) {
            bean = new StudentBean();
            bean.setName("ysj" + i);
            bean.setSex("woman");
            bean.setIntroduce("问世间情是何物，直教人生死相许");
            bean.setImgPerson(R.mipmap.ic_launcher);
            bean.setType(0);
            list.add(bean);
        }

        StudentBean bean1;
        for (int i = 0; i < 5; i++) {
            bean1 = new StudentBean();
            bean1.setName("杨世杰" + i);
            bean1.setSex("man");
            bean1.setIntroduce("天南地北双飞客，老翅几回寒暑，君应有语，千山暮雪！");
            bean1.setImgPerson(R.mipmap.ic_launcher);
            bean1.setType(1);
            list.add(bean1);
        }
    }
}
