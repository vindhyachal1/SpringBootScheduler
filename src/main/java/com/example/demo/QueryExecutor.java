package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class QueryExecutor {

    private final JdbcTemplate jdbcTemplate;

    public QueryExecutor(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void executeQueries(List<String> sqlQueries) {
        // get the current system date and format it to match your database's datetime format
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        // loop through the list of queries and execute each one with the formatted date as a parameter
        for (String sql : sqlQueries) {
            jdbcTemplate.update(sql, formattedDate);
        }
    }
}

