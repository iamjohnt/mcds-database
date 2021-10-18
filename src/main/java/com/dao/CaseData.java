package com.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "case_data")
public class CaseData {

    @Id
    @Temporal(TemporalType.DATE)
    private Date infectionDate;

    private Integer casesRunningSum;
    private Integer casesNew;
    private Double casesSevenDayAverage;

    public Date getInfectionDate() {
        return infectionDate;
    }

    public void setInfectionDate(Date infectionDate) {
        this.infectionDate = infectionDate;
    }

    public Integer getCasesRunningSum() {
        return casesRunningSum;
    }

    public void setCasesRunningSum(Integer casesRunningSum) {
        this.casesRunningSum = casesRunningSum;
    }

    public Integer getCasesNew() {
        return casesNew;
    }

    public void setCasesNew(Integer casesNew) {
        this.casesNew = casesNew;
    }

    public Double getCasesSevenDayAverage() {
        return casesSevenDayAverage;
    }

    public void setCasesSevenDayAverage(Double casesSevenDayAverage) {
        this.casesSevenDayAverage = casesSevenDayAverage;
    }
}
