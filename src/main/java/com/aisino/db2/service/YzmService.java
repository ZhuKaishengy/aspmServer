package com.aisino.db2.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhukaishengy on 2018/4/14.
 */
@Service
public class YzmService {

    private static Logger logger = Logger.getLogger(YzmService.class);

    @Test
    public void test(){
        String ae = this.getYzmMd5("吗");
        System.out.println(ae);
    }
    /**
     * 根据真实的验证码md5加密，得到加密后的字符串
     * @param afeax
     * @return
     */
    public String getYzmMd5(String afeax) {
        String fffO = "";
        for(int a = 0; a < 16; ++a) {
            fffO = fffO + "-" + Integer.toHexString(a);
        }
        fffO = fffO.substring(1);
        char aa = '2';
        String fff0 = fffO.replace(aa, '+');
        fff0 = fff0.replace('b', '=');
        fff0 = fff0.replace('+', 'b');
        fff0 = fff0.replace('=', aa);
        fff0 = fff0.replace('6', 'A');
        fff0 = fff0.replace('8', '@');
        fff0 = fff0.replace('A', '8');
        fff0 = fff0.replace('@', '6');
        String strmd5 = this.GetMD5Code(afeax.toLowerCase(), fff0.split("-"));
        String str = this.GetMD5Code(strmd5, fffO.split("-"));
        logger.info("验证码为："+afeax+";md5值为："+str);
        return str;
    }

    /**
     * 为图片添加一个索引
     * @param pic
     * @return
     */
    public String makeIndex (String pic) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BASE64Decoder base64Decoder = new BASE64Decoder();
            byte[] bytes = base64Decoder.decodeBuffer(pic);
            md.update(bytes);
            byte[] bPwd=md.digest();
            String pwd = new BigInteger(1, bPwd) .toString(16);
            if(pwd.length()%2==1){
                pwd="0"+pwd;
            }
            int length=pwd.length();
            StringBuffer sb=new StringBuffer(length+length/2-1);
            for(int i=0;i<length;i+=2){
                sb.append(pwd.substring(i, i+2));
            }
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pic;
    }

    public String GetMD5Code(String strObj, String[] strDigits) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");

            try {
                resultString = byteToString(md.digest(strObj.getBytes("GBK")), strDigits);
            } catch (UnsupportedEncodingException var5) {
                var5.printStackTrace();
            }
        } catch (NoSuchAlgorithmException var6) {
            var6.printStackTrace();
        }

        return resultString;
    }

    private static String byteToString(byte[] bByte, String[] strDigits) {
        StringBuffer sBuffer = new StringBuffer();

        for(int i = 0; i < bByte.length; ++i) {
            sBuffer.append(byteToArrayString(bByte[i], strDigits));
        }

        return sBuffer.toString();
    }

    private static String byteToArrayString(byte bByte, String[] strDigits) {
        int iRet = bByte;
        if (bByte < 0) {
            iRet = bByte + 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }
}
