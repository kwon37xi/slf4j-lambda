package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.spi.LocationAwareLogger;

import java.util.function.Supplier;

import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.argSuppliersToArgs;
import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.isLogLevelEnabled;

/**
 * LambdaLoggerLocationAwareImpl is for slf4j implementation that supports {@link org.slf4j.spi.LocationAwareLogger}.
 *
 * Logback supports LocationAwareLogger.
 */
public class LambdaLoggerLocationAwareImpl implements LambdaLogger, LocationAwareLogger {

    /** MUST use LambdaLogger's FQCN because LambdaLogger default methods do logs */
    public static final String FQCN = LambdaLogger.class.getName();

    /**
     * Real Slf4j logger instance
     */
    private LocationAwareLogger underlyingLogger;

    public LambdaLoggerLocationAwareImpl(LocationAwareLogger underlyingLogger) {
        if (underlyingLogger == null) {
            throw new IllegalArgumentException("underlyingLogger must not be null.");
        }

        this.underlyingLogger = underlyingLogger;
    }

    /** return logger's fully qualified class name for LocationAwareLogger */
    protected String getLoggerFQCN() {
        return FQCN;
    }

    @Override
    public Logger getUnderlyingLogger() {
        return underlyingLogger;
    }

    @Override
    public void doLog(Marker marker, Level level, Supplier<String> msgSupplier, Throwable t) {
        if (isLogLevelEnabled(underlyingLogger, level, marker)) {
            underlyingLogger.log(marker, getLoggerFQCN(), level.toInt(), msgSupplier.get(), null, t);
        }
    }

    @Override
    public void doLog(Marker marker, Level level, String format, Supplier<?>[] argSuppliers, Throwable t) {
        if (isLogLevelEnabled(underlyingLogger, level, marker)) {
            underlyingLogger.log(marker, getLoggerFQCN(), level.toInt(), format, argSuppliersToArgs(argSuppliers), t);
        }
    }

    @Override
    public void doLog(Marker marker, Level level, String format, Object[] arguments, Throwable t) {
        if (isLogLevelEnabled(underlyingLogger, level, marker)) {
            underlyingLogger.log(marker, getLoggerFQCN(), level.toInt(), format, arguments, t);
        }
    }

    @Override
    public void log(Marker marker, String fqcn, int level, String message, Object[] arguments, Throwable t) {
        underlyingLogger.log(marker, fqcn, level, message, arguments, t);
    }
}