package com.misiontic.resumemanagement;

import com.misiontic.resumemanagement.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ResumeManagementApplication {

    private final Logger logger = LoggerFactory.getLogger(ResumeManagementApplication.class);

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(ResumeManagementApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
       // testService.testUpdateWithRelatedItems();
    }
}
