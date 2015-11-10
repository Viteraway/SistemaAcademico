package br.academico.controler;

import br.academico.visao.ProfessoresPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ProfessorListener implements ActionListener {

    private ProfessoresPanel panel;

    public ProfessorListener(ProfessoresPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("salvar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(panel, "Em ajustes");
        }
    }

}
