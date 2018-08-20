# Run

Open console in project root and run `grailsw run-app`

# Expected

`UrlMappings.groovy` does contain a mapping to render an `java.lang.IllegalStateException` using the view `my/error`:

`"500"(view:'/my/error', exception: IllegalStateException)`

This should resolve to the gson-view `/grails-app/views/my/error.gson` when throwing an `IllegalStateException` in `TestController`.

Test calling http://localhost:8084/test

# Issue

This does work when using regular gsp-based view rendering but does not when using `.gson` views. The view `/grails-app/views/error.gson`
is used for rendering instead.
