package br.academico.controler;

import br.academico.modelo.base.MateriaBD;
import br.academico.visao.MateriasPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MateriaListener implements ActionListener {

    private MateriasPanel panel;

    public MateriaListener(MateriasPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("Salvar".equals(e.getActionCommand())) {
            MateriaBD.add(panel.getMateria());
            panel.dispose();
        }
    }

}
