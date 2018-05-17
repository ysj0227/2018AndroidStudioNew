package facevoice.android.com.facevoiceapplication.utils;

import android.util.Base64;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by Haosheng.zhang on 2018/5/10.
 */

public class AESUtil {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 根据当前日期 生成秘钥
     *
     * @return
     */
    private static SecretKeySpec createKey() {
        byte[] data = null;

        StringBuilder sb = new StringBuilder(32);
        sb.append(dateFormat.format(new Date()));
        while (sb.length() < 32) {
            sb.append("0");
        }
        if (sb.length() > 32) {
            sb.setLength(32);
        }

        try {
            data = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new SecretKeySpec(data, "AES");
    }

    /**
     * 创建密钥
     *
     * @param password 自定义,长度不足自动补0,根据此字符串生成秘钥
     * @return 秘钥(密码)
     */
    private static SecretKeySpec createKey(String password) {
        byte[] data = null;
        if (password == null) {
            password = "";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(password);
        while (sb.length() < 32) {
            sb.append("0");
        }
        if (sb.length() > 32) {
            sb.setLength(32);
        }

        try {
            data = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new SecretKeySpec(data, "AES");
    }

    /**
     * 加密
     *
     * @param encodingString 要加密的字符串
     * @return 密文
     */
    public static String getAESEncode(String encodingString) {
        String data = null;
        try {
            //1.创建加密引擎
            Cipher cipher = Cipher.getInstance("AES");
            //2.创建key
            SecretKeySpec key = createKey();//加密
            //3.密码引擎初始化
            cipher.init(Cipher.ENCRYPT_MODE, key);
            //4.对数据进行加密，数据进行Base64编码
            byte[] rr = Base64.encode(cipher.doFinal(encodingString.getBytes()), Base64.DEFAULT);
            data = new String(rr);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * 解密
     *
     * @param decodingString 要解密的字符串
     * @return 明文
     */
    public static String getDecodeString(String decodingString) {
        String data = "";
        try {
            //1、创建一个密码引擎
            Cipher cipher = Cipher.getInstance("AES");
            //2、创建key
            SecretKeySpec keySpec = createKey();//解密
            //3、对密码引擎进行初始化
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            //4、对数据进行解密
            byte[] decode = Base64.decode(decodingString, Base64.DEFAULT);
            data = new String(cipher.doFinal(decode));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return data;
    }
}
