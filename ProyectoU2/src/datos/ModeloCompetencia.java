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
public class ModeloCompetencia extends AbstractListModel implements ComboBoxModel {

    ArrayList<Competencia> competencias = new ArrayList();
    Competencia selection;

    public ModeloCompetencia() throws FileNotFoundException {
        competencias = new Competencia().obtenercompetencias();
    }

    @Override
    public int getSize() {
        return competencias.size();
    }

    @Override
    public Object getElementAt(int i) {
        return competencias.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        Competencia c = (Competencia) o;
        selection = c;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }

}
