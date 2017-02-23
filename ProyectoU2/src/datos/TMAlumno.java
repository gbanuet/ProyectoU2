/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
/**
 *
 * @author tavos
 */
public class TMAlumno implements TableModel{

    private List <Alumno> alumnos;
    
        
        
    
    public TMAlumno(List<Alumno> lista){
        alumnos = lista;
    }
    @Override
    public int getRowCount() {
       return  alumnos.size();
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public String getColumnName(int i) {
       String titulo = null;
        switch (i) {
            case 0:
                titulo="Nombre";
                break;
             case 1:
                titulo="Numero de control";
                break;
                 case 2:
                titulo="Carrera";
                break;
            
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        
       return i1 !=1;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Alumno a = alumnos.get(i1);
        
        String valor = null;
        
        switch (i1) {
            case 0:
                valor = a.getNombre();
                break;
            case 1:
                valor = a.getNumControl();
                break;
           /* case  2:
                valor = a.getMiCArrera().toString*/
                
        }
        return valor;
    }



    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
       
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
