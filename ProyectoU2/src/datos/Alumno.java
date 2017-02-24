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
public class Alumno {

    private String nombre;
    private String numControl;
    private Carrera miCArrera;
    private Premio miPremio;

    public Carrera getMiCArrera() {
        return miCArrera;
    }

    public void setMiCArrera(Carrera miCArrera) {
        this.miCArrera = miCArrera;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public void guardarAlumno() {

        File f = new File("Alumnos.txt");

        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.print(nombre + ",");
            pw.print(numControl+",");
            pw.print(miCArrera);
            pw.println();
            bw.close();
            pw.close();

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
//lee todos los estudiantes
    public ArrayList<Alumno> obtenerTodos() throws FileNotFoundException {
        ArrayList<Alumno> lista = new ArrayList();
        File f = new File("Alumnos.txt");
        if (f.exists()) {
            Scanner in = new Scanner(f);
            in.useDelimiter("[,\n]");
            
            
            while (in.hasNext()) {

                Alumno c = new Alumno();
                Carrera carre = new Carrera();

                String _nombre = in.next();
                String _numControl = in.next();
                
                String _nombrecarre =in.next();
                
                String _clavecarre= in.next();

                c.setNombre(_nombre);
                c.setNumControl(_numControl);
                carre.setNombre(_nombrecarre);
               // carre.setClave(Integer.parseInt(_clavecarre));
                
                lista.add(c);

            }

        }

        return lista;
    }

 
    @Override
    public String toString(){
        return this.nombre+"\n";
    }
}
