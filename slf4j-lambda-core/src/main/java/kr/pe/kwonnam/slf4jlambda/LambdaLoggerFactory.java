package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

/**
 * Create {@link LambdaLogger} instance.
 */
public class LambdaLoggerFactory {
    public static LambdaLogger getLogger(String name) {
        Logger baseLogger = LoggerFactory.getLogger(name);

        return buildLambdaLogger(baseLogger);
    }

    public static LambdaLogger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }

    private static LambdaLogger buildLambdaLogger(Logger workingLogger) {
        if (workingLogger instanceof LocationAwareLogger) {
            return new LambdaLoggerLocationAwareImpl((LocationAwareLogger) workingLogger);
        }
        return new LambdaLoggerPlainImpl(workingLogger);
    }
}
