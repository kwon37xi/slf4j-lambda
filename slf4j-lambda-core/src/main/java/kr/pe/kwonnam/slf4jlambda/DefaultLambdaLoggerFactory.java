package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.spi.LocationAwareLogger;

public class DefaultLambdaLoggerFactory extends AbstractLambdaLoggerFactory {
    public LambdaLogger buildLambdaLogger(Logger workingLogger) {
        if (workingLogger instanceof LocationAwareLogger) {
            return new LambdaLoggerLocationAwareImpl((LocationAwareLogger) workingLogger);
        }
        return new LambdaLoggerPlainImpl(workingLogger);
    }
}
