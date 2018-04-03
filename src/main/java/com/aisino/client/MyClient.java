package com.aisino.client;

import com.aisino.to.Response;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by zhukaishengy on 2018/3/23.
 */
public class MyClient {

    public static String getToken(){
        String result = null;
        try {
            DefaultHttpClient httpclient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost("https://open.jss.com.cn/accessToken?client_id=yMSrnj4F&client_secret=D916A8075A2A490F&grant_type=client_credentials");
            httpPost.setHeader("Content-Type","application/x-www-form-urlencoded");
            HttpResponse response = null;
            response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity);
            result = JSON.parseObject(result, Response.class).getAccess_token();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    //test
//    public static String testUpdate(String flag){
//        if(flag.equals("1")){
//            System.out.println("链接token服务失败。。。");
//            return null;
//        }else{
//            System.out.println("发送请求更新token 。。。");
//            return "123";
//        }
//
//    }
}
