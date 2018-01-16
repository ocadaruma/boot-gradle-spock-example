package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class AppSpec extends Specification {

    @Autowired
    App app

    def testInstantiation() {
        expect:
        app != null
    }
}
