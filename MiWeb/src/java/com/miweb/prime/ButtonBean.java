/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.prime;

/**
 *
 * @author armando
 */
		
import javax.faces.event.ActionEvent;
import javax.faces.context.FacesContext;
import javax.faces.application.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "buttonBean")
@ViewScoped
public class ButtonBean {
	
	public void save(ActionEvent actionEvent) {
		addMessage("Data saved");
	}
	
	public void update(ActionEvent actionEvent) {
		addMessage("Data updated");
	}
	
	public void delete(ActionEvent actionEvent) {
		addMessage("Data deleted");
	}
	
	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
