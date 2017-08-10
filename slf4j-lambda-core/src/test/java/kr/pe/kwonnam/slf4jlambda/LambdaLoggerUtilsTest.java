package kr.pe.kwonnam.slf4jlambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.event.Level;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerUtilsTest {
    @Mock
    private Logger underlyingLogger;

    private static final Marker testMarker = MarkerFactory.getMarker("testMarker");


    @Test
    public void isLogLevelEnabled_TRACE_enabled() throws Exception {
        when(underlyingLogger.isTraceEnabled()).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.TRACE, null)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_TRACE_enabled_with_marker() throws Exception {
        when(underlyingLogger.isTraceEnabled(eq(testMarker))).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.TRACE, testMarker)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_TRACE_disabled() throws Exception {
        when(underlyingLogger.isTraceEnabled()).thenReturn(false);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.TRACE, null)).isFalse();
    }

    @Test
    public void isLogLevelEnabled_DEBUG_enabled() throws Exception {
        when(underlyingLogger.isDebugEnabled()).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.DEBUG, null)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_DEBUG_enabled_with_marker() throws Exception {
        when(underlyingLogger.isDebugEnabled(eq(testMarker))).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.DEBUG, testMarker)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_DEBUG_disabled() throws Exception {
        when(underlyingLogger.isDebugEnabled()).thenReturn(false);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.DEBUG, null)).isFalse();
    }

    @Test
    public void isLogLevelEnabled_INFO_enabled() throws Exception {
        when(underlyingLogger.isInfoEnabled()).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.INFO, null)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_INFO_enabled_with_marker() throws Exception {
        when(underlyingLogger.isInfoEnabled(eq(testMarker))).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.INFO, testMarker)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_INFO_disabled() throws Exception {
        when(underlyingLogger.isInfoEnabled()).thenReturn(false);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.INFO, null)).isFalse();
    }

    @Test
    public void isLogLevelEnabled_WARN_enabled() throws Exception {
        when(underlyingLogger.isWarnEnabled()).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.WARN, null)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_WARN_enabled_with_marker() throws Exception {
        when(underlyingLogger.isWarnEnabled(eq(testMarker))).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.WARN, testMarker)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_WARN_disabled() throws Exception {
        when(underlyingLogger.isWarnEnabled()).thenReturn(false);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.WARN, null)).isFalse();
    }

    @Test
    public void isLogLevelEnabled_ERROR_enabled() throws Exception {
        when(underlyingLogger.isErrorEnabled()).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.ERROR, null)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_ERROR_enabled_with_marker() throws Exception {
        when(underlyingLogger.isErrorEnabled(eq(testMarker))).thenReturn(true);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.ERROR, testMarker)).isTrue();
    }

    @Test
    public void isLogLevelEnabled_ERROR_disabled() throws Exception {
        when(underlyingLogger.isErrorEnabled()).thenReturn(false);

        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, Level.ERROR, null)).isFalse();
    }

    @Test(expected = NullPointerException.class)
    public void isLogLevelEnabled_LogLevel_null() throws Exception {
        assertThat(LambdaLoggerUtils.isLogLevelEnabled(underlyingLogger, null, null)).isFalse();
    }

    @Test
    public void asStr_null() throws Exception {
        assertThat(LambdaLoggerUtils.asStr(null)).isNull();
    }

    @Test
    public void asStr_not_null() throws Exception {
        assertThat(LambdaLoggerUtils.asStr("hello world")).isEqualTo("hello world");

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        assertThat(LambdaLoggerUtils.asStr(integers)).isEqualTo("[1, 2, 3]");

    }
}