package com.foamfish.sample

import spock.lang.Specification

class ClassCTest extends Specification {

    ClassC c = new ClassC()

    def expectedA = "A"
    def expectedB = "B"

    def "场景1:参数为\"A\"时的返回值"() {
        given:
        def argA = "A"
        and:
        argA = "A"

        when:
        String result = c.functionC(argA)

        then:
        result == expectedA
//        and:
//        result == expectedB
    }

    def "场景1:参数为\"B\"时的返回值"() {
        given:
        def argB = "B"

        when:
        String result = c.functionC(argB)

        then:
        result == expectedB
    }

    def "场景3:参数为\"E\"时的返回值"() {

        given: "mock error"
        def argB = "E"
        c.functionC(argB) >> { throw new IllegalArgumentException("Mock error") }

        when: "throw error"
        c.functionC(argB)

        then: "validator"
//        thrown(IllegalArgumentException)
        IllegalArgumentException illegalArgumentException = thrown(IllegalArgumentException)
        illegalArgumentException.message == "error argument."
    }

}
