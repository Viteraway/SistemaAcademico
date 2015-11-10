package br.academico.controler;

import br.academico.visao.AlunosPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AlunoListener implements ActionListener {

    private AlunosPanel panel;

    public AlunoListener(AlunosPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("salvar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(panel, "Em ajustes.");
        }
    }

}
