package com.aisino.db2.service;

import com.aisino.db2.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<String> getDistinctCorps(){
        List<String> distinctCorps = userMapper.getDistinctCorps();
        return distinctCorps;
    }
}
