package grails.micronaut.bean

import io.micronaut.context.BeanContext
import org.springframework.beans.factory.annotation.Autowired

class BeanController {

    @Autowired
    protected PrintMe printMe

    def index() {
        String message = printMe?.go() ?: "NOTHING"
        render "This is executed: $message"
    }
}
