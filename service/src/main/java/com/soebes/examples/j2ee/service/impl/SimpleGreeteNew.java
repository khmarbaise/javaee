package com.soebes.examples.j2ee.service.impl;

import javax.ejb.Stateless;

import com.soebes.examples.j2ee.domain.Name;
import com.soebes.examples.j2ee.sevice.api.Greeter;

/**
 * Session Bean implementation class SimpleGreeteNew
 */
@Stateless
public class SimpleGreeteNew implements Greeter {

    @Override
    public String greet(Name name) {
        return "Halle GeeteNew!";
    }


}
