package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

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

    }

    @Test
    public void doLog_msgSupplier_enabled() throws Exception {

    }

    @Test
    public void doLog_format_argSuppliers_disabled() throws Exception {

    }


    @Test
    public void doLog_format_argSuppliers_enabled_args_null() throws Exception {

    }


    @Test
    public void doLog_format_argSuppliers_enabled_args_not_null() throws Exception {

    }


    @Test
    public void doLog_format_arguments_disabled() throws Exception {

    }


    @Test
    public void doLog_format_arguments_enabled_args_null() throws Exception {

    }


    @Test
    public void doLog_format_arguments_enabled_args_not_null() throws Exception {

    }
}