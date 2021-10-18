package com.repo;

import com.dao.HospData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface HospDataRepo extends CrudRepository<HospData, Date> {
}
