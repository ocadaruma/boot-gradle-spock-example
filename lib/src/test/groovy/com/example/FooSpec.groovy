package com.example

import spock.lang.Specification

class FooSpec extends Specification {

    def testFoo() {
        expect:
        (new Foo()).foo() == 43 // fails
    }
}
