package kr.pe.kwonnam.slf4jlambda

import org.slf4j.Logger
import org.slf4j.spi.LocationAwareLogger
import spock.lang.Specification
import spock.lang.Subject

class LambdaLoggerFactoryTest extends Specification {
    @Subject
    LambdaLoggerFactory lambdaLoggerFactory

    Logger plainLogger = Mock()
    LocationAwareLogger locationAwareLogger = Mock()

    def "buildLambdaLogger - plainLogger"() {
        expect:
        LambdaLoggerFactory.buildLambdaLogger(plainLogger) instanceof LambdaLoggerPlainImpl
    }

    def "buildLambdaLogger - locationAwareLogger"() {
        expect:
        LambdaLoggerFactory.buildLambdaLogger(locationAwareLogger) instanceof LambdaLoggerLocationAwareImpl
    }

}
