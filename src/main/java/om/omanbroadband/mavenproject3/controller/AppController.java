package om.omanbroadband.mavenproject3.controller;

import java.util.logging.Logger;
import javax.annotation.security.RolesAllowed;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/")
@Controller

public class AppController {

    private static final Logger logger = Logger.getLogger("AppController");

    
    //public page, no reole required
    @Path("app")
    @GET
    @View("hello.jsp")
    public void sayHello(@Context SecurityContext securityContext) {

        logger.info("AdminRole :: " + securityContext.isUserInRole("AdminRole"));
        logger.info("admin :: " + securityContext.isUserInRole("admin"));
        logger.info("INFO :: " + securityContext.isSecure());

    }

    //this page should only appear after login 
    @Path("admin_area")
    @GET
    @View("admin_page.jsp")
    @RolesAllowed("admin")
    public void sayRole(@Context SecurityContext securityContext) {

        logger.info("AdminRole :: " + securityContext.isUserInRole("AdminRole"));
        logger.info("admin :: " + securityContext.isUserInRole("admin"));
        logger.info("INFO :: " + securityContext.isSecure());

    }
}
