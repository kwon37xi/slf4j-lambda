package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.function.Supplier;

public class LambdaLoggerPlainImpl implements LambdaLogger {
    /** Real Slf4j logger instance */
    private Logger workingLogger;

    public LambdaLoggerPlainImpl(Logger workingLogger) {
        this.workingLogger = workingLogger;
    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void debug(String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void debug(Supplier<?> msgSupplier) {

    }

    @Override
    public void debug(Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void debug(Marker marker, String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier) {

    }

    @Override
    public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void error(String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void error(String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void error(Supplier<?> msgSupplier) {

    }

    @Override
    public void error(Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void error(Marker marker, String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier) {

    }

    @Override
    public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void info(String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void info(String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void info(Supplier<?> msgSupplier) {

    }

    @Override
    public void info(Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void info(Marker marker, String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier) {

    }

    @Override
    public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void trace(String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void trace(Supplier<?> msgSupplier) {

    }

    @Override
    public void trace(Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void trace(Marker marker, String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier) {

    }

    @Override
    public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void warn(String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void warn(Supplier<?> msgSupplier) {

    }

    @Override
    public void warn(Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1) {

    }

    @Override
    public void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {

    }

    @Override
    public void warn(Marker marker, String format, Supplier<?>[] argSuppliers) {

    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier) {

    }

    @Override
    public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
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
        return false;
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
        return false;
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
        return false;
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
        return false;
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
        return false;
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
        return false;
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
        return false;
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
        return false;
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
        return false;
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
}
