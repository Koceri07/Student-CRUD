package org.example.springhybernate164.repository;

import org.example.springhybernate164.Entity.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<TeacherEntity, Long> {
}
