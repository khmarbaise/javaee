package com.soebes.examples.j2ee.service.impl;


import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.soebes.examples.j2ee.domain.Name;
import com.soebes.examples.j2ee.sevice.api.Greeter;


@Remote
@Stateless
public class SimpleGreeter implements Greeter {

    @Override
    public String greet(Name name) {
        return "Hello " + name + "!";
    }

}
