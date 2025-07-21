package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGreeter {

    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        String result = greeter.sayHello();
        assertEquals("Hello, Jenkins!", result);
    }
}
