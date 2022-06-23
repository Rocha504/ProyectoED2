/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import java.util.ArrayList;

/**
 *
 * @author Jafet
 */
public class Registro {

    private ArrayList<Registropersona> listaPersonas = new ArrayList();
    private ArrayList<RegistroCity> listaCity = new ArrayList();

    public ArrayList<Registropersona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Registropersona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<RegistroCity> getRegistroCity() {
        return listaCity ;
    }

    public void setRegistroCity(ArrayList<RegistroCity> listaVehiculos) {
        this.listaCity  = listaVehiculos;
    }
}
