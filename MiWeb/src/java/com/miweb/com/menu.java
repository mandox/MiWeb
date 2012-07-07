/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import java.io.Serializable;

/**
 *
 * @author Armando
 */

public class menu implements Serializable
{
    private boolean menu1;      //datosempleado - Ficha
    private boolean menu2;      //datosempleado - Actualiza Datos
    private boolean menu3;      //reportes
    private boolean menu4;      //solicitudes
    private boolean menu5;      //consultas
    private boolean menu6;      //uniformes
    private boolean menu7;      //tardanzas
    
    private boolean menu1_1;      //datosempleado - Ficha
    private boolean menu1_2;      //datosempleado - Actualiza Datos
    private boolean menu1_3;      //reportes
    private boolean menu1_4;      //solicitudes
    private boolean menu2_1;      //consultas
    private boolean menu2_2;      //uniformes
    private boolean menu3_1;      //tardanzas
    private boolean menu3_2;      //uniformes
    private boolean menu4_1;      //tardanzas
    private boolean menu4_2;
    
    public menu() 
    {
        menu1=false;
        menu2=false;
        menu3=false;
        menu4=false;
        menu5=false;
        
        menu1_1=true;
        menu2_1=true;
        menu3_1=true;
        menu4_1=true;
        menu1_2=true;
        menu2_2=true;
        menu3_2=true;
        menu4_2=true;
    }

    public boolean isMenu1() {
        return menu1;
    }

    public void setMenu1(boolean menu1) {
        this.menu1 = menu1;
    }

    public boolean isMenu1_1() {
        return menu1_1;
    }

    public void setMenu1_1(boolean menu1_1) {
        this.menu1_1 = menu1_1;
    }

    public boolean isMenu1_2() {
        return menu1_2;
    }

    public void setMenu1_2(boolean menu1_2) {
        this.menu1_2 = menu1_2;
    }

    public boolean isMenu1_3() {
        return menu1_3;
    }

    public void setMenu1_3(boolean menu1_3) {
        this.menu1_3 = menu1_3;
    }

    public boolean isMenu1_4() {
        return menu1_4;
    }

    public void setMenu1_4(boolean menu1_4) {
        this.menu1_4 = menu1_4;
    }

    public boolean isMenu2() {
        return menu2;
    }

    public void setMenu2(boolean menu2) {
        this.menu2 = menu2;
    }

    public boolean isMenu2_1() {
        return menu2_1;
    }

    public void setMenu2_1(boolean menu2_1) {
        this.menu2_1 = menu2_1;
    }

    public boolean isMenu2_2() {
        return menu2_2;
    }

    public void setMenu2_2(boolean menu2_2) {
        this.menu2_2 = menu2_2;
    }

    public boolean isMenu3() {
        return menu3;
    }

    public void setMenu3(boolean menu3) {
        this.menu3 = menu3;
    }

    public boolean isMenu3_1() {
        return menu3_1;
    }

    public void setMenu3_1(boolean menu3_1) {
        this.menu3_1 = menu3_1;
    }

    public boolean isMenu3_2() {
        return menu3_2;
    }

    public void setMenu3_2(boolean menu3_2) {
        this.menu3_2 = menu3_2;
    }

    public boolean isMenu4() {
        return menu4;
    }

    public void setMenu4(boolean menu4) {
        this.menu4 = menu4;
    }

    public boolean isMenu5() {
        return menu5;
    }

    public void setMenu5(boolean menu5) {
        this.menu5 = menu5;
    }

    public boolean isMenu6() {
        return menu6;
    }

    public void setMenu6(boolean menu6) {
        this.menu6 = menu6;
    }

    public boolean isMenu7() {
        return menu7;
    }

    public void setMenu7(boolean menu7) {
        this.menu7 = menu7;
    }

    public boolean isMenu4_1() {
        return menu4_1;
    }

    public void setMenu4_1(boolean menu4_1) {
        this.menu4_1 = menu4_1;
    }

    public boolean isMenu4_2() {
        return menu4_2;
    }

    public void setMenu4_2(boolean menu4_2) {
        this.menu4_2 = menu4_2;
    }
    
    
    public void activarAdmin()
    {
        this.menu1 = true;
        this.menu2 = true;
        this.menu3 = true;
        this.menu4 = false;
    }
    
    public void activarABC()
    {
        this.menu1 = true;
        this.menu2 = true;
        this.menu4 = true;
        this.menu3 = false;
    }
}
