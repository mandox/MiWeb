/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Usuario implements Serializable
{
    String idUsuario;
    String pass;

    public Usuario(String idUsuario, String pass) {
        this.idUsuario = idUsuario;
        this.pass = pass;
    }

    public Usuario() {
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
