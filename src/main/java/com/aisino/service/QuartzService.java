package com.aisino.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * Created by zhukaishengy on 2018/3/23.
 */
@Component
public class QuartzService {

    //2018-3-15
//    @Scheduled(cron = "0 0 0 1,15 * ?")
//    public void task(){
//        System.out.println("haha ...");
//    }

    @Value("${profilepath}")
    private String profilepath;

    //判断是否过期，返回true过期了，返回false，没过期
    public boolean validateDate() throws ParseException {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date deadLine = sdf.parse(this.getToken("token.deadLine"));
        return now.getTime() > deadLine.getTime();
    }
    //test
    public boolean validateDateTest(String nowTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date deadLine = sdf.parse(this.getToken("token.deadLine"));
        Date now = sdf.parse(nowTime);
        return now.getTime() > deadLine.getTime();
    }
    //更新过期时间
    public void updateDeadLine() throws ParseException {
        /**
         * 1.读取配置文件中的过期时间
         * 2.增加30天
         * 3.保存到配置文件中
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date deadLine = sdf.parse(this.getToken("token.deadLine"));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(deadLine);
        calendar.add(calendar.DATE, 29);
        Date deadLineNew = calendar.getTime();
        String val = sdf.format(deadLineNew);
        this.setToken("token.deadLine",val);
    }

    /**
     * 读取配置文件
     * @param key
     * @return
     */
    public String getToken(String key){
        String result = null;
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(profilepath));
            result = props.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 只对target中的properties文件进行修改，如果修改源码再部署需修改token.properties
     * 改成原jar中的配置文件的值
     * @param token
     */
    public void setToken(String key,String token){
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(profilepath));
            OutputStream fos = new FileOutputStream(profilepath);
            props.setProperty(key, token);
            props.store(fos, "Update token");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
