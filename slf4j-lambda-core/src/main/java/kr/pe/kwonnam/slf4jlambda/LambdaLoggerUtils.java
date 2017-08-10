package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

import java.util.function.Supplier;

public class LambdaLoggerUtils {

    public static boolean isLogLevelEnabled(Logger underlyingLogger, Level logLevel, Marker marker) {
        switch (logLevel) {
            case TRACE:
                if (marker == null) {
                    return underlyingLogger.isTraceEnabled();
                }
                return underlyingLogger.isTraceEnabled(marker);
            case DEBUG:
                if (marker == null) {
                    return underlyingLogger.isDebugEnabled();
                }
                return underlyingLogger.isDebugEnabled(marker);
            case INFO:
                if (marker == null) {
                    return underlyingLogger.isInfoEnabled();
                }
                return underlyingLogger.isInfoEnabled(marker);
            case WARN:
                if (marker == null) {
                    return underlyingLogger.isWarnEnabled();
                }
                return underlyingLogger.isWarnEnabled(marker);
            case ERROR:
                if (marker == null) {
                    return underlyingLogger.isErrorEnabled();
                }
                return underlyingLogger.isErrorEnabled(marker);
            default:
                break;
        }
        return false;
    }

    public static Object[] argSuppliersToArgs(Supplier<?>... argSuppliers) {
        Object[] args = new Object[argSuppliers.length];
        for (int i = 0; i < argSuppliers.length; i++) {
            args[i] = argSuppliers[i].get();
        }
        return args;
    }
}
