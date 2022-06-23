/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import java.util.ArrayList;

/**
 *
 * @author manso
 */
public class Registropersona {

    ArrayList<Campo> campos;
    ArrayList<String> atributos;
    
    public Registropersona() {
         
    }
    public Registropersona(ArrayList<Campo> campos){
        this.campos=campos;
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        
      StringBuffer sb = new StringBuffer();
      for(int i = 0; i < atributos.size(); i++) {
         sb.append(atributos.get(i));
         sb.append("-");
      }
      String str = sb.toString();
      return str;
   }
       
}
