package kr.pe.kwonnam.slf4jlambda;

import kr.pe.kwonnam.slf4jlambda.defaultlogger.DefaultLambdaLoggerFactory;
import org.slf4j.LoggerFactory;

/**
 * Create {@link LambdaLogger} instance.
 */
public class LambdaLoggerFactory {
    private static ILambdaLoggerFactory lambdaLoggerFactory;

    static {
        lambdaLoggerFactory = new DefaultLambdaLoggerFactory(LoggerFactory.getILoggerFactory());
    }

    public static LambdaLogger getLogger(String name) {
        return getILambdaLoggerFactory().getLogger(name);
    }

    public static LambdaLogger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }

    public static ILambdaLoggerFactory getILambdaLoggerFactory() {
        return lambdaLoggerFactory;
    }
}
