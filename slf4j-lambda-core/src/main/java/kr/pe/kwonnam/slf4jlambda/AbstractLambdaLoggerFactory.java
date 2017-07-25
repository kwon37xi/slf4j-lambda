package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractLambdaLoggerFactory implements ILambdaLoggerFactory {
    @Override
    public LambdaLogger getLogger(String name) {
        final Logger workingLogger = LoggerFactory.getLogger(name);
        return buildLambdaLogger(workingLogger);
    }

    public abstract LambdaLogger buildLambdaLogger(Logger workingLogger);
}
