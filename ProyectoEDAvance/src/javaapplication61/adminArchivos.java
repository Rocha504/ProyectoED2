/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jafet
 */
public class adminArchivos {
    private File archivo = null;
 
    
    public adminArchivos(String path) {
        archivo = new File(path);
    }
    
    public void cargarArchivo() {
        try {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                
                bw.flush();
            } catch (Exception ex) {
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
