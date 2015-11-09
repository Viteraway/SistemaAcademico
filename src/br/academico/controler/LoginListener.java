package br.academico.controler;

import br.academico.modelo.Usuario;
import br.academico.modelo.base.UsuariosBD;
import br.academico.visao.LoginPanel;
import br.academico.visao.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

    private static final String LOGIN_ADMIN = "admin";
    private static final String SENHA_ADMIN = "admin";

    private LoginPanel panel;

    public LoginListener(LoginPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Acessar".equals(e.getActionCommand())) {
            Usuario user = panel.getUsuario();
            if (user.getLogin() == null || user.getLogin().trim().length() == 0) {
                JOptionPane.showMessageDialog(panel, "Informe o nome login");
                return;
            } else if (user.getSenha() == null || (user.getSenha().trim().length() == 0)) {
                JOptionPane.showMessageDialog(panel, "Informe a senha");
                return;
            } else if (user.getLogin().equals(LOGIN_ADMIN) && user.getSenha().equals(SENHA_ADMIN)) {
                TelaPrincipal tb = new TelaPrincipal();
                tb.setVisible(true);
            } else {
                if (UsuariosBD.login(user.getLogin(), user.getSenha())) {
                    TelaPrincipal tb = new TelaPrincipal();
                    tb.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(panel, "Usuário/senha Inválido!");
                }
            }
        } else if ("Sair".equals(e.getActionCommand())) {
            System.exit(0);
        }
    }

}
