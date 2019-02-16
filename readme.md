引入web shiro


lib : 
shiro-all-1.3.2.jar
log4j-1.2.15.jar
slf4-api-1.6.1.jar
slf4j-log4j12-1.6.1.jar

1. 配置shiroFilter
```xml
 <!-- Shiro Filter is defined in the spring application context: -->
    <filter>
        <filter-name>shiroFilter</filter-name>
        <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
        <init-param>
            <param-name>targetFilterLifecycle</param-name>
            <param-value>true</param-value>
        </init-param>
    </filter>

    <filter-mapping>
        <filter-name>shiroFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

2.spring 配置 shiro
