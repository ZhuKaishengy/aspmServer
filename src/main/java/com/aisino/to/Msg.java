package com.aisino.to;

import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhukaishengy on 2018/3/23.
 */
public class Msg {

    private String Code;
    private String Describe;
    private String Result;

    public static Msg successResult(String result){
        Msg msg =  new Msg("0000","发送成功！",result);
        return msg;
    }
    public static Msg successInsert(String id){
        Msg msg =  new Msg("1001","插入成功！",id);
        return msg;
    }
    public static Msg failInsert(String result){
        Msg msg =  new Msg("9998","插入失败！",result);
        return msg;
    }
    public static Msg failResult(){
        Msg msg = new Msg("9999","发送失败！","");
        return msg;
    }

    public Msg(String code, String describe, String result) {
        Code = code;
        Describe = describe;
        Result = result;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }
}
