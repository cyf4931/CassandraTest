package com.dbtest.repository;

import java.util.Optional;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbtest.Bean.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
    //@Query("select * from Person where id= ?1")
    Optional<Person> findById(String id);
}