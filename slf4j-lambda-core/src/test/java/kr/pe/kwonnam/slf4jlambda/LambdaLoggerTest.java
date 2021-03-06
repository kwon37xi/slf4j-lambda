package kr.pe.kwonnam.slf4jlambda;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.event.Level;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerTest {

    @Mock
    private Logger underlyingLogger;

    @Captor
    private ArgumentCaptor<Supplier<?>[]> argSuppliersCaptor;

    @Captor
    private ArgumentCaptor<Supplier<String>> msgSupplierCaptor;

    private LambdaLoggerTestImpl lambdaLogger;

    private Marker testMarker = MarkerFactory.getMarker("testMarker");

    private IllegalStateException testException = new IllegalStateException("test exception");

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

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace format {}", new Object[]{"arg 1"}, null);
    }

    @Test
    public void trace_format_arg1_arg2() throws Exception {
        lambdaLogger.trace("trace format {}", "arg 1", "arg 2");

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace format {}", new Object[]{"arg 1", "arg 2"}, null);
    }

    @Test
    public void trace_format_arguments() throws Exception {
        lambdaLogger.trace("trace format {}", "arg 1", "arg 2", "arg three");

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace format {}", new Object[]{"arg 1", "arg 2", "arg three"}, null);
    }

    @Test
    public void trace_msg_throwable() throws Exception {
        lambdaLogger.trace("trace message", testException);

        verify(lambdaLogger).doLog(null, Level.TRACE, "trace message", null, testException);
    }

    @Test
    public void isTraceEnabled_marker() throws Exception {
        lambdaLogger.isTraceEnabled(testMarker);

        verify(underlyingLogger).isTraceEnabled(testMarker);
    }

    @Test
    public void trace_marker_msg() throws Exception {
        lambdaLogger.trace(testMarker, "trace message");

        verify(lambdaLogger).doLog(testMarker, Level.TRACE, "trace message", null, null);
    }

    @Test
    public void trace_marker_format_arg() throws Exception {
        lambdaLogger.trace(testMarker, "trace format {}", "arg");

        verify(lambdaLogger).doLog(testMarker, Level.TRACE, "trace format {}", new Object[]{"arg"}, null);
    }

    @Test
    public void trace_marker_format_arg1_arg2() throws Exception {
        lambdaLogger.trace(testMarker, "trace format {}, {}", "arg1", "arg2");

        verify(lambdaLogger).doLog(testMarker, Level.TRACE, "trace format {}, {}", new Object[]{"arg1", "arg2"}, null);
    }

    @Test
    public void trace_marker_format_arguments() throws Exception {
        lambdaLogger.trace(testMarker, "trace format {}, {}", "arg1", "arg2", "arg three");

        verify(lambdaLogger).doLog(testMarker, Level.TRACE, "trace format {}, {}", new Object[]{"arg1", "arg2", "arg three"}, null);
    }

    @Test
    public void trace_marker_msg_throwable() throws Exception {
        lambdaLogger.trace(testMarker, "trace message", testException);

        verify(lambdaLogger).doLog(testMarker, Level.TRACE, "trace message", null, testException);
    }

    @Test
    public void isDebugEnabled() throws Exception {
        when(underlyingLogger.isDebugEnabled()).thenReturn(true);

        assertThat(lambdaLogger.isDebugEnabled()).isTrue();
    }

    @Test
    public void debug_msg() throws Exception {
        lambdaLogger.debug("debug message");

        verify(lambdaLogger).doLog(null, Level.DEBUG, "debug message", null, null);
    }

    @Test
    public void debug_format_arg() throws Exception {
        lambdaLogger.debug("debug format {}", "arg 1");

        verify(lambdaLogger).doLog(null, Level.DEBUG, "debug format {}", new Object[]{"arg 1"}, null);
    }

    @Test
    public void debug_format_arg1_arg2() throws Exception {
        lambdaLogger.debug("debug format {}", "arg 1", "arg 2");

        verify(lambdaLogger).doLog(null, Level.DEBUG, "debug format {}", new Object[]{"arg 1", "arg 2"}, null);
    }

    @Test
    public void debug_format_arguments() throws Exception {
        lambdaLogger.debug("debug format {}", "arg 1", "arg 2", "arg three");

        verify(lambdaLogger).doLog(null, Level.DEBUG, "debug format {}", new Object[]{"arg 1", "arg 2", "arg three"}, null);
    }

    @Test
    public void debug_msg_throwable() throws Exception {
        lambdaLogger.debug("debug message", testException);

        verify(lambdaLogger).doLog(null, Level.DEBUG, "debug message", null, testException);
    }

    @Test
    public void isDebugEnabled_marker() throws Exception {
        lambdaLogger.isDebugEnabled(testMarker);

        verify(underlyingLogger).isDebugEnabled(testMarker);
    }

    @Test
    public void debug_marker_msg() throws Exception {
        lambdaLogger.debug(testMarker, "debug message");

        verify(lambdaLogger).doLog(testMarker, Level.DEBUG, "debug message", null, null);
    }

    @Test
    public void debug_marker_format_arg() throws Exception {
        lambdaLogger.debug(testMarker, "debug format {}", "arg");

        verify(lambdaLogger).doLog(testMarker, Level.DEBUG, "debug format {}", new Object[]{"arg"}, null);
    }

    @Test
    public void debug_marker_format_arg1_arg2() throws Exception {
        lambdaLogger.debug(testMarker, "debug format {}, {}", "arg1", "arg2");

        verify(lambdaLogger).doLog(testMarker, Level.DEBUG, "debug format {}, {}", new Object[]{"arg1", "arg2"}, null);
    }

    @Test
    public void debug_marker_format_arguments() throws Exception {
        lambdaLogger.debug(testMarker, "debug format {}, {}", "arg1", "arg2", "arg three");

        verify(lambdaLogger).doLog(testMarker, Level.DEBUG, "debug format {}, {}", new Object[]{"arg1", "arg2", "arg three"}, null);
    }

    @Test
    public void debug_marker_msg_throwable() throws Exception {
        lambdaLogger.debug(testMarker, "debug message", testException);

        verify(lambdaLogger).doLog(testMarker, Level.DEBUG, "debug message", null, testException);
    }

    @Test
    public void isInfoEnabled() throws Exception {
        when(underlyingLogger.isInfoEnabled()).thenReturn(true);

        assertThat(lambdaLogger.isInfoEnabled()).isTrue();
    }

    @Test
    public void info_msg() throws Exception {
        lambdaLogger.info("info message");

        verify(lambdaLogger).doLog(null, Level.INFO, "info message", null, null);
    }

    @Test
    public void info_format_arg() throws Exception {
        lambdaLogger.info("info format {}", "arg 1");

        verify(lambdaLogger).doLog(null, Level.INFO, "info format {}", new Object[]{"arg 1"}, null);
    }

    @Test
    public void info_format_arg1_arg2() throws Exception {
        lambdaLogger.info("info format {}", "arg 1", "arg 2");

        verify(lambdaLogger).doLog(null, Level.INFO, "info format {}", new Object[]{"arg 1", "arg 2"}, null);
    }

    @Test
    public void info_format_arguments() throws Exception {
        lambdaLogger.info("info format {}", "arg 1", "arg 2", "arg three");

        verify(lambdaLogger).doLog(null, Level.INFO, "info format {}", new Object[]{"arg 1", "arg 2", "arg three"}, null);
    }

    @Test
    public void info_msg_throwable() throws Exception {
        lambdaLogger.info("info message", testException);

        verify(lambdaLogger).doLog(null, Level.INFO, "info message", null, testException);
    }

    @Test
    public void isInfoEnabled_marker() throws Exception {
        lambdaLogger.isInfoEnabled(testMarker);

        verify(underlyingLogger).isInfoEnabled(testMarker);
    }

    @Test
    public void info_marker_msg() throws Exception {
        lambdaLogger.info(testMarker, "info message");

        verify(lambdaLogger).doLog(testMarker, Level.INFO, "info message", null, null);
    }

    @Test
    public void info_marker_format_arg() throws Exception {
        lambdaLogger.info(testMarker, "info format {}", "arg");

        verify(lambdaLogger).doLog(testMarker, Level.INFO, "info format {}", new Object[]{"arg"}, null);
    }

    @Test
    public void info_marker_format_arg1_arg2() throws Exception {
        lambdaLogger.info(testMarker, "info format {}, {}", "arg1", "arg2");

        verify(lambdaLogger).doLog(testMarker, Level.INFO, "info format {}, {}", new Object[]{"arg1", "arg2"}, null);
    }

    @Test
    public void info_marker_format_arguments() throws Exception {
        lambdaLogger.info(testMarker, "info format {}, {}", "arg1", "arg2", "arg three");

        verify(lambdaLogger).doLog(testMarker, Level.INFO, "info format {}, {}", new Object[]{"arg1", "arg2", "arg three"}, null);
    }

    @Test
    public void info_marker_msg_throwable() throws Exception {
        lambdaLogger.info(testMarker, "info message", testException);

        verify(lambdaLogger).doLog(testMarker, Level.INFO, "info message", null, testException);
    }

    @Test
    public void isWarnEnabled() throws Exception {
        when(underlyingLogger.isWarnEnabled()).thenReturn(true);

        assertThat(lambdaLogger.isWarnEnabled()).isTrue();
    }

    @Test
    public void warn_msg() throws Exception {
        lambdaLogger.warn("warn message");

        verify(lambdaLogger).doLog(null, Level.WARN, "warn message", null, null);
    }

    @Test
    public void warn_format_arg() throws Exception {
        lambdaLogger.warn("warn format {}", "arg 1");

        verify(lambdaLogger).doLog(null, Level.WARN, "warn format {}", new Object[]{"arg 1"}, null);
    }

    @Test
    public void warn_format_arg1_arg2() throws Exception {
        lambdaLogger.warn("warn format {}", "arg 1", "arg 2");

        verify(lambdaLogger).doLog(null, Level.WARN, "warn format {}", new Object[]{"arg 1", "arg 2"}, null);
    }

    @Test
    public void warn_format_arguments() throws Exception {
        lambdaLogger.warn("warn format {}", "arg 1", "arg 2", "arg three");

        verify(lambdaLogger).doLog(null, Level.WARN, "warn format {}", new Object[]{"arg 1", "arg 2", "arg three"}, null);
    }

    @Test
    public void warn_msg_throwable() throws Exception {
        lambdaLogger.warn("warn message", testException);

        verify(lambdaLogger).doLog(null, Level.WARN, "warn message", null, testException);
    }

    @Test
    public void isWarnEnabled_marker() throws Exception {
        lambdaLogger.isWarnEnabled(testMarker);

        verify(underlyingLogger).isWarnEnabled(testMarker);
    }

    @Test
    public void warn_marker_msg() throws Exception {
        lambdaLogger.warn(testMarker, "warn message");

        verify(lambdaLogger).doLog(testMarker, Level.WARN, "warn message", null, null);
    }

    @Test
    public void warn_marker_format_arg() throws Exception {
        lambdaLogger.warn(testMarker, "warn format {}", "arg");

        verify(lambdaLogger).doLog(testMarker, Level.WARN, "warn format {}", new Object[]{"arg"}, null);
    }

    @Test
    public void warn_marker_format_arg1_arg2() throws Exception {
        lambdaLogger.warn(testMarker, "warn format {}, {}", "arg1", "arg2");

        verify(lambdaLogger).doLog(testMarker, Level.WARN, "warn format {}, {}", new Object[]{"arg1", "arg2"}, null);
    }

    @Test
    public void warn_marker_format_arguments() throws Exception {
        lambdaLogger.warn(testMarker, "warn format {}, {}", "arg1", "arg2", "arg three");

        verify(lambdaLogger).doLog(testMarker, Level.WARN, "warn format {}, {}", new Object[]{"arg1", "arg2", "arg three"}, null);
    }

    @Test
    public void warn_marker_msg_throwable() throws Exception {
        lambdaLogger.warn(testMarker, "warn message", testException);

        verify(lambdaLogger).doLog(testMarker, Level.WARN, "warn message", null, testException);
    }

    @Test
    public void isErrorEnabled() throws Exception {
        when(underlyingLogger.isErrorEnabled()).thenReturn(true);

        assertThat(lambdaLogger.isErrorEnabled()).isTrue();
    }

    @Test
    public void error_msg() throws Exception {
        lambdaLogger.error("error message");

        verify(lambdaLogger).doLog(null, Level.ERROR, "error message", null, null);
    }

    @Test
    public void error_format_arg() throws Exception {
        lambdaLogger.error("error format {}", "arg 1");

        verify(lambdaLogger).doLog(null, Level.ERROR, "error format {}", new Object[]{"arg 1"}, null);
    }

    @Test
    public void error_format_arg1_arg2() throws Exception {
        lambdaLogger.error("error format {}", "arg 1", "arg 2");

        verify(lambdaLogger).doLog(null, Level.ERROR, "error format {}", new Object[]{"arg 1", "arg 2"}, null);
    }

    @Test
    public void error_format_arguments() throws Exception {
        lambdaLogger.error("error format {}", "arg 1", "arg 2", "arg three");

        verify(lambdaLogger).doLog(null, Level.ERROR, "error format {}", new Object[]{"arg 1", "arg 2", "arg three"}, null);
    }

    @Test
    public void error_msg_throwable() throws Exception {
        lambdaLogger.error("error message", testException);

        verify(lambdaLogger).doLog(null, Level.ERROR, "error message", null, testException);
    }

    @Test
    public void isErrorEnabled_marker() throws Exception {
        lambdaLogger.isErrorEnabled(testMarker);

        verify(underlyingLogger).isErrorEnabled(testMarker);
    }

    @Test
    public void error_marker_msg() throws Exception {
        lambdaLogger.error(testMarker, "error message");

        verify(lambdaLogger).doLog(testMarker, Level.ERROR, "error message", null, null);
    }

    @Test
    public void error_marker_format_arg() throws Exception {
        lambdaLogger.error(testMarker, "error format {}", "arg");

        verify(lambdaLogger).doLog(testMarker, Level.ERROR, "error format {}", new Object[]{"arg"}, null);
    }

    @Test
    public void error_marker_format_arg1_arg2() throws Exception {
        lambdaLogger.error(testMarker, "error format {}, {}", "arg1", "arg2");

        verify(lambdaLogger).doLog(testMarker, Level.ERROR, "error format {}, {}", new Object[]{"arg1", "arg2"}, null);
    }

    @Test
    public void error_marker_format_arguments() throws Exception {
        lambdaLogger.error(testMarker, "error format {}, {}", "arg1", "arg2", "arg three");

        verify(lambdaLogger).doLog(testMarker, Level.ERROR, "error format {}, {}", new Object[]{"arg1", "arg2", "arg three"}, null);
    }

    @Test
    public void error_marker_msg_throwable() throws Exception {
        lambdaLogger.error(testMarker, "error message", testException);

        verify(lambdaLogger).doLog(testMarker, Level.ERROR, "error message", null, testException);
    }

    @Test
    public void trace_format_argSupplier1() throws Exception {
        lambdaLogger.trace("trace format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(null), eq(Level.TRACE), eq("trace format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void trace_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.trace("trace format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(null), eq(Level.TRACE), eq("trace format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void trace_format_argSuppliers() throws Exception {
        lambdaLogger.trace("trace format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(null), eq(Level.TRACE), eq("trace format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void trace_msgSupplier() throws Exception {
        lambdaLogger.trace(() -> "trace message sup");

        verify(lambdaLogger).doLog(eq(null), eq(Level.TRACE), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("trace message sup");
    }

    @Test
    public void trace_msgSupplier_throwable() throws Exception {
        lambdaLogger.trace(() -> "trace message sup", testException);

        verify(lambdaLogger).doLog(eq(null), eq(Level.TRACE), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("trace message sup");
    }


    @Test
    public void trace_marker_format_argSupplier1() throws Exception {
        lambdaLogger.trace(testMarker, "trace format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.TRACE), eq("trace format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void trace_marker_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.trace(testMarker, "trace format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.TRACE), eq("trace format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void trace_marker_format_argSuppliers() throws Exception {
        lambdaLogger.trace(testMarker, "trace format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.TRACE), eq("trace format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void trace_marker_msgSupplier() throws Exception {
        lambdaLogger.trace(testMarker, () -> "trace message sup");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.TRACE), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("trace message sup");
    }

    @Test
    public void trace_marker_msgSupplier_throwable() throws Exception {
        lambdaLogger.trace(testMarker, () -> "trace message sup", testException);

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.TRACE), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("trace message sup");
    }


    @Test
    public void debug_format_argSupplier1() throws Exception {
        lambdaLogger.debug("debug format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(null), eq(Level.DEBUG), eq("debug format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void debug_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.debug("debug format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(null), eq(Level.DEBUG), eq("debug format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void debug_format_argSuppliers() throws Exception {
        lambdaLogger.debug("debug format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(null), eq(Level.DEBUG), eq("debug format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void debug_msgSupplier() throws Exception {
        lambdaLogger.debug(() -> "debug message sup");

        verify(lambdaLogger).doLog(eq(null), eq(Level.DEBUG), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("debug message sup");
    }

    @Test
    public void debug_msgSupplier_throwable() throws Exception {
        lambdaLogger.debug(() -> "debug message sup", testException);

        verify(lambdaLogger).doLog(eq(null), eq(Level.DEBUG), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("debug message sup");
    }


    @Test
    public void debug_marker_format_argSupplier1() throws Exception {
        lambdaLogger.debug(testMarker, "debug format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.DEBUG), eq("debug format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void debug_marker_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.debug(testMarker, "debug format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.DEBUG), eq("debug format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void debug_marker_format_argSuppliers() throws Exception {
        lambdaLogger.debug(testMarker, "debug format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.DEBUG), eq("debug format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void debug_marker_msgSupplier() throws Exception {
        lambdaLogger.debug(testMarker, () -> "debug message sup");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.DEBUG), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("debug message sup");
    }

    @Test
    public void debug_marker_msgSupplier_throwable() throws Exception {
        lambdaLogger.debug(testMarker, () -> "debug message sup", testException);

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.DEBUG), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("debug message sup");
    }


    @Test
    public void info_format_argSupplier1() throws Exception {
        lambdaLogger.info("info format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(null), eq(Level.INFO), eq("info format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void info_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.info("info format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(null), eq(Level.INFO), eq("info format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void info_format_argSuppliers() throws Exception {
        lambdaLogger.info("info format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(null), eq(Level.INFO), eq("info format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void info_msgSupplier() throws Exception {
        lambdaLogger.info(() -> "info message sup");

        verify(lambdaLogger).doLog(eq(null), eq(Level.INFO), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("info message sup");
    }

    @Test
    public void info_msgSupplier_throwable() throws Exception {
        lambdaLogger.info(() -> "info message sup", testException);

        verify(lambdaLogger).doLog(eq(null), eq(Level.INFO), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("info message sup");
    }


    @Test
    public void info_marker_format_argSupplier1() throws Exception {
        lambdaLogger.info(testMarker, "info format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.INFO), eq("info format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void info_marker_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.info(testMarker, "info format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.INFO), eq("info format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void info_marker_format_argSuppliers() throws Exception {
        lambdaLogger.info(testMarker, "info format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.INFO), eq("info format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void info_marker_msgSupplier() throws Exception {
        lambdaLogger.info(testMarker, () -> "info message sup");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.INFO), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("info message sup");
    }

    @Test
    public void info_marker_msgSupplier_throwable() throws Exception {
        lambdaLogger.info(testMarker, () -> "info message sup", testException);

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.INFO), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("info message sup");
    }


    @Test
    public void warn_format_argSupplier1() throws Exception {
        lambdaLogger.warn("warn format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(null), eq(Level.WARN), eq("warn format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void warn_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.warn("warn format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(null), eq(Level.WARN), eq("warn format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void warn_format_argSuppliers() throws Exception {
        lambdaLogger.warn("warn format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(null), eq(Level.WARN), eq("warn format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void warn_msgSupplier() throws Exception {
        lambdaLogger.warn(() -> "warn message sup");

        verify(lambdaLogger).doLog(eq(null), eq(Level.WARN), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("warn message sup");
    }

    @Test
    public void warn_msgSupplier_throwable() throws Exception {
        lambdaLogger.warn(() -> "warn message sup", testException);

        verify(lambdaLogger).doLog(eq(null), eq(Level.WARN), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("warn message sup");
    }


    @Test
    public void warn_marker_format_argSupplier1() throws Exception {
        lambdaLogger.warn(testMarker, "warn format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.WARN), eq("warn format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void warn_marker_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.warn(testMarker, "warn format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.WARN), eq("warn format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void warn_marker_format_argSuppliers() throws Exception {
        lambdaLogger.warn(testMarker, "warn format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.WARN), eq("warn format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void warn_marker_msgSupplier() throws Exception {
        lambdaLogger.warn(testMarker, () -> "warn message sup");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.WARN), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("warn message sup");
    }

    @Test
    public void warn_marker_msgSupplier_throwable() throws Exception {
        lambdaLogger.warn(testMarker, () -> "warn message sup", testException);

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.WARN), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("warn message sup");
    }


    @Test
    public void error_format_argSupplier1() throws Exception {
        lambdaLogger.error("error format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(null), eq(Level.ERROR), eq("error format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void error_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.error("error format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(null), eq(Level.ERROR), eq("error format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void error_format_argSuppliers() throws Exception {
        lambdaLogger.error("error format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(null), eq(Level.ERROR), eq("error format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void error_msgSupplier() throws Exception {
        lambdaLogger.error(() -> "error message sup");

        verify(lambdaLogger).doLog(eq(null), eq(Level.ERROR), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("error message sup");
    }

    @Test
    public void error_msgSupplier_throwable() throws Exception {
        lambdaLogger.error(() -> "error message sup", testException);

        verify(lambdaLogger).doLog(eq(null), eq(Level.ERROR), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("error message sup");
    }


    @Test
    public void error_marker_format_argSupplier1() throws Exception {
        lambdaLogger.error(testMarker, "error format", () -> "arg1");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.ERROR), eq("error format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(1);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
    }

    @Test
    public void error_marker_format_argSupplier1_argSupplier2() throws Exception {
        lambdaLogger.error(testMarker, "error format", () -> "arg1", () -> "arg2");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.ERROR), eq("error format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(2);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
    }

    @Test
    public void error_marker_format_argSuppliers() throws Exception {
        lambdaLogger.error(testMarker, "error format", () -> "arg1", () -> "arg2", () -> "arg three");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.ERROR), eq("error format"), argSuppliersCaptor.capture(), eq(null));

        Supplier[] suppliers = argSuppliersCaptor.getValue();
        assertThat(suppliers.length).isEqualTo(3);
        assertThat(suppliers[0].get()).isEqualTo("arg1");
        assertThat(suppliers[1].get()).isEqualTo("arg2");
        assertThat(suppliers[2].get()).isEqualTo("arg three");
    }

    @Test
    public void error_marker_msgSupplier() throws Exception {
        lambdaLogger.error(testMarker, () -> "error message sup");

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.ERROR), msgSupplierCaptor.capture(), eq(null));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("error message sup");
    }

    @Test
    public void error_marker_msgSupplier_throwable() throws Exception {
        lambdaLogger.error(testMarker, () -> "error message sup", testException);

        verify(lambdaLogger).doLog(eq(testMarker), eq(Level.ERROR), msgSupplierCaptor.capture(), eq(testException));

        assertThat(msgSupplierCaptor.getValue().get()).isEqualTo("error message sup");
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