package facevoice.android.com.facevoiceapplication.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by shijie.yang on 2018/5/10.
 */

@Entity
public class Person {
    @Id
    private Long id;
    private String name;
    private String num;
    @Generated(hash = 212368323)
    public Person(Long id, String name, String num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }
    @Generated(hash = 1024547259)
    public Person() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNum() {
        return this.num;
    }
    public void setNum(String num) {
        this.num = num;
    }

}
