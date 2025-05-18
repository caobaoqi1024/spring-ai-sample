## how to disable spring dev tools

- https://docs.spring.io/spring-boot/reference/using/devtools.html#using.devtools.restart.disable

有两种方法可以禁用 spring dev tools:

- 通过在 `application.*-properties` 中配置 `spring.devtools.restart.enabled` 属性,这样做仍然会初始化重启类加载器，但它不会监视文件更改
- 如果需要彻底禁用(例如其不适用于特定库)则需要在调用 `SpringApplication.run（...）` 之前将
  `spring.devtools.restart.enabled` 的系统属性设置为 false，如以下示例所示

```java
    public static void main(String[] args) {
    System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication.run(SpringAiSampleApplication.class, args);
}
```

## how to get default config for logback with spring boot

默认位置位于 `spring-boot-3.4.5.jar!/org/springframework/boot/logging/logback/defaults.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!--
Default logback configuration provided for import
-->

<included>
    <conversionRule conversionWord="applicationName"
                    class="org.springframework.boot.logging.logback.ApplicationNameConverter"/>
    <conversionRule conversionWord="clr" class="org.springframework.boot.logging.logback.ColorConverter"/>
    <conversionRule conversionWord="correlationId"
                    class="org.springframework.boot.logging.logback.CorrelationIdConverter"/>
    <conversionRule conversionWord="esb"
                    class="org.springframework.boot.logging.logback.EnclosedInSquareBracketsConverter"/>
    <conversionRule conversionWord="wex"
                    class="org.springframework.boot.logging.logback.WhitespaceThrowableProxyConverter"/>
    <conversionRule conversionWord="wEx"
                    class="org.springframework.boot.logging.logback.ExtendedWhitespaceThrowableProxyConverter"/>

    <property name="CONSOLE_LOG_PATTERN"
              value="${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}){} %clr(${PID:-}){magenta} %clr(--- %esb(){APPLICATION_NAME}%esb{APPLICATION_GROUP}[%15.15t] ${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}"/>
    <property name="CONSOLE_LOG_CHARSET" value="${CONSOLE_LOG_CHARSET:-${file.encoding:-UTF-8}}"/>
    <property name="CONSOLE_LOG_THRESHOLD" value="${CONSOLE_LOG_THRESHOLD:-TRACE}"/>
    <property name="CONSOLE_LOG_STRUCTURED_FORMAT" value="${CONSOLE_LOG_STRUCTURED_FORMAT:-}"/>
    <property name="FILE_LOG_PATTERN"
              value="${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:-} --- %esb(){APPLICATION_NAME}%esb{APPLICATION_GROUP}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}"/>
    <property name="FILE_LOG_CHARSET" value="${FILE_LOG_CHARSET:-${file.encoding:-UTF-8}}"/>
    <property name="FILE_LOG_THRESHOLD" value="${FILE_LOG_THRESHOLD:-TRACE}"/>
    <property name="FILE_LOG_STRUCTURED_FORMAT" value="${FILE_LOG_STRUCTURED_FORMAT:-}"/>

    <logger name="org.apache.catalina.startup.DigesterFactory" level="ERROR"/>
    <logger name="org.apache.catalina.util.LifecycleBase" level="ERROR"/>
    <logger name="org.apache.coyote.http11.Http11NioProtocol" level="WARN"/>
    <logger name="org.apache.sshd.common.util.SecurityUtils" level="WARN"/>
    <logger name="org.apache.tomcat.util.net.NioSelectorPool" level="WARN"/>
    <logger name="org.eclipse.jetty.util.component.AbstractLifeCycle" level="ERROR"/>
    <logger name="org.hibernate.validator.internal.util.Version" level="WARN"/>
    <logger name="org.springframework.boot.actuate.endpoint.jmx" level="WARN"/>
</included>

```
