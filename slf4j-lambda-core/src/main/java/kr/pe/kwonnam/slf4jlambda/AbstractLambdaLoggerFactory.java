package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractLambdaLoggerFactory implements ILambdaLoggerFactory {

    private ILoggerFactory underlyingLoggerFactory;

    private ConcurrentHashMap<String, LambdaLogger> loggers = new ConcurrentHashMap<>();

    public AbstractLambdaLoggerFactory(ILoggerFactory underlyingLoggerFactory) {
        this.underlyingLoggerFactory = underlyingLoggerFactory;
    }

    @Override
    public ILoggerFactory getUnderlyingLoggerFactory() {
        return underlyingLoggerFactory;
    }

    @Override
    public LambdaLogger getLogger(String name) {
        return loggers.computeIfAbsent(name, this::doBuildLambdaLogger);
    }

    private LambdaLogger doBuildLambdaLogger(String name) {
        final Logger underlyingLogger = LoggerFactory.getLogger(name);
        return buildLambdaLogger(underlyingLogger);
    }

    /**
     * build LambdaLogger object.
     */
    public abstract LambdaLogger buildLambdaLogger(Logger underlyingLogger);
}