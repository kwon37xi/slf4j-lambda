package kr.pe.kwonnam.slf4jlambda;

import com.sun.media.jfxmedia.logging.Logger;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

import java.util.function.Supplier;

public class LambdaLoggerLocationAwareImpl implements LambdaLogger, LocationAwareLogger {
    public static final String FQCN = LambdaLoggerLocationAwareImpl.class.getName();

    /**
     * Real Slf4j logger instance
     */
    private LocationAwareLogger workingLogger;

    public LambdaLoggerLocationAwareImpl(LocationAwareLogger workingLogger) {
        if (workingLogger == null) {
            throw new IllegalArgumentException("workingLogger must not be null.");
        }

        this.workingLogger = workingLogger;
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void debug(String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void debug(Supplier<?> msgSupplier) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void debug(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isDebugEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, String.valueOf(msgSupplier), null, null);
        }
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isDebugEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, String.valueOf(msgSupplier), null, t);
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void error(String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier), null, null);
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isErrorEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier), null, t);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isErrorEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{argSupplier1}, null);
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{argSupplier1, argSupplier2}, null);
        }
    }

    @Override
    public void info(String format, Supplier<?>[] argSuppliers) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void info(Supplier<?> msgSupplier) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void info(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isInfoEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void info(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isInfoEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void trace(String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isTraceEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isTraceEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void warn(String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isWarnEnabled()) {
            workingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{argSupplier1.get()}, null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{argSupplier1.get(), argSupplier2.get()}, null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (workingLogger.isWarnEnabled(marker)) {
            workingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void log(Marker marker, String fqcn, int level, String message, Object[] argArray, Throwable t) {
        workingLogger.log(marker, fqcn, level, message, argArray, t);
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

    }

    @Override
    public void trace(String format, Object arg) {

    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {

    }

    @Override
    public void trace(String format, Object... arguments) {

    }

    @Override
    public void trace(String msg, Throwable t) {

    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return workingLogger.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {

    }

    @Override
    public void trace(Marker marker, String format, Object arg) {

    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {

    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {

    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {

    }

    @Override
    public boolean isDebugEnabled() {
        return workingLogger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {

    }

    @Override
    public void debug(String format, Object arg) {

    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {

    }

    @Override
    public void debug(String format, Object... arguments) {

    }

    @Override
    public void debug(String msg, Throwable t) {

    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return workingLogger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {

    }

    @Override
    public void debug(Marker marker, String format, Object arg) {

    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {

    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {

    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {

    }

    @Override
    public boolean isInfoEnabled() {
        return workingLogger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {

    }

    @Override
    public void info(String format, Object arg) {

    }

    @Override
    public void info(String format, Object arg1, Object arg2) {

    }

    @Override
    public void info(String format, Object... arguments) {

    }

    @Override
    public void info(String msg, Throwable t) {

    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return workingLogger.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {

    }

    @Override
    public void info(Marker marker, String format, Object arg) {

    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {

    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {

    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {

    }

    @Override
    public boolean isWarnEnabled() {
        return workingLogger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {

    }

    @Override
    public void warn(String format, Object arg) {

    }

    @Override
    public void warn(String format, Object... arguments) {

    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {

    }

    @Override
    public void warn(String msg, Throwable t) {

    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return workingLogger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {

    }

    @Override
    public void warn(Marker marker, String format, Object arg) {

    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {

    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {

    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {

    }

    @Override
    public boolean isErrorEnabled() {
        return workingLogger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {

    }

    @Override
    public void error(String format, Object arg) {

    }

    @Override
    public void error(String format, Object arg1, Object arg2) {

    }

    @Override
    public void error(String format, Object... arguments) {

    }

    @Override
    public void error(String msg, Throwable t) {

    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return workingLogger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {

    }

    @Override
    public void error(Marker marker, String format, Object arg) {

    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {

    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {

    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {

    }

    private Object[] argSuppliersToArgs(Supplier<?>[] argSuppliers) {
        Object[] args = new Object[argSuppliers.length];
        for (int i = 0; i < argSuppliers.length; i++) {
            args[i] = argSuppliers[i].get();
        }
        return args;
    }
}
