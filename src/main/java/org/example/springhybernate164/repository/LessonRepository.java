package org.example.springhybernate164.repository;

import org.example.springhybernate164.Entity.LessonEntity;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<LessonEntity, Long> {
}
