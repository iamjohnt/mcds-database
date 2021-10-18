package com.resource;

import com.dao.CaseData;
import com.dao.DeathData;
import com.dao.HospData;
import com.dbservice.DbService;
import com.pojo.CaseDataRecords;
import com.pojo.DeathDataRecords;
import com.pojo.HospDataRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Endpoint {

    @Autowired
    private DbService dbService;

    @CrossOrigin
    @GetMapping("/database/test")
    public String helloWorldDatabase() {
        return "Hello World Database";
    }

    @CrossOrigin
    @GetMapping("/database/apriltest")
    public String getAprilFirstData() {
        CaseData thing = dbService.getAprilFirstCaseData();
        return thing.getCasesNew().toString();
    }

    @CrossOrigin
    @GetMapping("/database/cases")
    public List<CaseData> getCaseDataRecords() {
        List<CaseData> records = dbService.getCaseDataList();
        return records;
    }

    @CrossOrigin
    @GetMapping("/database/deaths")
    public List<DeathData> getDeathDataRecords() {
        List<DeathData> records = dbService.getDeathDataList();
        return records;
    }

    @CrossOrigin
    @GetMapping("database/hospitalizations")
    public List<HospData>  getHospDataRecords() {
        List<HospData> records = dbService.getHospDataList();
        return records;
    }
}
