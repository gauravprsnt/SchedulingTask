package com.Prashant.SchedulingTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class ScheduledTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "1/6 * * * * *")
    public void reportCurrentTime() {
        Hello hello = new Hello();
        log.info("The time is now {}", dateFormat.format(new Date()));

        hello.helloMan();

    }
}
