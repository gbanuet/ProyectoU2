/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Competencia {
    private String Nombre;
    private String descripcion;
    private int clave;
    private ArrayList<Premio> premios;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void guardarCompetencia() {

        File f = new File("Competencia.txt");

        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Nombre + ",");
            pw.print(descripcion+ ",");
            pw.print(clave);
            
            pw.println();
            bw.close();
            pw.close();

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

}
