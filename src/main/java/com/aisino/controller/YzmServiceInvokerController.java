package com.aisino.controller;

import com.aisino.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * Created by zhukaishengy on 2018/4/16.
 */
@RestController
public class YzmServiceInvokerController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/redisApi")
    public Map<String, String> redisApi(){
        Map<String, String> hmget = redisUtil.hmget("88:578134");
        return hmget;
    }
    @GetMapping("/redisApi1")
    public Set<String> redisApi1(){
        Set<String> keys = redisUtil.getRedisTemplate().opsForHash().keys("88:*");
        return keys;
    }
}
