package br.academico.controler;

import br.academico.modelo.base.CursoBD;
import br.academico.visao.CursosPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CursoListener implements ActionListener {

    private CursosPanel panel;

    public CursoListener(CursosPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("Salvar".equals(e.getActionCommand())) {
            CursoBD.add(panel.getCurso());
            panel.dispose();
        }
    }

}
