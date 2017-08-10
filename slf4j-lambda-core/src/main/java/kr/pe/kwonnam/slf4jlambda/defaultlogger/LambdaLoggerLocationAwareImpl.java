package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.spi.LocationAwareLogger;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Supplier;

import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.argSuppliersToArgs;
import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.asStr;
import static kr.pe.kwonnam.slf4jlambda.LambdaLoggerUtils.isLogLevelEnabled;

public class LambdaLoggerLocationAwareImpl implements LambdaLogger {

    public static final String FQCN = LambdaLoggerLocationAwareImpl.class.getName();

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

    @Override
    public void debug(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.DEBUG, format, new Supplier<?>[]{argSupplier1}, null);
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.DEBUG, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    @Override
    public void debug(String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.DEBUG, format, argSuppliers, null);
    }

    @Override
    public void debug(Supplier<?> msgSupplier) {
        doLog(null, Level.DEBUG, msgSupplier, null);
    }

    @Override
    public void debug(Supplier<?> msgSupplier, Throwable t) {
        doLog(null, Level.DEBUG, msgSupplier, t);
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(marker, Level.DEBUG, format, new Supplier[]{argSupplier1}, null);
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(marker, Level.DEBUG, format, new Supplier[]{argSupplier1, argSupplier2}, null);
    }

    @Override
    public void debug(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(marker, Level.DEBUG, format, argSuppliers, null);
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier) {
        doLog(marker, Level.DEBUG, msgSupplier, null);
    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        doLog(marker, Level.DEBUG, msgSupplier, t);
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSupplier1), null);
        }
    }

    @Override
    public void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSupplier1, argSupplier2), null);
        }
    }

    @Override
    public void error(String format, Supplier<?>... argSuppliers) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void error(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSupplier1), null);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSupplier1, argSupplier2), null);
        }
    }

    @Override
    public void error(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.INFO, format, new Supplier<?>[]{argSupplier1}, null);
    }

    @Override
    public void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.INFO, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    @Override
    public void info(String format, Supplier<?>[] argSuppliers) {
        doLog(null, Level.INFO, format, argSuppliers, null);
    }

    @Override
    public void info(Supplier<?> msgSupplier) {
        doLog(null, Level.INFO, msgSupplier, null);
    }

    @Override
    public void info(Supplier<?> msgSupplier, Throwable t) {
        doLog(null, Level.INFO, msgSupplier, t);
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(marker, Level.INFO, format, new Supplier<?>[]{argSupplier1}, null);
    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(marker, Level.INFO, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    @Override
    public void info(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(marker, Level.INFO, format, argSuppliers, null);
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier) {
        doLog(marker, Level.INFO, msgSupplier, null);
    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        doLog(marker, Level.INFO, msgSupplier, t);
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSupplier1), null);
        }
    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSupplier1, argSupplier2), null);
        }
    }

    @Override
    public void trace(String format, Supplier<?>... argSuppliers) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void trace(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSupplier1), null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSupplier1, argSupplier2), null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSupplier1), null);
        }
    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSupplier1, argSupplier2), null);
        }
    }

    @Override
    public void warn(String format, Supplier<?>... argSuppliers) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void warn(Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSupplier1), null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSupplier1, argSupplier2), null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Supplier<?>... argSuppliers) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, argSuppliersToArgs(argSuppliers), null);
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, null);
        }
    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, String.valueOf(msgSupplier.get()), null, t);
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
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, msg, null, null);
        }
    }

    @Override
    public void trace(String format, Object arg) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void trace(String format, Object... arguments) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, format, arguments, null);
        }
    }

    @Override
    public void trace(String msg, Throwable t) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.TRACE_INT, msg, null, t);
        }
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return underlyingLogger.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, msg, null, null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Object... arguments) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, format, arguments, null);
        }
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        if (underlyingLogger.isTraceEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.TRACE_INT, msg, null, t);
        }
    }

    @Override
    public boolean isDebugEnabled() {
        return underlyingLogger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, null);
        }
    }

    @Override
    public void debug(String format, Object arg) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void debug(String format, Object... arguments) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, format, arguments, null);
        }
    }

    @Override
    public void debug(String msg, Throwable t) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, t);
        }
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return underlyingLogger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, null);
        }
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, format, arguments, null);
        }
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        if (underlyingLogger.isDebugEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, t);
        }
    }

    @Override
    public boolean isInfoEnabled() {
        return underlyingLogger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, msg, null, null);
        }
    }

    @Override
    public void info(String format, Object arg) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void info(String format, Object... arguments) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, format, arguments, null);
        }
    }

    @Override
    public void info(String msg, Throwable t) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.INFO_INT, msg, null, t);
        }
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return underlyingLogger.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, msg, null, null);
        }
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, format, arguments, null);
        }
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        if (underlyingLogger.isInfoEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.INFO_INT, msg, null, t);
        }
    }

    @Override
    public boolean isWarnEnabled() {
        return underlyingLogger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, msg, null, null);
        }
    }

    @Override
    public void warn(String format, Object arg) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void warn(String format, Object... arguments) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, format, arguments, null);
        }
    }

    @Override
    public void warn(String msg, Throwable t) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.WARN_INT, msg, null, t);
        }
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return underlyingLogger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, msg, null, null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, format, arguments, null);
        }
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        if (underlyingLogger.isWarnEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.WARN_INT, msg, null, t);
        }
    }

    @Override
    public boolean isErrorEnabled() {
        return underlyingLogger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, msg, null, null);
        }
    }

    @Override
    public void error(String format, Object arg) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void error(String format, Object... arguments) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, format, arguments, null);
        }
    }

    @Override
    public void error(String msg, Throwable t) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.log(null, FQCN, LocationAwareLogger.ERROR_INT, msg, null, t);
        }
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return underlyingLogger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, msg, null, null);
        }
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{arg}, null);
        }
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, new Object[]{arg1, arg2}, null);
        }
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, format, arguments, null);
        }
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        if (underlyingLogger.isErrorEnabled(marker)) {
            underlyingLogger.log(marker, FQCN, LocationAwareLogger.ERROR_INT, msg, null, t);
        }
    }

    @Override
    public void doLog(Marker marker, Level level, Supplier<?> msgSupplier, Throwable t) {
        if (isLogLevelEnabled(underlyingLogger, level, marker)) {
            underlyingLogger.log(marker, FQCN, level.toInt(), asStr(msgSupplier.get()), null, t);
        }
    }

    @Override
    public void doLog(Marker marker, Level level, String format, Supplier<?>[] argSuppliers, Throwable t) {
        if (isLogLevelEnabled(underlyingLogger, level, marker)) {
            underlyingLogger.log(marker, FQCN, level.toInt(), format, argSuppliersToArgs(argSuppliers), t);
        }
    }

    @Override
    public void doLog(Marker marker, Level level, String format, Object[] arguments, Throwable t) {
        if (isLogLevelEnabled(underlyingLogger, level, marker)) {
            underlyingLogger.log(marker, FQCN, level.toInt(), format, arguments, t);
        }
    }

}