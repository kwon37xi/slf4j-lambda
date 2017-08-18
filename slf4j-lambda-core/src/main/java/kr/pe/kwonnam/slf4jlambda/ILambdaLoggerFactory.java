package kr.pe.kwonnam.slf4jlambda;

import org.slf4j.ILoggerFactory;

public interface ILambdaLoggerFactory {

    ILoggerFactory getUnderlyingLoggerFactory();

    LambdaLogger getLogger(String name);
}
