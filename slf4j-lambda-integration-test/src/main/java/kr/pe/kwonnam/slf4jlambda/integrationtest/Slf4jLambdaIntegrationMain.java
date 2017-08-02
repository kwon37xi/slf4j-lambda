package kr.pe.kwonnam.slf4jlambda.integrationtest;

import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import kr.pe.kwonnam.slf4jlambda.LambdaLoggerFactory;

import java.time.LocalDateTime;

public class Slf4jLambdaIntegrationMain {

    public static void main(String[] args) {
        LambdaLogger log = LambdaLoggerFactory.getLogger("kr.pe.kwonnam.Slf4jIntegrationTest");

        log.trace(() -> "trace message does not show. it's info level.");
        log.debug(() -> "debug message does not show. it's info level.");
        log.debug(() -> createMessage("debug level")); // does not show,

        log.info(() -> "info message");
        log.warn(() -> "warn message");
        log.error(() -> "error message");
        log.info(() -> createMessage("info level"));

        log.info("lambda formatter number {}, string {}", () -> 123, () -> "Hello LambdaLogger");
        log.info("basic formatter number {}, string {}", 123, "Hello LambdaLogger");

        try {
            createEx("Test Exception");
        } catch (Exception ex) {
            log.error(() -> "lambda exception msg - " + ex.getMessage(), ex);
            log.error("basic exception msg - " + ex.getMessage(), ex);
        }
    }

    public static String createMessage(String message) {
        final String finalMessage = "### message created - " + message + " - " + LocalDateTime.now() + " ###";
        System.out.println(finalMessage);
        return finalMessage;
    }

    public static void createEx(String msg) {
        throw new RuntimeException(msg);
    }
}