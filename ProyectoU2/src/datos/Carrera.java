/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Carrera {

    private int clave;
    private String nombre;
    private Carrera miCarrera;
    private ArrayList<Premio> pruebas;
    
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void guardarCarrera() {

        File f = new File("Carrera.txt");

        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.print(nombre + ",");
            pw.print(clave);
            pw.println();
            bw.close();
            pw.close();

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
    
   

}
