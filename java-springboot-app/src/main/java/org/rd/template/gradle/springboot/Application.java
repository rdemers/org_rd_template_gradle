package org.rd.template.gradle.springboot;

import org.rd.template.gradle.list.LinkedList;
import org.rd.template.gradle.utilities.MessageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.rd.template.gradle.utilities.StringUtils.join;
import static org.rd.template.gradle.utilities.StringUtils.split;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LinkedList tokens = split(MessageUtils.getMessage());
        logger.info(join(tokens));
    }
}