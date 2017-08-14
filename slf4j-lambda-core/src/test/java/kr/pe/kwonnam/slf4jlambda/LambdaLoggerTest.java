package kr.pe.kwonnam.slf4jlambda;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerTest {

    @Mock
    private Logger underlyingLogger;

    private LambdaLoggerTestImpl lambdaLogger;

    @Before
    public void setUp() throws Exception {
        lambdaLogger = Mockito.spy(new LambdaLoggerTestImpl(underlyingLogger));
    }

    @Test
    public void getName() throws Exception {
        when(underlyingLogger.getName()).thenReturn("underlying logger");

        assertThat(lambdaLogger.getName()).isEqualTo("underlying logger");
    }

    @Test
    public void isTraceEnabled() throws Exception {
        when(underlyingLogger.isTraceEnabled()).thenReturn(true);

        assertThat(lambdaLogger.isTraceEnabled()).isTrue();
    }

    @Test
    public void trace_msg() throws Exception {
        lambdaLogger.trace("trace message");

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace message", null, null);
    }

    @Test
    public void trace_format_arg() throws Exception {
        lambdaLogger.trace("trace format {}", "arg 1");

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace format {}", new Object[] { "arg 1" }, null);
    }

    @Test
    public void trace_format_arg1_arg2() throws Exception {
        lambdaLogger.trace("trace format {}", "arg 1", "arg 2");

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace format {}", new Object[] { "arg 1", "arg 2" }, null);
    }

    @Test
    public void trace_format_arguments() throws Exception {
        lambdaLogger.trace("trace format {}", "arg 1", "arg 2", "arg three");

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace format {}", new Object[] { "arg 1", "arg 2", "arg three" }, null);
    }

    public static class LambdaLoggerTestImpl implements LambdaLogger {
        private Logger underlyingLogger;

        public LambdaLoggerTestImpl(Logger underlyingLogger) {
            this.underlyingLogger = underlyingLogger;
        }

        @Override
        public Logger getUnderlyingLogger() {
            return underlyingLogger;
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