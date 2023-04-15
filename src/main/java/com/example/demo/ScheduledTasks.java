package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ScheduledTasks(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Scheduled(cron = "* * * * * *")
    public void doTask() {
        String sql = "INSERT INTO first.tutorial_tbl(tutorial_title, tutorial_author, submission_date) " +
                "VALUES('Title4', 'C', '2008-11-12')";
        String sql1 = "INSERT INTO first.tutorial_tbl(tutorial_title, tutorial_author, submission_date) " +
                "VALUES('Title5', 'D', '2008-11-12')";
        jdbcTemplate.update(sql);
        jdbcTemplate.update(sql1);
    }
}
