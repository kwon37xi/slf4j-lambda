package kr.pe.kwonnam.slf4jlambda;

import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

import java.util.function.Supplier;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerTest {

    @Spy
    private LambdaLoggerTestImpl lambdaLogger = new LambdaLoggerTestImpl();


    public static class LambdaLoggerTestImpl implements LambdaLogger {

        @Override
        public Logger getUnderlyingLogger() {
            return null;
        }

        @Override
        public void doLog(Marker marker, Level level, Supplier<String> msgSupplier, Throwable t) {
            // do nothing
        }

        @Override
        public void doLog(Marker marker, Level level, String format, Supplier<?>[] argSuppliers, Throwable t) {
            // do nothing
        }

        @Override
        public void doLog(Marker marker, Level level, String format, Object[] arguments, Throwable t) {
            // do nothing
        }
    }
}