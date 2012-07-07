/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import com.miweb.com.Usuario;
import com.miweb.com.menu;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author PC
 */
@ManagedBean(name = "loginBean")
@SessionScoped 
public class login implements Serializable
{
    private Usuario user;
    private menu menu;
    
    public login() 
    {
        user=new Usuario();
        menu=new menu();
    }
    
    public String CheckValidUser() throws ValidatorException 
    {
        if(user.getIdUsuario().compareTo("admin")==0&& user.getPass().compareTo("admin")==0)
        { 
            System.out.println("Entre");
            menu.activarAdmin();
            return "general";
        } 
        else
        { 
            if(user.getIdUsuario().compareTo("abc")==0&& user.getPass().compareTo("abc")==0)
            { 
                System.out.println("Entre 2");
                menu.activarABC();
                return "consutaProductos";
            } 
            else
            { 
                String msgText = " Usuario or password Incorrecta"; 
                
                //FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "ERROR 1", "ERROR 2");  
                //addMessage(message); 
                System.out.println(msgText);
                
                FacesContext context = FacesContext.getCurrentInstance();  
          
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "Usuario NO Registrado"));  
                
                
                return "index";
                
                //FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msgText, null); 
                //throw new ValidatorException(msg); 
            }
        } 
         
    }
    
    public Usuario getUsuario() {
        return user;
    }

    public void setUsuario(Usuario usuario) {
        this.user = usuario;
    }
    
    public menu getMenu() {
        return menu;
    }

    public void setMenu(menu menu) {
        this.menu = menu;
    }
    
}
