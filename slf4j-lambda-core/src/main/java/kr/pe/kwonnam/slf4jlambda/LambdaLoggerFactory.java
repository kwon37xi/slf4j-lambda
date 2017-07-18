package kr.pe.kwonnam.slf4jlambda;

public class LambdaLoggerFactory {
    public static LambdaLogger getLogger(String name) {
        return null;
    }

    public static LambdaLogger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }
}
