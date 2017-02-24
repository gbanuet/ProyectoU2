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
public class TMPremios implements TableModel{

    private List<Premio> premios;
    
    public TMPremios(List<Premio> lista){
        premios=lista;
    }
    
    @Override
    public int getRowCount() {
    return premios.size();
    }

    @Override
    public int getColumnCount() {
        return  2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        
        switch (columnIndex) {
            case 0:
                titulo="Id";
                break;
            case 1:
                titulo="Descripcion";
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
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Premio p = premios.get(rowIndex);
        String valor= null;
         switch (columnIndex) {
            case 0:
                valor=p.getClave();
                break;
            case 1:
                valor=p.getDescripcion();
                break;    
           
        }
        return valor;
        
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        
    }
    
}
