package kr.pe.kwonnam.slf4jlambda;

import java.util.function.Supplier;

public class LambdaLoggerUtils {

    public static Object[] argSuppliersToArgs(Supplier<?>[] argSuppliers) {
        Object[] args = new Object[argSuppliers.length];
        for (int i = 0; i < argSuppliers.length; i++) {
            args[i] = argSuppliers[i].get();
        }
        return args;
    }
}
