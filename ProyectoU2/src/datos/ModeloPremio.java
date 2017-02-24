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
public class ModeloPremio extends AbstractListModel implements ComboBoxModel{
    ArrayList<Premio>premio=new ArrayList();
    
    public ModeloPremio() throws FileNotFoundException{
    premio=new Premio(null,null).obtenerTodospremios();
    
    
    }
    Premio selection;

    @Override
    public int getSize() {
       return premio.size();
    }

    @Override
    public Object getElementAt(int i) {
        return premio.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        Premio p =(Premio)o;
        selection = p;
    }

    @Override
    public Object getSelectedItem() {
        return selection; 
    }
    
    
    
}
