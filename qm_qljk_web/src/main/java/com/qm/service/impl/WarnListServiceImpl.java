package com.qm.service.impl;

import com.qm.mapper.WarnlistMapper;
import com.qm.pojo.Warnlist;
import com.qm.pojo.WarnlistExample;
import com.qm.service.WarnListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarnListServiceImpl implements WarnListService {
    @Autowired
    private WarnlistMapper mapper;

    @Override
    public List<Warnlist> getWarnList(Byte dealWith) {
        WarnlistExample example = new WarnlistExample();
        WarnlistExample.Criteria criteria = example.createCriteria();
        criteria.andDealwithEqualTo(dealWith);

        List<Warnlist> warnlists = mapper.selectByExample(example);

        return warnlists;
    }
}
