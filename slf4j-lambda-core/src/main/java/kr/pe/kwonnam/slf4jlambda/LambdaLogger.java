package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.function.Supplier;

public interface LambdaLogger extends Logger {

    /**
     * {@link Logger#debug(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void debug(String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#debug(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void debug(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#debug(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void debug(String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#debug(java.lang.String)} with a lambda message supplier.
     */
    void debug(Supplier<?> msgSupplier);

    /**
     * {@link Logger#debug(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void debug(Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void debug(Marker marker, String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void debug(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void debug(Marker marker, String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#debug(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    void debug(Marker marker, Supplier<?> msgSupplier);

    /**
     * {@link Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void debug(Marker marker, Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#error(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void error(String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#error(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void error(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#error(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void error(String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#error(java.lang.String)} with a lambda message supplier.
     */
    void error(Supplier<?> msgSupplier);

    /**
     * {@link Logger#error(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void error(Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void error(Marker marker, String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void error(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void error(Marker marker, String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#error(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    void error(Marker marker, Supplier<?> msgSupplier);

    /**
     * {@link Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void error(Marker marker, Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#info(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void info(String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#info(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void info(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#info(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void info(String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#info(java.lang.String)} with a lambda message supplier.
     */
    void info(Supplier<?> msgSupplier);

    /**
     * {@link Logger#info(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void info(Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void info(Marker marker, String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void info(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void info(Marker marker, String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#info(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    void info(Marker marker, Supplier<?> msgSupplier);

    /**
     * {@link Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void info(Marker marker, Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#trace(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void trace(String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#trace(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void trace(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#trace(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void trace(String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#trace(java.lang.String)} with a lambda message supplier.
     */
    void trace(Supplier<?> msgSupplier);

    /**
     * {@link Logger#trace(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void trace(Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void trace(Marker marker, String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void trace(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void trace(Marker marker, String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#trace(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    void trace(Marker marker, Supplier<?> msgSupplier);

    /**
     * {@link Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void trace(Marker marker, Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#warn(java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void warn(String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#warn(java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void warn(String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#warn(java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void warn(String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#warn(java.lang.String)} with a lambda message supplier.
     */
    void warn(Supplier<?> msgSupplier);

    /**
     * {@link Logger#warn(java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void warn(Supplier<?> msgSupplier, Throwable t);

    /**
     * {@link Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object)} with a lambda argument supplier.
     */
    void warn(Marker marker, String format, Supplier<?> argSupplier1);

    /**
     * {@link Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)} with two lambda argument suppliers.
     */
    void warn(Marker marker, String format, Supplier<?> argSupplier1, Supplier<?> argSupplier2);

    /**
     * {@link Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object...)} with 3 or more lambda argument suppliers.
     */
    void warn(Marker marker, String format, Supplier<?>... argSuppliers);

    /**
     * {@link Logger#warn(org.slf4j.Marker, java.lang.String)} with a lambda message supplier.
     */
    void warn(Marker marker, Supplier<?> msgSupplier);

    /**
     * {@link Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Throwable)} with a lambda message supplier.
     */
    void warn(Marker marker, Supplier<?> msgSupplier, Throwable t);
}
