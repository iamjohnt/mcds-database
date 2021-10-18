package com.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hosp_data")
public class HospData {

    @Id
    @Temporal(TemporalType.DATE)
    private Date hospDate;

    private Integer curHosp;
    private Integer netHosp;
    private Integer curHospSevenDayAvg;
    private Integer curIcu;
    private Integer netIcu;
    private Integer curIntubated;
    private Integer netIntubated;
    private Integer newBreakthrough;
    private Integer newHosp;

    public Date getHospDate() {
        return hospDate;
    }

    public void setHospDate(Date hospDate) {
        this.hospDate = hospDate;
    }

    public Integer getCurHosp() {
        return curHosp;
    }

    public void setCurHosp(Integer curHosp) {
        this.curHosp = curHosp;
    }

    public Integer getNetHosp() {
        return netHosp;
    }

    public void setNetHosp(Integer netHosp) {
        this.netHosp = netHosp;
    }

    public Integer getCurHospSevenDayAvg() {
        return curHospSevenDayAvg;
    }

    public void setCurHospSevenDayAvg(Integer curHospSevenDayAvg) {
        this.curHospSevenDayAvg = curHospSevenDayAvg;
    }

    public Integer getCurIcu() {
        return curIcu;
    }

    public void setCurIcu(Integer curIcu) {
        this.curIcu = curIcu;
    }

    public Integer getNetIcu() {
        return netIcu;
    }

    public void setNetIcu(Integer netIcu) {
        this.netIcu = netIcu;
    }

    public Integer getCurIntubated() {
        return curIntubated;
    }

    public void setCurIntubated(Integer curIntubated) {
        this.curIntubated = curIntubated;
    }

    public Integer getNetIntubated() {
        return netIntubated;
    }

    public void setNetIntubated(Integer netIntubated) {
        this.netIntubated = netIntubated;
    }

    public Integer getNewBreakthrough() {
        return newBreakthrough;
    }

    public void setNewBreakthrough(Integer newBreakthrough) {
        this.newBreakthrough = newBreakthrough;
    }

    public Integer getNewHosp() {
        return newHosp;
    }

    public void setNewHosp(Integer newHosp) {
        this.newHosp = newHosp;
    }
}
