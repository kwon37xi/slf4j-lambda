package kr.pe.kwonnam.slf4jlambda.defaultlogger;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.spi.LocationAwareLogger;

@RunWith(MockitoJUnitRunner.class)
public class LambdaLoggerLocationAwareImplTest {
    @Mock
    private LocationAwareLogger underlyingLogger;

    private LambdaLoggerLocationAwareImpl lambdaLogger;

    @Before
    public void setUp() throws Exception {
        lambdaLogger = new LambdaLoggerLocationAwareImpl(underlyingLogger);
    }


}