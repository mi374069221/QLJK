package com.qm.pojo;

import java.util.Date;

public class Warnlist {
    private Long id;

    private String nodeip;

    private Byte warnleave;

    private String fromguy;

    private String warncontent;

    private String aviliablevalue;

    private String warnvalue;

    private Date warntime;

    private Byte dealwith;

    private String des;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeip() {
        return nodeip;
    }

    public void setNodeip(String nodeip) {
        this.nodeip = nodeip == null ? null : nodeip.trim();
    }

    public Byte getWarnleave() {
        return warnleave;
    }

    public void setWarnleave(Byte warnleave) {
        this.warnleave = warnleave;
    }

    public String getFromguy() {
        return fromguy;
    }

    public void setFromguy(String fromguy) {
        this.fromguy = fromguy == null ? null : fromguy.trim();
    }

    public String getWarncontent() {
        return warncontent;
    }

    public void setWarncontent(String warncontent) {
        this.warncontent = warncontent == null ? null : warncontent.trim();
    }

    public String getAviliablevalue() {
        return aviliablevalue;
    }

    public void setAviliablevalue(String aviliablevalue) {
        this.aviliablevalue = aviliablevalue == null ? null : aviliablevalue.trim();
    }

    public String getWarnvalue() {
        return warnvalue;
    }

    public void setWarnvalue(String warnvalue) {
        this.warnvalue = warnvalue == null ? null : warnvalue.trim();
    }

    public Date getWarntime() {
        return warntime;
    }

    public void setWarntime(Date warntime) {
        this.warntime = warntime;
    }

    public Byte getDealwith() {
        return dealwith;
    }

    public void setDealwith(Byte dealwith) {
        this.dealwith = dealwith;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}