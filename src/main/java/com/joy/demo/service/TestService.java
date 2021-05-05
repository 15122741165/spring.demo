package com.joy.demo.service;

import com.joy.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Map<String,Object>> test(){
        return testMapper.test();
    }
}
