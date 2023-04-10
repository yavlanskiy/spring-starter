package com.dmdev.spring.database.repository;

import com.dmdev.spring.database.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool pool;
    public CompanyRepository(ConnectionPool pool) {
        this.pool = pool;
    }

    public static CompanyRepository of(ConnectionPool pool) {
        return new CompanyRepository(pool);
    }

}

