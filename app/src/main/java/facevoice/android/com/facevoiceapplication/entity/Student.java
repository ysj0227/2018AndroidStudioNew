package facevoice.android.com.facevoiceapplication.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by shijie.yang on 2018/5/10.
 */

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private int age;
    private String num;
    private String type;
    @Generated(hash = 1404439652)
    public Student(Long id, String name, int age, String num, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.num = num;
        this.type = type;
    }
    @Generated(hash = 1556870573)
    public Student() {
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
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNum() {
        return this.num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
