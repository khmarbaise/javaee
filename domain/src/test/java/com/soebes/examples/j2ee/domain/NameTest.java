package com.soebes.examples.j2ee.domain;

import org.junit.Test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NameTest {

    private final Predicate<Entry<Object, Object>> startsWith(String beginning) {
        return s -> s.getKey().toString().startsWith(beginning);
    }

    private final Predicate<Entry<Object, Object>> JAVA = startsWith("java.");
    private final Predicate<Entry<Object, Object>> SUN = startsWith("sun.");

    @Test
    public void printout() {
        Properties properties = System.getProperties();

        Map<Object, Object> collect = properties
                .entrySet()
                .stream()
                .collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue()));

//                .filter(star tsWith("java.").negate().and(startsWith("sun.").negate()))
//                .filter(startsWith("java.").or(startsWith("sun.")).negate())
//                .filter(JAVA.or(SUN).negate())
//                .filter(not(JAVA.or(SUN)))
        System.out.println("------------");
        collect
                .entrySet()
                .stream()
                .filter(Predicate.not(JAVA))
                .filter(Predicate.not(SUN))
                .forEach(item -> System.out.println("    k:" + item.getKey() + " v:" + item.getValue()));


    }
}