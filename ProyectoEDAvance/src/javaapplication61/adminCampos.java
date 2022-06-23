/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jafet
 */
public class adminCampos {

    private File archivo = null;
    private ArrayList<Campo> listacampos;

    public adminCampos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Campo> getListacampos() {
        return listacampos;
    }

    public void setListacampos(ArrayList<Campo> listacampos) {
        this.listacampos = listacampos;
    }

    public void setCampo(Campo c) {
        listacampos.add(c);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Campo t : listacampos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getTipo() + ";");
                bw.write(t.isLlave()+ ";");
                bw.write(t.getLongitud() + ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listacampos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listacampos.add(new Campo(sc.next(), sc.next(), sc.nextBoolean(), Integer.parseInt(sc.next())));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF

    }
    
}
