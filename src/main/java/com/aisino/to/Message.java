package com.aisino.to;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhukaishengy on 2018/3/24.
 */
public class Message {

    private String code;
    private String msg;
    private Map<String,Object> resultMap = new HashMap<>();

    public static Message success(){
        return new Message("1001","成功！");
    }
    public static Message fail(){
        return new Message("9999","失败！");
    }
    public Message add(String key,Object val){
        this.resultMap.put(key,val);
        return this;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public Message(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Message() {
    }
}
