package com.soebes.examples.j2ee.sevice.api;

import org.junit.Test;

import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

public class GreeterTest {

    private final Predicate<Map.Entry<Object, Object>> JAVA = item -> item.getKey().toString().startsWith("java.");
    private final Predicate<Map.Entry<Object, Object>> SUN = item -> item.getKey().toString().startsWith("sun.");

    @Test
    public void printout() {
        Properties properties = System.getProperties();

        System.out.println("------------");
        properties
                .entrySet().stream()
                .filter(JAVA.or(SUN).negate())
                .forEach(item -> System.out.println("    k:" + item.getKey() + " v:" + item.getValue()));
    }
}