package kr.pe.kwonnam.slf4jlambda;

/**
 * Create {@link LambdaLogger} instance.
 */
public class LambdaLoggerFactory {
    private static ILambdaLoggerFactory lambdaLoggerFactory;

    static {
        lambdaLoggerFactory = new DefaultLambdaLoggerFactory();
    }

    public static LambdaLogger getLogger(String name) {
        return getLoggerFactory().getLogger(name);
    }

    public static LambdaLogger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }

    public static ILambdaLoggerFactory getLoggerFactory() {
        return lambdaLoggerFactory;
    }
}
