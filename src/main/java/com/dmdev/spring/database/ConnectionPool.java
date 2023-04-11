package com.dmdev.spring.database;

import java.util.List;
import java.util.Map;

public class ConnectionPool {

    private final String username;
    private final Integer poolsize;
    private final List<Object> aras;

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    private Map<String, Object> properties;

    public ConnectionPool(String username, Integer poolsize, List<Object> aras, Map<String, Object> properties) {
        this.username = username;
        this.poolsize = poolsize;
        this.aras = aras;
        this.properties = properties;
    }

    public void example(){
        System.out.println("Hello ConnectionPool!!!");
    }

    private void init() {
        System.out.println("Init pool");
    }

    private void rollBack() {
        System.out.println("Roll back!");
    }
}
