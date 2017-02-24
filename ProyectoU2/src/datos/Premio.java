/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Premio {

    private String clave;
    private String descripcion;

    public Premio(String clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }
 

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void guardarPremio() {

        File f = new File("Premio.txt");

        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.print(clave + ",");
            pw.print(descripcion);
            pw.println();
            bw.close();
            pw.close();

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
    
       public ArrayList<Premio> obtenerTodospremios() throws FileNotFoundException {
        ArrayList<Premio> lista = new ArrayList();
        File f = new File("Premio.txt");
        if (f.exists()) {
            Scanner in = new Scanner(f);
            in.useDelimiter("[,\n]");
            
            
            while (in.hasNext()) {

               

                
               
                
              

            }

        }

        return lista;
    }

}
