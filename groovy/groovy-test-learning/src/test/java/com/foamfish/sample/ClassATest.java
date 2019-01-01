package com.foamfish.sample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class ClassATest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void functionA_arg_is_A() {
        assertTrue(new ClassA().functionA("A").equals("A"));
    }

    @Test
    public void functionA_arg_is_B() {
        assertTrue(new ClassA().functionA("B").equals("B"));
    }

    @Test
    public void functionA_arg_is_C() {
        assertTrue(new ClassA().functionA("C").equals("C"));
    }

    @Test
    public void functionA_throws_IllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        new ClassA().functionA("D");
    }
}
