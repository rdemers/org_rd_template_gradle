/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.rd.template.gradle.app;

import org.rd.template.gradle.list.LinkedList;
import org.rd.template.gradle.utilities.MessageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.rd.template.gradle.utilities.StringUtils.join;
import static org.rd.template.gradle.utilities.StringUtils.split;

public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LinkedList tokens = split(MessageUtils.getMessage());
        logger.info(join(tokens));
    }
}