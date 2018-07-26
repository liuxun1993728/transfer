package com.liuxun.transfer;

import java.util.concurrent.ExecutionException;

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
public class SpringbootAsyncApplicationTests {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void AsyncTaskTest() throws InterruptedException {

        for (int i = 0; i < 1000000000; i++) {
            asyncTask.doTask1(i);
        }

        logger.info("All tasks finished.");
    }


}
