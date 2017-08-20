# Slf4j-Lambda
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/kr.pe.kwonnam.slf4j-lambda/slf4j-lambda-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/kr.pe.kwonnam.slf4j-lambda/slf4j-lambda-core)

[Slf4j](https://www.slf4j.org/) logging with Java 8 lambda expressions.

The lambda expressions are evaluated only when the log level is enabled. 

## Requirements
* Java 8
* Slf4j API

## Dependencies
```
dependencies {
    compile 'kr.pe.kwonnam.slf4j:slf4j-lambda-core:0.1'
}
```

## Usages
* Use `LambdaLoggerFactory` instread of Slf4j's `LoggerFactory`
* Use `LambdaLogger` instead of Slf4j's `Logger`. `LambdaLogger` inherits `Logger`, so you can still use all `Logger`'s logging methods with lambda supporting logging methods.

```java
import kr.pe.kwonnam.slf4jlambda.LambdaLogger;
import kr.pe.kwonnam.slf4jlambda.LambdaLoggerFactory;

LambdaLogger log = LambdaLoggerFactory.getLogger(YourClass.class);

// lambda for message itself
log.debug(() -> createMessage("debug level"));

// lambda for message format's arguments
log.info("info lambda formatter number {}, string {}", () -> 123, () -> "Hello LambdaLogger");

// method reference
public String longRunnigMethod() {
    return "some long running method";
}

log.debug("Long running method logging {}", this::longRunnigMethod);

// exception logging
log.error(() -> "error lambda exception msg - " + ex.getMessage(), ex);
```