package com.maciejwalkowiak.wiremock.spring;

import java.lang.annotation.*;

import com.github.tomakehurst.wiremock.WireMockServer;

/**
 * Configures WireMock instance.
 *
 * @author Maciej Walkowiak
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigureWiremock {

    /**
     * Port on which WireMock server is going to listen. {@code 0} means WireMock will pick random port.
     *
     * @return WireMock server port
     */
    int port() default 0;

    /**
     * The name of WireMock server.
     *
     * @return the name of WireMock server.
     */
    String name();

    /**
     * The name of Spring property to inject the {@link WireMockServer#baseUrl()}
     *
     * @return the name of Spring property to inject the {@link WireMockServer#baseUrl()}
     */
    String property() default "";
}