package com.liuxun.transfer.service;

import com.github.pagehelper.PageHelper;
import com.liuxun.transfer.mapper.CrCheckeventDAO;
import com.liuxun.transfer.po.CrCheckevent;
import com.liuxun.transfer.po.CrCheckeventExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrCheckEventService {
    @Autowired
    private CrCheckeventDAO crCheckeventDAO;

    public List<CrCheckevent> getCrcheckEvents(int page,int pageSize){

        CrCheckeventExample example = new CrCheckeventExample();
        PageHelper.startPage(page,pageSize);
        List<CrCheckevent> crCheckevents = crCheckeventDAO.selectByExample(example);
        return crCheckevents;
    }
}
