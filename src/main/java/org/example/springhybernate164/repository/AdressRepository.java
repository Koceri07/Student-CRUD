package org.example.springhybernate164.repository;

import org.example.springhybernate164.Entity.AdressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdressRepository extends CrudRepository<AdressEntity, Long> {
}
