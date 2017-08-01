package kr.pe.kwonnam.slf4jlambda;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AbstractLambdaLoggerFactoryTest {

    private ILoggerFactory underlyingLoggerFactory;
    private AbstractLambdaLoggerFactory abstractlambdaLoggerFactory;

    @Before
    public void setUp() throws Exception {
        underlyingLoggerFactory = Mockito.mock(ILoggerFactory.class);
        abstractlambdaLoggerFactory = new TestAbstractlambdaLoggerFactory(underlyingLoggerFactory);
    }

    @Test
    public void getunderlyingLoggerFactory() throws Exception {

    }

    @Test
    public void getLogger_different_name_return_different_instances() throws Exception {
        when(underlyingLoggerFactory.getLogger("hello")).thenReturn(mock(Logger.class));
        when(underlyingLoggerFactory.getLogger("world")).thenReturn(mock(Logger.class));

        LambdaLogger helloLambdaLogger = abstractlambdaLoggerFactory.getLogger("hello");
        LambdaLogger worldLambdaLogger = abstractlambdaLoggerFactory.getLogger("world");

        assertThat(helloLambdaLogger, not(sameInstance(worldLambdaLogger)));
    }

    @Test
    public void getLogger_same_name_return_same_instance() throws Exception {
        when(underlyingLoggerFactory.getLogger("hello")).thenReturn(mock(Logger.class));

        LambdaLogger helloLambdaLogger = abstractlambdaLoggerFactory.getLogger("hello");
        LambdaLogger helloLambdaLoggerAgain = abstractlambdaLoggerFactory.getLogger("hello");

        assertThat(helloLambdaLogger, sameInstance(helloLambdaLoggerAgain));
    }

    public static class TestAbstractlambdaLoggerFactory extends AbstractLambdaLoggerFactory {
        public TestAbstractlambdaLoggerFactory(ILoggerFactory underlyingLoggerFactory) {
            super(underlyingLoggerFactory);
        }

        @Override
        public LambdaLogger buildLambdaLogger(Logger underlyingLogger) {
            return Mockito.mock(LambdaLogger.class);
        }
    }
}