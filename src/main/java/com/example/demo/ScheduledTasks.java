package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScheduledTasks {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ScheduledTasks(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Scheduled(cron = "* * * * * *")
    @Scheduled(initialDelay = 10000, fixedDelay = Long.MAX_VALUE)
    public void doTask() {
        List<String> sqlQueries = new ArrayList<>();
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
        sqlQueries.add ("INSERT INTO first.tutorial_tbl(tutorial_title, tutorial_author, submission_date) " +
                "VALUES('Title4', 'C', ?)");
        sqlQueries.add ("INSERT INTO first.tutorial_tbl(tutorial_title, tutorial_author, submission_date) " +
                "VALUES('Title5', 'D', ?)");

        QueryExecutor executor = new QueryExecutor(jdbcTemplate);
        executor.executeQueries(sqlQueries);
    }
}
