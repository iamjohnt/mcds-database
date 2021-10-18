package com.repo;

import com.dao.DeathData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DeathDataRepo extends CrudRepository<DeathData, Date> {
}
