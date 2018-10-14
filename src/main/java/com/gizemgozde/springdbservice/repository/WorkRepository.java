package com.gizemgozde.springdbservice.repository;

import com.gizemgozde.springdbservice.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends CrudRepository<Work, Long> {

}
