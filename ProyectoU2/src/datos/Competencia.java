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
public class Competencia {

    private String Nombre;
    private String descripcion;
    private String clave;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void guardarCompetencia() {

        File f = new File("Competencia.txt");

        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Nombre + ",");
            pw.print(descripcion + ",");
            pw.print(clave);

            pw.println();
            bw.close();
            pw.close();

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

    public ArrayList<Competencia> obtenercompetencias() throws FileNotFoundException {
        ArrayList<Competencia> lista = new ArrayList();
        File f = new File("Competencia.txt");
        if (f.exists()) {
            Scanner in = new Scanner(f);
            in.useDelimiter("[,\n]");

            while (in.hasNext()) {
                Competencia c = new Competencia();
                
                  String temp;
                String _Nombre = in.next();
                String _descripcion = in.next();
                 String _clave=in.next();
                c.setDescripcion(_descripcion);
                c.setNombre(_Nombre);
                c.setClave(_clave);
                lista.add(c);

            }

        }

        return lista;
    }

    @Override
    public String toString() {
        return this.Nombre ; //To change body of generated methods, choose Tools | Templates.
    }
    

}
