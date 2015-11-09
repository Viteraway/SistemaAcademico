package br.academico.controler;

import br.academico.modelo.base.AlunosBD;
import br.academico.visao.AlunosPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlunoListener implements ActionListener {

    private AlunosPanel panel;

    public AlunoListener(AlunosPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("Salvar".equals(e.getActionCommand())) {
            AlunosBD.add(panel.getAluno());
            panel.dispose();
        }
    }

}
