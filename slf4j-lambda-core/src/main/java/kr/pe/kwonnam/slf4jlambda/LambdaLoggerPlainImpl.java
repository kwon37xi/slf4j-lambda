package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.function.Supplier;

import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.argSuppliersToArgs;

public class LambdaLoggerPlainImpl implements LambdaLogger {
    /**
     * Real Slf4j logger instance
     */
    private Logger workingLogger;

    public LambdaLoggerPlainImpl(Logger workingLogger) {
        if (workingLogger == null) {
            throw new IllegalArgumentException("workingLogger must not be null.");
        }

        this.workingLogger = workingLogger;
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.debug(format, argSupplier1.get());
        }
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.debug(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void debug(String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.debug(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void debug(Supplier<?> msgSupplier) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.debug(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void debug(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.debug(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.debug(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.debug(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.debug(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.debug(marker, String.valueOf(msgSupplier));
        }
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.debug(marker, String.valueOf(msgSupplier), t);
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.error(format, argSupplier1.get());
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.error(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void error(String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.error(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.error(String.valueOf(msgSupplier));
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.error(String.valueOf(msgSupplier), t);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.error(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.error(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.error(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.error(marker, String.valueOf(msgSupplier));
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.error(marker, String.valueOf(msgSupplier), t);
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.info(format, argSupplier1.get());
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.info(format, argSupplier1.get());
        }
    }

    @Override
    public void info(String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.info(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void info(Supplier<?> msgSupplier) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.info(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void info(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.info(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.info(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.info(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.info(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.info(marker, String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.info(marker, String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.trace(format, argSupplier1.get());
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.trace(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void trace(String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.trace(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.trace(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.trace(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.trace(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.trace(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.trace(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.trace(marker, String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.trace(marker, String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.warn(format, argSupplier1.get());
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.warn(format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void warn(String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.warn(format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.warn(String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.warn(String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.warn(marker, format, argSupplier1.get());
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.warn(marker, format, argSupplier1.get(), argSupplier2.get());
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.warn(marker, format, argSuppliersToArgs(argSuppliers));
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.warn(marker, String.valueOf(msgSupplier.get()));
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.warn(marker, String.valueOf(msgSupplier.get()), t);
        }
    }

    @Override
    public String getName() {
        return workingLogger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return workingLogger.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        workingLogger.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        workingLogger.trace(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        workingLogger.trace(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        workingLogger.trace(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        workingLogger.trace(msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return workingLogger.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {
        workingLogger.trace(marker, msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        workingLogger.trace(marker, format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        workingLogger.trace(marker, format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... arguments) {
        workingLogger.trace(marker, format, arguments);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        workingLogger.trace(marker, msg, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return workingLogger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        workingLogger.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        workingLogger.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        workingLogger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        workingLogger.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        workingLogger.debug(msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return workingLogger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {
        workingLogger.debug(marker, msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        workingLogger.debug(marker, format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        workingLogger.debug(marker, format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        workingLogger.debug(marker, format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        workingLogger.debug(marker, msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return workingLogger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        workingLogger.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        workingLogger.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        workingLogger.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        workingLogger.info(format, arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        workingLogger.info(msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return workingLogger.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {
        workingLogger.info(marker, msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        workingLogger.info(marker, format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        workingLogger.info(marker, format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        workingLogger.info(marker, format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        workingLogger.info(marker, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return workingLogger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        workingLogger.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        workingLogger.warn(format, arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        workingLogger.warn(format, arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        workingLogger.warn(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        workingLogger.warn(msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return workingLogger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {
        workingLogger.warn(marker, msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        workingLogger.warn(marker, format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        workingLogger.warn(marker, format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        workingLogger.warn(marker, format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        workingLogger.warn(marker, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return workingLogger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        workingLogger.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        workingLogger.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        workingLogger.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        workingLogger.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        workingLogger.error(msg, t);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return workingLogger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {
        workingLogger.error(marker, msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        workingLogger.error(marker, format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        workingLogger.error(marker, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        workingLogger.error(marker, format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        workingLogger.error(marker, msg, t);
    }
}
