/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.omanbroadband.mavenproject3.config;

import javax.annotation.security.DeclareRoles;
import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import javax.security.enterprise.identitystore.LdapIdentityStoreDefinition;

/**
 *
 * @author ahmed.battashi
 */
@ApplicationScoped
@FormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(
                errorPage = "/mvc/sec/login/err",
                loginPage = "/mvc/sec/login"
               )
)
@DeclareRoles({"ReporterRole", "LoggedRole","admin"})
@LdapIdentityStoreDefinition(
        url = "ldap://localhost:10389/",
        bindDn = "uid=admin,ou=system",
        bindDnPassword = "secret",
        callerBaseDn = "ou=users,ou=system,dc=obbdev,dc=com",
        callerNameAttribute = "cn",
        groupSearchBase = "ou=groups,ou=system,dc=obbdev,dc=com"
)
 
public class SecurityConfig {

}
