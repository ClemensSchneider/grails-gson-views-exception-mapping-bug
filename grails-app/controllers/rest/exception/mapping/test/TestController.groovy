package rest.exception.mapping.test

class TestController {
    def index () {
        throw new IllegalStateException('This should go to the custom error view')
    }
}
