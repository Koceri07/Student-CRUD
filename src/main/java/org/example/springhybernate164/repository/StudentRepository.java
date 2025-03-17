package org.example.springhybernate164.repository;

import org.example.springhybernate164.Entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

    List<StudentEntity> findAll();


}
