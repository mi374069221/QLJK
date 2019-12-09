package com.qm.service;

import com.qm.pojo.Warnlist;

import java.util.List;

public interface WarnListService {
 //获取告警数据
 public List<Warnlist> getWarnList(Byte dealWith);
}
