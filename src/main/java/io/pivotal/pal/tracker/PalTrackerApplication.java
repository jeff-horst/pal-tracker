package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
@Configuration
public class PalTrackerApplication {

    @Bean
    public TimeEntryRepository timeEntryRepository() {
        return new TimeEntryRepository() {
            @Override
            public TimeEntry create(TimeEntry timeEntry) {
                return null;
            }

            @Override
            public TimeEntry find(long id) {
                return null;
            }

            @Override
            public List<TimeEntry> list() {
                return null;
            }

            @Override
            public TimeEntry update(long id, TimeEntry timeEntry) {
                return null;
            }

            @Override
            public void delete(long id) {

            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

}