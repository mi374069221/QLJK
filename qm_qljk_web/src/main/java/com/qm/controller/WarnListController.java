package com.qm.controller;

import com.qm.pojo.Warnlist;
import com.qm.service.WarnListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;

@Controller
public class WarnListController {
    @Autowired
    private WarnListService warnListService;
    @RequestMapping(value = "/warnList", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Warnlist> getWarnList(Byte dealWith){
        List<Warnlist> warnList = warnListService.getWarnList(dealWith);
        System.out.println("当前传入值："+dealWith);
        /*for (Warnlist warnlist : warnList) {
            System.out.println("警告列表："+warnlist.getNodeip()+"...");
        }*/
        //迭代器
        Iterator<Warnlist> iterator = warnList.iterator();
        while (iterator.hasNext()){
          Warnlist warnlist = iterator.next();
            System.out.println("警告列表："+warnlist.getAviliablevalue()+"...");
        }

        return warnList;
    }
}
