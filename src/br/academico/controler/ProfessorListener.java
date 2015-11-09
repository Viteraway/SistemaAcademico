package br.academico.controler;

import br.academico.modelo.base.ProfessorBD;
import br.academico.visao.ProfessoresPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfessorListener implements ActionListener {

    private ProfessoresPanel panel;

    public ProfessorListener(ProfessoresPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("Salvar".equals(e.getActionCommand())) {
            ProfessorBD.add(panel.getProfessor());
            panel.dispose();
        }
    }

}
