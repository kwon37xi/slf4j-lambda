package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import kr.pe.kwonnam.slf4jlambda.AbstractLambdaLoggerFactory;
import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.spi.LocationAwareLogger;

/**
 * LambdaLoggerFactory for LambdaLoggerLocationAwareImpl and LambdaLoggerPlainImpl.
 *
 * @see LambdaLoggerLocationAwareImpl
 * @see LambdaLoggerPlainImpl
 */
public class DefaultLambdaLoggerFactory extends AbstractLambdaLoggerFactory {

    public DefaultLambdaLoggerFactory(ILoggerFactory underlyingLoggerFactory) {
        super(underlyingLoggerFactory);
    }

    @Override
    public LambdaLogger buildLambdaLogger(Logger underlyingLogger) {
        if (underlyingLogger instanceof LocationAwareLogger) {
            return new LambdaLoggerLocationAwareImpl((LocationAwareLogger) underlyingLogger);
        }
        return new LambdaLoggerPlainImpl(underlyingLogger);
    }
}
