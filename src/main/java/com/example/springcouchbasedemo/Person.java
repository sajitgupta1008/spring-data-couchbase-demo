package com.example.springcouchbasedemo;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@AllArgsConstructor
@Getter
public class Person {
    
    @Id
    String id;
    
    @Field
    String firstName;
    
    @Field
    String lastName;
    
    @Field
    String address;
}
