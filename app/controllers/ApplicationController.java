package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import services.Counter;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApplicationController extends Controller {

    @Inject
    public ApplicationController() {}

    public Result hello() {
        return ok("Hello World");
    }

    public Result echo(String msg) {
        return ok("Echoing " + msg);
    }

    public Result helloRedirect() {
        return redirect(controllers.routes.ApplicationController.echo("HelloWorldv2"));
    }
}
