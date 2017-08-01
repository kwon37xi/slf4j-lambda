package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.function.Supplier;

import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.argSuppliersToArgs;

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
    public void debug(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(format, argSupplier1.get());
        }
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void debug(String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void debug(Supplier<?> msgSupplier) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void debug(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.debug(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.debug(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.debug(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.debug(marker, String.valueOf(msgSupplier));
        }
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.debug(marker, String.valueOf(msgSupplier), t);
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(format, argSupplier1.get());
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void error(String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(String.valueOf(msgSupplier));
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(String.valueOf(msgSupplier), t);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.error(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.error(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.error(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.error(marker, String.valueOf(msgSupplier));
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.error(marker, String.valueOf(msgSupplier), t);
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(format, argSupplier1.get());
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(format, argSupplier1.get());
        }
    }

    @Override
    public void info(String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void info(Supplier<?> msgSupplier) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void info(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.info(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.info(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.info(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.info(marker, String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.info(marker, String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.trace(format, argSupplier1.get());
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.trace(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void trace(String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.trace(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.trace(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.trace(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.trace(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.trace(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.trace(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.trace(marker, String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.trace(marker, String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(format, argSupplier1.get());
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void warn(String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.warn(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.warn(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.warn(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.warn(marker, String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.warn(marker, String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public String getName() {
        return underlyingLogger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return underlyingLogger.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        underlyingLogger.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        underlyingLogger.trace(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        underlyingLogger.trace(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        underlyingLogger.trace(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        underlyingLogger.trace(msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return underlyingLogger.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {
        underlyingLogger.trace(marker, msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        underlyingLogger.trace(marker, format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        underlyingLogger.trace(marker, format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... arguments) {
        underlyingLogger.trace(marker, format, arguments);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        underlyingLogger.trace(marker, msg, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return underlyingLogger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        underlyingLogger.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        underlyingLogger.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        underlyingLogger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        underlyingLogger.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        underlyingLogger.debug(msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return underlyingLogger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {
        underlyingLogger.debug(marker, msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        underlyingLogger.debug(marker, format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        underlyingLogger.debug(marker, format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        underlyingLogger.debug(marker, format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        underlyingLogger.debug(marker, msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return underlyingLogger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        underlyingLogger.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        underlyingLogger.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        underlyingLogger.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        underlyingLogger.info(format, arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        underlyingLogger.info(msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return underlyingLogger.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {
        underlyingLogger.info(marker, msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        underlyingLogger.info(marker, format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        underlyingLogger.info(marker, format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        underlyingLogger.info(marker, format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        underlyingLogger.info(marker, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return underlyingLogger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        underlyingLogger.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        underlyingLogger.warn(format, arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        underlyingLogger.warn(format, arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        underlyingLogger.warn(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        underlyingLogger.warn(msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return underlyingLogger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {
        underlyingLogger.warn(marker, msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        underlyingLogger.warn(marker, format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        underlyingLogger.warn(marker, format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        underlyingLogger.warn(marker, format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        underlyingLogger.warn(marker, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return underlyingLogger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        underlyingLogger.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        underlyingLogger.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        underlyingLogger.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        underlyingLogger.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        underlyingLogger.error(msg, t);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return underlyingLogger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {
        underlyingLogger.error(marker, msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        underlyingLogger.error(marker, format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        underlyingLogger.error(marker, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        underlyingLogger.error(marker, format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        underlyingLogger.error(marker, msg, t);
    }
}
