package com.example.springcouchbasedemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonRequest {
    
    String id;
    
    String firstName;
    
    String lastName;
    
    String address;
    
}
