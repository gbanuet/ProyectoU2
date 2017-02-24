/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author tavos
 */
public class ModeloAlumno extends AbstractListModel implements ComboBoxModel{

    ArrayList<Alumno> alumnos = new ArrayList();
            
     public ModeloAlumno() throws FileNotFoundException{
         alumnos = new Alumno().obtenerTodos();
     }   
     
     Alumno selection;
    @Override
    public int getSize() {
        return alumnos.size();
    }

    @Override
    public Object getElementAt(int i) {
        return alumnos.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        Alumno a = (Alumno) o;
        selection= a;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
    
}
