package cz.czechitas.java2webapps.lekce4.entity;

/**
 * Informace o lektorovi.
 */
public class Lektor {
    //    fieldy
    private String jmeno;
    //    datový typ je enum Role
    private Role role;

    //    bezparametrický konstruktor
    public Lektor() {
    }

    //    konstruktor s parametry
    public Lektor(String jmeno, Role role) {
        this.jmeno = jmeno;
        this.role = role;
    }

//    gettery a settery, jsou zde dvě property: jmeno a role

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
