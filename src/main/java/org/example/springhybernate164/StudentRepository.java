package org.example.springhybernate164;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

    List<StudentEntity> findAll();


}
