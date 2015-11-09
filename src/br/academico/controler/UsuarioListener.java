package br.academico.controler;

import br.academico.modelo.base.UsuariosBD;
import br.academico.visao.UsuariosPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioListener implements ActionListener {

    private UsuariosPanel panel;

    public UsuarioListener(UsuariosPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cancelar".equals(e.getActionCommand())) {
            panel.dispose();
        } else if ("Salvar".equals(e.getActionCommand())) {
            UsuariosBD.add(panel.getUsuario());
            panel.dispose();
        }
    }

}
