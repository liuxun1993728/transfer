package com.liuxun.transfer;

import com.liuxun.transfer.po.CrCheckevent;
import com.liuxun.transfer.service.CrCheckEventService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OracleTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CrCheckEventService crCheckEventService;

    @Test
    public void test1(){
        List<CrCheckevent> crcheckEvents = crCheckEventService.getCrcheckEvents(0, 10);
        for (int i = 0; i < crcheckEvents.size(); i++) {
            logger.info("====={}\t{}\t",crcheckEvents.get(i).getId(),crcheckEvents.get(i).getUserId());
        }
    }
}
