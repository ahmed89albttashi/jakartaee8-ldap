# jakartaee8-ldap
Jakartaee 8 simple Annotation LDAP Form-based login

## Using Apche Directory to run LDAP 
Import LDIF file `ldap_ldif/schema.ldif`

## Project configuration 
* LDAP PORT: 10389
* LDAP Admin Password: secret , it's avilable in ldif file as default if you are not change it.

## Available LDAP User|Password to test : 
* ahmed  | 221 -> with Admin role -> can access  `/mvc/admin_area`
* salim | 221 -> without Admin -> cannot access `/mvc/admin_area`

## Please Fork/Share your updates
