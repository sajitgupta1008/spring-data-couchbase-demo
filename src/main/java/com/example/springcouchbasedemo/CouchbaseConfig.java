package com.example.springcouchbasedemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.util.Collections;
import java.util.List;

@Configuration
@EnableCouchbaseRepositories(basePackages={"org.example.springcouchbasedemo"})
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    
    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("localhost");
    }
    
    @Override
    protected String getBucketName() {
        return "test";
    }
    
    @Override
    protected String getBucketPassword() {
        return "couchbase";
    }
    
    @Override
    protected String getUsername() {
        return "couchbase";
    }
}
