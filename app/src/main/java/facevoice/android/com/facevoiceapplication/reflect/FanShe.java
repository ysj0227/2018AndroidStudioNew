package facevoice.android.com.facevoiceapplication.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射
 * Created by shijie.yang on 2018/4/8.
 */

public class FanShe {
    public static void main(String[] args) {
        //第一种方式获取Class对象
//        Student stu1 = new Student();//这一new 产生一个Student对象，一个Class对象。
//        Class stuClass = stu1.getClass();//获取Class对象
//        System.out.println(stuClass.getName());
//
//        //第二种方式获取Class对象
//        Class stuClass2 = Student.class;
//        System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个
//
//        //第三种方式获取Class对象
//        try {
//            Class stuClass3 = Class.forName("facevoice.android.com.facevoiceapplication.reflect.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
//            System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        try{
            //通过反射获取class name
            Class cls=Class.forName("facevoice.android.com.facevoiceapplication.reflect.Student");

            Object obj=cls.newInstance();
            Method method=cls.getDeclaredMethod("getName"); //获得get方法
            Field field=cls.getDeclaredField("name"); // 获得name属性
            field.setAccessible(true);
            field.set(obj,"ysj");

            System.out.println(field.get(obj)); // Person对象.name



            System.out.println("*** "+cls);
            System.out.println("$$$ "+method);
            System.out.println("### "+field);


        }catch (Exception e){
           e.printStackTrace();
        }



    }
}
