package com.qm.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TAvgpvNum implements Serializable{
    private Integer id;

    private String datestr;

    private BigDecimal avgpvnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr == null ? null : datestr.trim();
    }

    public BigDecimal getAvgpvnum() {
        return avgpvnum;
    }

    public void setAvgpvnum(BigDecimal avgpvnum) {
        this.avgpvnum = avgpvnum;
    }
}