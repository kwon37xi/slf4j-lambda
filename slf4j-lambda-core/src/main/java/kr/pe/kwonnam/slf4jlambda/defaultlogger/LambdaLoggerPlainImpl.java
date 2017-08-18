package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

import java.text.MessageFormat;
import java.util.function.Supplier;

import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.argSuppliersToArgs;

/**
 * LambdaLoggerPlainImpl is for slf4j implementation that does not support {@link org.slf4j.spi.LocationAwareLogger}.
 * <p>
 * slf4j-simple does not support LocationAwareLogger.
 */
public class LambdaLoggerPlainImpl implements LambdaLogger {
    /**
     * Real Slf4j logger instance
     */
    private Logger underlyingLogger;

    public LambdaLoggerPlainImpl(Logger underlyingLogger) {
        if (underlyingLogger == null) {
            throw new IllegalArgumentException("underlyingLogger must not be null.");
        }

        this.underlyingLogger = underlyingLogger;
    }

    @Override
    public Logger getUnderlyingLogger() {
        return underlyingLogger;
    }

    @Override
    public void doLog(Marker marker, Level level, Supplier<String> msgSupplier, Throwable t) {
        if (!LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, level, marker)) {
            return;
        }

        logFormatted(marker, level, msgSupplier.get(), t);
    }

    private void logFormatted(Marker marker, Level level, String msg, Throwable t) {
        switch (level) {
            case TRACE:
                underlyingLogger.trace(marker, msg, t);
                break;
            case DEBUG:
                underlyingLogger.debug(marker, msg, t);
                break;
            case INFO:
                underlyingLogger.info(marker, msg, t);
                break;
            case WARN:
                underlyingLogger.warn(marker, msg, t);
                break;
            case ERROR:
                underlyingLogger.error(marker, msg, t);
                break;
            default:
                System.err.println("Log Level level " + level + " is unknown.");
                return;
        }
    }

    @Override
    public void doLog(Marker marker, Level level, String format, Supplier<?>[] argSuppliers, Throwable t) {
        if (!LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, level, marker)) {
            return;
        }

        if (argSuppliers == null) {
            logFormatted(marker, level, format, t);
        } else {
            FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, argSuppliersToArgs(argSuppliers), t);
            logFormatted(marker, level, formattingTuple.getMessage(), formattingTuple.getThrowable());
        }
    }

    @Override
    public void doLog(Marker marker, Level level, String format, Object[] arguments, Throwable t) {
        if (!LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, level, marker)) {
            return;
        }

        if (arguments == null) {
            logFormatted(marker, level, format, t);
        } else {
            FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, arguments, t);
            logFormatted(marker, level, formattingTuple.getMessage(), formattingTuple.getThrowable());
        }
    }
}
