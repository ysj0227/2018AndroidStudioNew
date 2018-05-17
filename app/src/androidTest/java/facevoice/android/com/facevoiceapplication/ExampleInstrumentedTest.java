package facevoice.android.com.facevoiceapplication;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.widget.EditText;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
//        Context appContext = InstrumentationRegistry.getTargetContext();
        test_Template();
    }

    static Instrumentation instrumentation;
    static UiDevice mDevice;

//    @BeforeClass  //也可以是Before
//    public static void setUpBeforeClass() throws IOException {
//        instrumentation = InstrumentationRegistry.getInstrumentation();
//        mDevice = UiDevice.getInstance(instrumentation);
//
//    }

    @Test
    public void test_Template() throws Exception {
        //初始化一个UiDevice对象
         UiDevice mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
         // 点击home键，回到home界面
        // mDevice.pressHome();
         String launcherPackage = mDevice.getLauncherPackageName();
         assertThat(launcherPackage, notNullValue());
         mDevice.wait(Until.hasObject(By.pkg(launcherPackage).depth(0)), 3);

        //启动apk的程序
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        Intent intent = context.getPackageManager().getLaunchIntentForPackage("facevoice.android.com.facevoiceapplication");
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
        //下面写你的逻辑代码

        // 等待应用程序启动
        mDevice.wait(Until.hasObject(By.pkg("facevoice.android.com.facevoiceapplication").depth(0)), 6);

        //通过id找到输入框一
        UiObject edt1 = mDevice.findObject(new UiSelector().resourceId("facevoice.android.com.facevoiceapplication:id/aa").className(EditText.class));
        edt1.setText("你好吗？我爱你···");
    }


    @AfterClass  //也可以是After
    public static void tearDownAfterClass() throws IOException {

    }
}
