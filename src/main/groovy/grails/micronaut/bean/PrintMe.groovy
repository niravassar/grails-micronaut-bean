package grails.micronaut.bean

import javax.inject.Singleton

@Singleton
class PrintMe {

    String go() {
        "Printing from PrintMe bean"
    }
}
