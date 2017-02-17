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
public class Calificacion {
    
    private int clave;
    private double ponderacion;
    private int calificacion;
    
    public int getClave() {
        return clave;
    }
    
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public double getPonderacion() {
        return ponderacion;
    }
    
    public void setPonderacion(double ponderacion) {
        this.ponderacion = ponderacion;
    }
    
    public int getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void guardarCalificacion() {
        
        File f = new File("Calificacion.txt");
        
        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print(clave + ",");
            pw.print(ponderacion + ",");
            pw.print(calificacion);
            pw.println();
            
            bw.close();
            pw.close();
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        
    }
    
    public ArrayList<Calificacion> obtenerTodos() throws FileNotFoundException {
        ArrayList<Calificacion> lista = new ArrayList();
        File f = new File("calificacion.txt");
        if (f.exists()) {
            Scanner in = new Scanner(f);
            in.useDelimiter(",\n");
            
            while (in.hasNext()) {
                
                Calificacion c = new Calificacion();
                int _clave;
                String _temp = in.next();
                _clave = Integer.parseInt(_temp);
                double _ponderacion;
                _temp = in.next();
                _ponderacion = Double.parseDouble(_temp);
                int _calificacion;
                _temp = in.next();
                _calificacion = Integer.parseInt(_temp);
                
                c.setCalificacion(_calificacion);
                c.setClave(_clave);
                c.setPonderacion(_ponderacion);
                lista.add(c);
                
            }
            
        }
        
        return lista;
    }
}
