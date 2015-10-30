package br.academico.controler;

import br.academico.modelo.Usuario;
import br.academico.visao.UsuariosPanel;
import br.academico.visao.LoginPanel;
import br.academico.visao.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

    private LoginPanel panel;

    public LoginListener(LoginPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("conectar".equals(e.getActionCommand())) {
            Usuario user = panel.getUsuario();

            if (user.getLogin() == null || user.getLogin().trim().length() == 0) {
                JOptionPane.showMessageDialog(panel, "Digite  o nome do usuário!");
                return;
            } else if (user.getSenha() == null || (user.getSenha().trim().length() == 0)) {
                JOptionPane.showMessageDialog(panel, "Digite sua senha");
            } else if (user.getLogin().equals("Admin") && (user.getSenha().equals("Admin"))) {
                TelaPrincipal tb = new TelaPrincipal();
                tb.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(panel, "Usuário ou senha inválidos.");
            }

        } else if ("sair".equals(e.getActionCommand())) {
            System.exit(0);
        }
    }

}
