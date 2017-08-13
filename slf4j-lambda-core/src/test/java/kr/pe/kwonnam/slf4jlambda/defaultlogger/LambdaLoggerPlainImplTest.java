package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.event.Level;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerPlainImplTest {
    @Mock
    private Logger underlyingLogger;

    private LambdaLoggerPlainImpl lambdaLogger;

    private Marker testMarker = MarkerFactory.getMarker("testMarker");

    private IllegalArgumentException testException = new IllegalArgumentException("test exception");

    @Before
    public void setUp() throws Exception {
        lambdaLogger = new LambdaLoggerPlainImpl(underlyingLogger);
    }

    @Test
    public void constructor_argument_null() throws Exception {
        try {
            new LambdaLoggerPlainImpl(null);
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage()).isEqualTo("underlyingLogger must not be null.");
        }
    }

    @Test
    public void getUnderlyingLogger() throws Exception {
        assertThat(lambdaLogger.getUnderlyingLogger()).isSameAs(underlyingLogger);
    }

    @Test
    public void doLog_msgSupplier_disabled() throws Exception {
        when(underlyingLogger.isDebugEnabled(testMarker)).thenReturn(false);

        lambdaLogger.doLog(testMarker, Level.DEBUG, () -> "hello world!", testException);

        verify(underlyingLogger, never()).debug(testMarker, "hello world!", testException);
    }

    @Test
    public void doLog_msgSupplier_enabled() throws Exception {
        when(underlyingLogger.isDebugEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.DEBUG, () -> "hello world!", testException);

        verify(underlyingLogger, times(1)).debug(eq(testMarker), eq("hello world!"), eq(testException));
    }

    @Test
    public void doLog_format_argSuppliers_disabled() throws Exception {
        when(underlyingLogger.isInfoEnabled(testMarker)).thenReturn(false);

        lambdaLogger.doLog(testMarker, Level.INFO, "message format", new Supplier<?>[]{() -> "hello", () -> "world"}, testException);

        verify(underlyingLogger, never()).info(eq(testMarker), anyString(), eq(testException));
    }

    @Test
    public void doLog_format_argSuppliers_enabled_args_null() throws Exception {
        when(underlyingLogger.isInfoEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.INFO, "message format", null, testException);

        verify(underlyingLogger, times(1)).info(eq(testMarker), eq("message format"), eq(testException));
    }


    @Test
    public void doLog_format_argSuppliers_enabled_args_not_null() throws Exception {
        when(underlyingLogger.isInfoEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.INFO, "greetings {} -> {}", new Supplier<?>[]{() -> "hello", () -> "world"}, testException);

        verify(underlyingLogger, times(1)).info(eq(testMarker), eq("greetings hello -> world"), eq(testException));
    }

    @Test
    public void doLog_format_arguments_disabled() throws Exception {
        when(underlyingLogger.isWarnEnabled(testMarker)).thenReturn(false);

        lambdaLogger.doLog(testMarker, Level.WARN, "message format", new Object[]{"hello", "world"}, testException);

        verify(underlyingLogger, never()).warn(eq(testMarker), anyString(), eq(testException));
    }

    @Test
    public void doLog_format_arguments_enabled_args_null() throws Exception {
        when(underlyingLogger.isWarnEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.WARN, "message format", null, testException);

        verify(underlyingLogger, times(1)).warn(eq(testMarker), eq("message format"), eq(testException));
    }

    @Test
    public void doLog_format_arguments_enabled_args_not_null() throws Exception {
        when(underlyingLogger.isWarnEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.WARN, "greetings {} -> {}", new Object[]{"hello", "world"}, testException);

        verify(underlyingLogger, times(1)).warn(eq(testMarker), eq("greetings hello -> world"), eq(testException));
    }
}