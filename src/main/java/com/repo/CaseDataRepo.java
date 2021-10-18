package com.repo;

import com.dao.CaseData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CaseDataRepo extends CrudRepository<CaseData, Date> {
}
