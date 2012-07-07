/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Armando
 */
@ManagedBean(name = "customer")
@ViewScoped
public class Customer implements Serializable 
{
    private String addrState;
    private String nombre;
    private String apellido;
    private String usuario;
    private String pass;
    private Date birthDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    private String email;
    private String telefono;
    private boolean estado;
    
    public Customer() {
    }

    public String getAddrState() {
        return addrState;
    }
    
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate() {
        String formattedDate = "";

        if (birthDate != null) {
            formattedDate = sdf.format(birthDate);

        }
        return formattedDate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAddrState(String addrState) {
        System.out.println("setAddrState() invoked, value = " + addrState);
        this.addrState = addrState;
    }
    
}
