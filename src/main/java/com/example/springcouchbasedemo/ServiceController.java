package com.example.springcouchbasedemo;

import com.example.springcouchbasedemo.models.PersonRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    
    private final CouchbaseRepository repository;
    
    public ServiceController(CouchbaseRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping("/add/person")
    public Person postPerson(@RequestBody PersonRequest personRequest) {
        
        Person person = new Person(personRequest.getId(), personRequest.getFirstName(), personRequest.getLastName(), personRequest.getAddress());
        
        return repository.save(person);
    }
    
    @GetMapping("/get/person/{personId}")
    public Person getPerson(@PathVariable String personId) {
        return repository.findById(personId).orElse(null);
    }
    
    @GetMapping("/get/person/name/{name}")
    public List<Person> getPersonByName(@PathVariable String name) {
        return repository.findByFirstName(name);
    }
    
}
