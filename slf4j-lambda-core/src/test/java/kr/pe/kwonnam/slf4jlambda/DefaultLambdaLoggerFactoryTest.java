package kr.pe.kwonnam.slf4jlambda;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.spi.LocationAwareLogger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class DefaultLambdaLoggerFactoryTest {
    @Mock
    private Logger plainLogger;

    @Mock
    private LocationAwareLogger locationAwareLogger;

    private DefaultLambdaLoggerFactory defaultLambdaLoggerFactory;

    @Before
    public void setUp() throws Exception {
        defaultLambdaLoggerFactory = new DefaultLambdaLoggerFactory();
    }

    @Test
    public void buildLambdaLogger_plainLogger() throws Exception {
        assertThat(defaultLambdaLoggerFactory.buildLambdaLogger(plainLogger), is(LambdaLoggerPlainImpl.class));
    }

    @Test
    public void buildLambdaLogger_locationAwareLogger() throws Exception {
        assertThat(defaultLambdaLoggerFactory.buildLambdaLogger(locationAwareLogger), is(LambdaLoggerLocationAwareImpl.class));
    }
}
