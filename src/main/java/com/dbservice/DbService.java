package com.dbservice;

import com.dao.CaseData;
import com.dao.DeathData;
import com.dao.HospData;
import com.repo.CaseDataRepo;
import com.repo.DeathDataRepo;
import com.repo.HospDataRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class DbService {

    @Autowired private CaseDataRepo caseDataRepo;
    @Autowired private DeathDataRepo deathDataRepo;
    @Autowired private HospDataRepo hospDataRepo;

    @Transactional
    public List<CaseData> getCaseDataList() {
        List<CaseData> rtn = (List<CaseData>) caseDataRepo.findAll();
        return rtn;
    }

    @Transactional
    public List<DeathData> getDeathDataList() {
        return (List<DeathData>) deathDataRepo.findAll();
    }

    @Transactional
    public List<HospData> getHospDataList() {
        return (List<HospData>) hospDataRepo.findAll();
    }

    @Transactional
    public CaseData getAprilFirstCaseData() {
        String date_string = "2021-04-01";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = formatter.parse(date_string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Optional<CaseData> rtn = caseDataRepo.findById(date);
        if (rtn.isPresent()) {
            return rtn.get();
        } else {
            return null;
        }
    }

}
