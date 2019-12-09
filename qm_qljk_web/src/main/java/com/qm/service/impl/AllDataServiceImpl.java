package com.qm.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qm.mapper.AllDataMapper;
import com.qm.mapper.WarnlistMapper;
import com.qm.pojo.AllData;
import com.qm.pojo.AllDataExample;
import com.qm.pojo.AllDataToPageBean;
import com.qm.pojo.Warnlist;
import com.qm.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class AllDataServiceImpl implements AllDataService{
    @Autowired
    private AllDataMapper allDataMapper;
    @Autowired
    private WarnlistMapper warnlistMapper;
    @Override
    public String getAllDataByDate(Date StartTime) {
        //创建构造器，获取where条件
        AllDataExample example = new AllDataExample();
        AllDataExample.Criteria criteria = example.createCriteria();
        criteria.andDatatimeEqualTo(StartTime);

        //得到等于example的数据
        List<AllData> allData = allDataMapper.selectByExample(example);
        String[] TemperatureArr =  new String[allData.size()];
        String[] WindspeedArr =  new String[allData.size()];
        String[] WinddirectionArr =  new String[allData.size()];
        String[] frequencyArr =  new String[allData.size()];
        String[] waterLevelArr =  new String[allData.size()];

        int i =0;
        for (AllData data : allData) {
            TemperatureArr[i]=data.getTemperature();
            WindspeedArr[i]=data.getWindspeed();
            WinddirectionArr[i]=data.getWinddirection().toString();
            frequencyArr[i]=data.getFrequency();
            waterLevelArr[i]=data.getWaterlevel();
            //将符合告警值范围的数据保存到Warnlist表
            Warnlist warnlist = new Warnlist();
            Byte[] warnLeaveArr = {0,1};
            String[] fromguyArr = {"温度传感器","风力传感器","重力传感器","位移传感器"};
            String[] warncontentArr = {"温度超过24℃，比较危险","温度超过30℃或者低于-20℃，非常严重","风速超过8级，比较危险","风速已超过10级，非常危险"};
            String[] aviliablevalueArr = {"-20至30℃","1至10级","0-100吨","0-3cm"};
            byte[] dealwithArr = {0,1};

            if (Integer.parseInt(TemperatureArr[i]) <=30 && Integer.parseInt(TemperatureArr[i])> 24) {
                warnlist.setNodeip(data.getNodeip());
                warnlist.setWarnleave(warnLeaveArr[0]);
                warnlist.setFromguy(fromguyArr[0]);
                warnlist.setWarncontent(warncontentArr[0]);
                warnlist.setAviliablevalue(aviliablevalueArr[0]);
                warnlist.setWarnvalue(TemperatureArr[i]);
                warnlist.setWarntime(StartTime);
                warnlist.setDealwith(dealwithArr[0]);
                warnlistMapper.insert(warnlist);
            } else if (Integer.parseInt(TemperatureArr[i]) > 30 || Integer.parseInt(TemperatureArr[i]) < -20) {
                warnlist.setNodeip(data.getNodeip());
                warnlist.setWarnleave(warnLeaveArr[1]);
                warnlist.setFromguy(fromguyArr[0]);
                warnlist.setWarncontent(warncontentArr[1]);
                warnlist.setAviliablevalue(aviliablevalueArr[0]);
                warnlist.setWarnvalue(TemperatureArr[i]);
                warnlist.setWarntime(StartTime);
                warnlist.setDealwith(dealwithArr[0]);
                warnlistMapper.insert(warnlist);
            }
            if (10 > Integer.parseInt(WindspeedArr[i]) && Integer.parseInt(WindspeedArr[i])> 8) {
                warnlist.setNodeip(data.getNodeip());
                warnlist.setWarnleave(warnLeaveArr[0]);
                warnlist.setFromguy(fromguyArr[1]);
                warnlist.setWarncontent(warncontentArr[3]);
                warnlist.setAviliablevalue(aviliablevalueArr[1]);
                warnlist.setWarnvalue(WindspeedArr[i]);
                warnlist.setWarntime(StartTime);
                warnlist.setDealwith(dealwithArr[0]);
                warnlistMapper.insert(warnlist);
            } else if (Integer.parseInt(WindspeedArr[i]) >= 10) {
//                JKGJ.push(['严重', '风力传感器', '风速已超过10级，非常危险', '1至10级', windSpeed.toString(), valueName1, '未处理', '192.168.2.202'])
                warnlist.setNodeip(data.getNodeip());
                warnlist.setWarnleave(warnLeaveArr[1]);
                warnlist.setFromguy(fromguyArr[1]);
                warnlist.setWarncontent(warncontentArr[2]);
                warnlist.setAviliablevalue(aviliablevalueArr[1]);
                warnlist.setWarnvalue(WindspeedArr[i]);
                warnlist.setWarntime(StartTime);
                warnlist.setDealwith(dealwithArr[0]);
                warnlistMapper.insert(warnlist);
            }
            i++;
        }
        AllDataToPageBean bean = new AllDataToPageBean();
        bean.setTemperatureValues(TemperatureArr);
        bean.setWindSpeedValues(WindspeedArr);
        bean.setWindDirectionValues(WinddirectionArr);
        bean.setFrequencyValues(frequencyArr);
        bean.setWaterLevelValues(waterLevelArr);

        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;
    }
}
