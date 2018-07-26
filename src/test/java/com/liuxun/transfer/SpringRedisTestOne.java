package com.liuxun.transfer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringRedisTestOne {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void save(){

        stringRedisTemplate.opsForValue().set("aaa","big z");
        Assert.assertEquals("big z",stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void save2(){
        SetOperations<String, String> opsForSet = stringRedisTemplate.opsForSet();
        opsForSet.add("testSet","1-100","101-200","201-300","301-400");
        Set<String> testSets = opsForSet.members("testSet");
        for (int i = 0; i < testSets.size(); i++) {
            System.out.println(testSets.toString()+"\t");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(opsForSet.pop("testSet"));
        }
    }
}