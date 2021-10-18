package com.resource;

import com.dao.CaseData;
import com.dao.DeathData;
import com.dao.HospData;
import com.dbservice.DbService;
import com.pojo.CaseDataRecords;
import com.pojo.DeathDataRecords;
import com.pojo.HospDataRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Endpoint {

    @Autowired
    private DbService dbService;

    @GetMapping("/database/test")
    public String helloWorldDatabase() {
        return "Hello World Database";
    }

    @GetMapping("/database/apriltest")
    public String getAprilFirstData() {
        CaseData thing = dbService.getAprilFirstCaseData();
        return thing.getCasesNew().toString();
    }

    @GetMapping("/database/cases")
    public CaseDataRecords getCaseDataRecords() {
        List<CaseData> records = dbService.getCaseDataList();
        CaseDataRecords wrapper = new CaseDataRecords();
        wrapper.setRecords(records);
        return wrapper;
    }

    @GetMapping("/database/deaths")
    public DeathDataRecords getDeathDataRecords() {
        List<DeathData> records = dbService.getDeathDataList();
        DeathDataRecords wrapper = new DeathDataRecords();
        wrapper.setRecords(records);
        return wrapper;
    }

    @GetMapping("database/hospitalizations")
    public HospDataRecords getHospDataRecords() {
        List<HospData> records = dbService.getHospDataList();
        HospDataRecords wrapper = new HospDataRecords();
        wrapper.setRecords(records);
        return wrapper;
    }
}
