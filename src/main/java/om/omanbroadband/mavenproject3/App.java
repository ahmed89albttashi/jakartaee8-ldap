package om.omanbroadband.mavenproject3;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Default JAX-RS application listening on /mvc
 */

@ApplicationScoped
@ApplicationPath("/mvc")
public class App extends Application {
}