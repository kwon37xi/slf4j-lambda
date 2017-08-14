package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

import java.util.function.Supplier;

public interface LambdaLogger extends Logger {

    Logger getUnderlyingLogger();

    default String getName() {
        return getUnderlyingLogger().getName();
    }

    default boolean isTraceEnabled() {
        return getUnderlyingLogger().isTraceEnabled();
    }

    default void trace(String msg) {
        doLog(null, Level.TRACE, msg, null, null);
    }

    default void trace(String format, Object arg) {
        doLog(null, Level.TRACE, format, new Object[]{arg}, null);
    }

    default void trace(String format, Object arg1, Object arg2) {
        doLog(null, Level.TRACE, format, new Object[]{arg1, arg2}, null);
    }

    default void trace(String format, Object... arguments) {
        doLog(null, Level.TRACE, format, arguments, null);
    }

    default void trace(String msg, Throwable t) {
        doLog(null, Level.TRACE, msg, null, t);
    }

    default boolean isTraceEnabled(Marker marker) {
        return getUnderlyingLogger().isTraceEnabled(marker);
    }

    default void trace(Marker marker, String msg) {
        doLog(marker, Level.TRACE, msg, null, null);
    }

    default void trace(Marker marker, String format, Object arg) {
        doLog(marker, Level.TRACE, format, new Object[]{arg}, null);
    }

    default void trace(Marker marker, String format, Object arg1, Object arg2) {
        doLog(marker, Level.TRACE, format, new Object[]{arg1, arg2}, null);
    }

    default void trace(Marker marker, String format, Object... arguments) {
        doLog(marker, Level.TRACE, format, arguments, null);
    }

    default void trace(Marker marker, String msg, Throwable t) {
        doLog(marker, Level.TRACE, msg, null, t);
    }

    default boolean isDebugEnabled() {
        return getUnderlyingLogger().isDebugEnabled();
    }

    default void debug(String msg) {
        doLog(null, Level.DEBUG, msg, null, null);
    }

    default void debug(String format, Object arg) {
        doLog(null, Level.DEBUG, format, new Object[]{arg}, null);
    }

    default void debug(String format, Object arg1, Object arg2) {
        doLog(null, Level.DEBUG, format, new Object[]{arg1, arg2}, null);
    }

    default void debug(String format, Object... arguments) {
        doLog(null, Level.DEBUG, format, arguments, null);
    }

    default void debug(String msg, Throwable t) {
        doLog(null, Level.DEBUG, msg, null, t);
    }

    default boolean isDebugEnabled(Marker marker) {
        return getUnderlyingLogger().isDebugEnabled(marker);
    }

    default void debug(Marker marker, String msg) {
        doLog(marker, Level.DEBUG, msg, null, null);
    }

    default void debug(Marker marker, String format, Object arg) {
        doLog(marker, Level.DEBUG, format, new Object[]{arg}, null);
    }

    default void debug(Marker marker, String format, Object arg1, Object arg2) {
        doLog(marker, Level.DEBUG, format, new Object[]{arg1, arg2}, null);
    }

    default void debug(Marker marker, String format, Object... arguments) {
        doLog(marker, Level.DEBUG, format, arguments, null);
    }

    default void debug(Marker marker, String msg, Throwable t) {
        doLog(marker, Level.DEBUG, msg, null, t);
    }

    default boolean isInfoEnabled() {
        return getUnderlyingLogger().isInfoEnabled();
    }

    default void info(String msg) {
        doLog(null, Level.INFO, msg, null, null);
    }

    default void info(String format, Object arg) {
        doLog(null, Level.INFO, format, new Object[]{arg}, null);
    }

    default void info(String format, Object arg1, Object arg2) {
        doLog(null, Level.INFO, format, new Object[]{arg1, arg2}, null);
    }

    default void info(String format, Object... arguments) {
        doLog(null, Level.INFO, format, arguments, null);
    }

    default void info(String msg, Throwable t) {
        doLog(null, Level.INFO, msg, null, t);
    }

    default boolean isInfoEnabled(Marker marker) {
        return getUnderlyingLogger().isInfoEnabled(marker);
    }

    default void info(Marker marker, String msg) {
        doLog(marker, Level.INFO, msg, null, null);
    }

    default void info(Marker marker, String format, Object arg) {
        doLog(marker, Level.INFO, format, new Object[]{arg}, null);
    }

    default void info(Marker marker, String format, Object arg1, Object arg2) {
        doLog(marker, Level.INFO, format, new Object[]{arg1, arg2}, null);
    }

    default void info(Marker marker, String format, Object... arguments) {
        doLog(marker, Level.INFO, format, arguments, null);
    }

    default void info(Marker marker, String msg, Throwable t) {
        doLog(marker, Level.INFO, msg, null, t);
    }

    default boolean isWarnEnabled() {
        return getUnderlyingLogger().isWarnEnabled();
    }

    default void warn(String msg) {
        doLog(null, Level.WARN, msg, null, null);
    }

    default void warn(String format, Object arg) {
        doLog(null, Level.WARN, format, new Object[]{arg}, null);
    }

    default void warn(String format, Object arg1, Object arg2) {
        doLog(null, Level.WARN, format, new Object[]{arg1, arg2}, null);
    }

    default void warn(String format, Object... arguments) {
        doLog(null, Level.WARN, format, arguments, null);
    }

    default void warn(String msg, Throwable t) {
        doLog(null, Level.WARN, msg, null, t);
    }

    default boolean isWarnEnabled(Marker marker) {
        return getUnderlyingLogger().isWarnEnabled(marker);
    }

    default void warn(Marker marker, String msg) {
        doLog(marker, Level.WARN, msg, null, null);
    }

    default void warn(Marker marker, String format, Object arg) {
        doLog(marker, Level.WARN, format, new Object[]{arg}, null);
    }

    default void warn(Marker marker, String format, Object arg1, Object arg2) {
        doLog(marker, Level.WARN, format, new Object[]{arg1, arg2}, null);
    }

    default void warn(Marker marker, String format, Object... arguments) {
        doLog(marker, Level.WARN, format, arguments, null);
    }

    default void warn(Marker marker, String msg, Throwable t) {
        doLog(marker, Level.WARN, msg, null, t);
    }

    default boolean isErrorEnabled() {
        return getUnderlyingLogger().isErrorEnabled();
    }

    default void error(String msg) {
        doLog(null, Level.ERROR, msg, null, null);
    }

    default void error(String format, Object arg) {
        doLog(null, Level.ERROR, format, new Object[]{arg}, null);
    }

    default void error(String format, Object arg1, Object arg2) {
        doLog(null, Level.ERROR, format, new Object[]{arg1, arg2}, null);
    }

    default void error(String format, Object... arguments) {
        doLog(null, Level.ERROR, format, arguments, null);
    }

    default void error(String msg, Throwable t) {
        doLog(null, Level.ERROR, msg, null, t);
    }

    default boolean isErrorEnabled(Marker marker) {
        return getUnderlyingLogger().isErrorEnabled(marker);
    }

    default void error(Marker marker, String msg) {
        doLog(marker, Level.ERROR, msg, null, null);
    }

    default void error(Marker marker, String format, Object arg) {
        doLog(marker, Level.ERROR, format, new Object[]{arg}, null);
    }

    default void error(Marker marker, String format, Object arg1, Object arg2) {
        doLog(marker, Level.ERROR, format, new Object[]{arg1, arg2}, null);
    }

    default void error(Marker marker, String format, Object... arguments) {
        doLog(marker, Level.ERROR, format, arguments, null);
    }

    default void error(Marker marker, String msg, Throwable t) {
        doLog(marker, Level.ERROR, msg, null, t);
    }

    /**
     * {@link #trace(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void trace(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.TRACE, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #trace(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.TRACE, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #trace(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void trace(String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.TRACE, format, argSuppliers, null);
    }

    /**
     * {@link #trace(java.lang.String)} with a lambda message supplier.
     */
    default void trace(Supplier<String> msgSupplier) {
        doLog(null, Level.TRACE, msgSupplier, null);
    }

    /**
     * {@link #trace(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void trace(Supplier<String> msgSupplier, Throwable t) {
        doLog(null, Level.TRACE, msgSupplier, t);
    }

    /**
     * {@link #trace(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void trace(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(null, Level.TRACE, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #trace(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.TRACE, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #trace(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void trace(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.TRACE, format, argSuppliers, null);
    }

    /**
     * {@link #trace(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    default void trace(Marker marker, Supplier<String> msgSupplier) {
        doLog(marker, Level.TRACE, msgSupplier, null);
    }

    /**
     * {@link #trace(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void trace(Marker marker, Supplier<String> msgSupplier, Throwable t) {
        doLog(marker, Level.TRACE, msgSupplier, t);
    }

    /**
     * {@link #debug(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void debug(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.DEBUG, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #debug(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.DEBUG, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #debug(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void debug(String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.DEBUG, format, argSuppliers, null);
    }

    /**
     * {@link #debug(java.lang.String)} with a lambda message supplier.
     */
    default void debug(Supplier<String> msgSupplier) {
        doLog(null, Level.DEBUG, msgSupplier, null);
    }

    /**
     * {@link #debug(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void debug(Supplier<String> msgSupplier, Throwable t) {
        doLog(null, Level.DEBUG, msgSupplier, t);
    }

    /**
     * {@link #debug(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void debug(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(null, Level.DEBUG, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #debug(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.DEBUG, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #debug(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void debug(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.DEBUG, format, argSuppliers, null);
    }

    /**
     * {@link #debug(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    default void debug(Marker marker, Supplier<String> msgSupplier) {
        doLog(marker, Level.DEBUG, msgSupplier, null);
    }

    /**
     * {@link #debug(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void debug(Marker marker, Supplier<String> msgSupplier, Throwable t) {
        doLog(marker, Level.DEBUG, msgSupplier, t);
    }


    /**
     * {@link #info(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void info(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.INFO, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #info(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.INFO, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #info(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void info(String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.INFO, format, argSuppliers, null);
    }

    /**
     * {@link #info(java.lang.String)} with a lambda message supplier.
     */
    default void info(Supplier<String> msgSupplier) {
        doLog(null, Level.INFO, msgSupplier, null);
    }

    /**
     * {@link #info(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void info(Supplier<String> msgSupplier, Throwable t) {
        doLog(null, Level.INFO, msgSupplier, t);
    }

    /**
     * {@link #info(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void info(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(null, Level.INFO, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #info(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.INFO, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #info(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void info(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.INFO, format, argSuppliers, null);
    }

    /**
     * {@link #info(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    default void info(Marker marker, Supplier<String> msgSupplier) {
        doLog(marker, Level.INFO, msgSupplier, null);
    }

    /**
     * {@link #info(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void info(Marker marker, Supplier<String> msgSupplier, Throwable t) {
        doLog(marker, Level.INFO, msgSupplier, t);
    }


    /**
     * {@link #warn(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void warn(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.WARN, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #warn(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.WARN, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #warn(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void warn(String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.WARN, format, argSuppliers, null);
    }

    /**
     * {@link #warn(java.lang.String)} with a lambda message supplier.
     */
    default void warn(Supplier<String> msgSupplier) {
        doLog(null, Level.WARN, msgSupplier, null);
    }

    /**
     * {@link #warn(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void warn(Supplier<String> msgSupplier, Throwable t) {
        doLog(null, Level.WARN, msgSupplier, t);
    }

    /**
     * {@link #warn(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void warn(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(null, Level.WARN, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #warn(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.WARN, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #warn(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void warn(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.WARN, format, argSuppliers, null);
    }

    /**
     * {@link #warn(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    default void warn(Marker marker, Supplier<String> msgSupplier) {
        doLog(marker, Level.WARN, msgSupplier, null);
    }

    /**
     * {@link #warn(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void warn(Marker marker, Supplier<String> msgSupplier, Throwable t) {
        doLog(marker, Level.WARN, msgSupplier, t);
    }


    /**
     * {@link #error(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void error(String format, Supplier<?> argSupplier1) {
        doLog(null, Level.ERROR, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #error(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.ERROR, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #error(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void error(String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.ERROR, format, argSuppliers, null);
    }

    /**
     * {@link #error(java.lang.String)} with a lambda message supplier.
     */
    default void error(Supplier<String> msgSupplier) {
        doLog(null, Level.ERROR, msgSupplier, null);
    }

    /**
     * {@link #error(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void error(Supplier<String> msgSupplier, Throwable t) {
        doLog(null, Level.ERROR, msgSupplier, t);
    }

    /**
     * {@link #error(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    default void error(Marker marker, String format, Supplier<?> argSupplier1) {
        doLog(null, Level.ERROR, format, new Supplier<?>[]{argSupplier1}, null);
    }

    /**
     * {@link #error(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    default void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2) {
        doLog(null, Level.ERROR, format, new Supplier<?>[]{argSupplier1, argSupplier2}, null);
    }

    /**
     * {@link #error(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    default void error(Marker marker, String format, Supplier<?>... argSuppliers) {
        doLog(null, Level.ERROR, format, argSuppliers, null);
    }

    /**
     * {@link #error(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    default void error(Marker marker, Supplier<String> msgSupplier) {
        doLog(marker, Level.ERROR, msgSupplier, null);
    }

    /**
     * {@link #error(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    default void error(Marker marker, Supplier<String> msgSupplier, Throwable t) {
        doLog(marker, Level.ERROR, msgSupplier, t);
    }

    void doLog(Marker marker, Level level, Supplier<String> msgSupplier, Throwable t);

    void doLog(Marker marker, Level level, String format, Supplier<?>[] argSuppliers, Throwable t);

    void doLog(Marker marker, Level level, String format, Object[] arguments, Throwable t);
}
