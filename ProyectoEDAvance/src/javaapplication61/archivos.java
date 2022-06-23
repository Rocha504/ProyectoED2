/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import java.io.Serializable;

/**
 *
 * @author Jafet
 */
public class archivos implements Serializable{
    private Registro registro;

    public archivos() {
    }

    public archivos(Registro registro) {
        this.registro = registro;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
    
}
