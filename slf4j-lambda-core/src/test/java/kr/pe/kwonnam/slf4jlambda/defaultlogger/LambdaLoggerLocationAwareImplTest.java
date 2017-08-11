package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.event.Level;
import org.slf4j.spi.LocationAwareLogger;

import java.util.function.Supplier;

import static kr.pe.kwonnam.slf4jlambda.defaultlogger.LambdaLoggerLocationAwareImpl.FQCN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerLocationAwareImplTest {
    @Mock
    private LocationAwareLogger underlyingLogger;

    private LambdaLoggerLocationAwareImpl lambdaLogger;

    private Marker testMarker = MarkerFactory.getMarker("testMarker");

    private IllegalStateException testException = new IllegalStateException("test exception");

    @Before
    public void setUp() throws Exception {
        lambdaLogger = new LambdaLoggerLocationAwareImpl(underlyingLogger);
    }

    @Test
    public void getUnderlyingLogger() throws Exception {
        assertThat(lambdaLogger.getUnderlyingLogger()).isSameAs(underlyingLogger);
    }

    @Test
    public void doLog_msgSupplier_disabled() throws Exception {
        when(underlyingLogger.isDebugEnabled(testMarker)).thenReturn(false);

        lambdaLogger.doLog(testMarker, Level.DEBUG, () -> "hello world!", testException);

        verify(underlyingLogger, never()).log(eq(testMarker), eq(FQCN), eq(Level.DEBUG.toInt()), eq("hello world!"), eq(null), eq(testException));
    }

    @Test
    public void doLog_msgSupplier_enabled() throws Exception {
        when(underlyingLogger.isDebugEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.DEBUG, () -> "hello world!", testException);

        verify(underlyingLogger, times(1)).log(eq(testMarker), eq(FQCN), eq(Level.DEBUG.toInt()), eq("hello world!"), eq(null), eq(testException));
    }

    @Test
    public void doLog_format_argSuppliers_disabled() throws Exception {
        when(underlyingLogger.isDebugEnabled(testMarker)).thenReturn(false);

        lambdaLogger.doLog(testMarker, Level.DEBUG, "message format", new Supplier<?>[]{() -> "hello", () -> "world"}, testException);

        verify(underlyingLogger, never()).log(eq(testMarker), eq(FQCN), eq(Level.DEBUG.toInt()), eq("message format"), any(Object[].class), eq(testException));
    }

    @Test
    public void doLog_format_argSuppliers_enabled() throws Exception {
        when(underlyingLogger.isDebugEnabled(testMarker)).thenReturn(true);

        lambdaLogger.doLog(testMarker, Level.DEBUG, "message format", new Supplier<?>[]{() -> "hello", () -> "world"}, testException);

        verify(underlyingLogger, times(1)).log(testMarker, FQCN, Level.DEBUG.toInt(), "hello world!", null, testException);
    }


}