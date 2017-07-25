package kr.pe.kwonnam.slf4jlambda

import org.slf4j.Logger
import org.slf4j.spi.LocationAwareLogger
import spock.lang.Specification
import spock.lang.Subject

class DefaultLambdaLoggerFactoryTest extends Specification {
    @Subject
    DefaultLambdaLoggerFactory defaultLambdaLoggerFactory

    Logger plainLogger = Mock()
    LocationAwareLogger locationAwareLogger = Mock()

    void setup() {
        defaultLambdaLoggerFactory = new DefaultLambdaLoggerFactory()
    }

    def "buildLambdaLogger - plainLogger"() {
        expect:
        defaultLambdaLoggerFactory.buildLambdaLogger(plainLogger) instanceof LambdaLoggerPlainImpl
    }

    def "buildLambdaLogger - locationAwareLogger"() {
        expect:
        defaultLambdaLoggerFactory.buildLambdaLogger(locationAwareLogger) instanceof LambdaLoggerLocationAwareImpl
    }

}
