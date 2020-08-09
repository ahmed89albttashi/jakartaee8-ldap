/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.omanbroadband.mavenproject3.controller;

import java.util.logging.Logger;
import javax.annotation.security.RolesAllowed;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

/**
 *
 * @author ahmed.battashi
 */
@Path("/")
@Controller
public class SecurityController {
        private static final Logger logger = Logger.getLogger("SecurityController");

    @Path("/sec/login")
    @GET
    @View("security/login.jsp")
    public void login(@Context HttpServletRequest req) {
        //logout before login
        req.getSession().invalidate();
        
    }
    
    @Path("/sec/login_post")
    @GET
    @View("security/login.jsp")
    public void login_post() {

    }
    
    @Path("/sec/login_err")
    @GET
    @View("security/login_err.jsp")
    public void login_err() {

    }


}
