package com.foamfish.sample

class ClassBTest extends GroovyTestCase {

    void "testFunctionB_arg_is_A"() {
        assert new ClassB().functionB("A") == "A"
    }

    void testFunctionB_arg_is_B() {
        assert new ClassB().functionB("B") == "B"
    }

    void testFunctionB_arg_is_C() {
        assert new ClassB().functionB("C") == "C"
    }

    void testFunctionA_throws_IllegalArgumentException() {
        ClassB b = new ClassB()
        String message = shouldFail(IllegalArgumentException) {
            b.functionB("D")
        }
        assert message == "error argument."
    }
}
