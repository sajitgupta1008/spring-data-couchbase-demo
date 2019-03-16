package com.example.springcouchbasedemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CouchbaseRepository extends CrudRepository<Person, String> {
    
    List<Person> findByFirstName(String firstName);
    
}
