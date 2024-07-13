package com.example.databasecheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class DatabaseCheckService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseCheckService(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean isConnectionValid() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
