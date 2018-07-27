package com.liuxun.transfer;

import com.liuxun.transfer.async.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRunTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void taskRun1() throws InterruptedException {

        // 1. 查询对应表中的总数据量 count
        // 2. if count < 10000 异步任务为100 else 异步任务为 1000

        // 3. 按照区间分区，并将区间存储的Redis 每100份存储为一个区间 份数=count/100 +（count%100==0?0:1）;
        // for(i=1;i<=份数;i++){ begin=(i-1)*100+1; end=i*100; 区间: begin-end  push 区间到RedisSet集合   }

        // 4. 按照count数量定的异步任务数开始开启异步任务
        // 异步任务：从Set集合中pop集合，if 出的区间为null 则说明执行完毕 直接return；否则则获取对应区间limit begin,100 查询拼接key，json 不断存入Redis

        // end；

        // 测试团队提交

        logger.info("All tasks finished.");
    }
}
