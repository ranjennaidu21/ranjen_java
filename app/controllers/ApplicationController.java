package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.products;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApplicationController extends Controller {

    private static final java.util.Map<Integer, String> productMap = new java.util.HashMap<Integer, String>();

    static {
        productMap.put(1, "Keyboard");
        productMap.put(2, "Mouse");
        productMap.put(3, "Monitor");
    }

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

    public Result listProducts() {
        return ok(products.render(productMap.values()));
    }
}
