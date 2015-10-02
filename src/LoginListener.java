
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {
    
    private Login login;

    public LoginListener(Login login) {
        this.login = login;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("conectar".equals(e.getActionCommand())) {
            Usuario user = login.getUsuario();

            if (user.getNome() == null || user.getNome().trim().length() == 0) {
                JOptionPane.showMessageDialog(login, "Digite  o nome do usuário!");
                return;
            } else if(user.getSenha() == null || (user.getSenha().trim().length() == 0)){
                JOptionPane.showMessageDialog(login, "Digite sua senha");
            }else if (user.getNome().equals("Admin") && (user.getSenha().equals("Admin"))) {
                TelaPrincipal tb = new TelaPrincipal();
                tb.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(login, "Usuário ou senha inválidos.");
            }

        } else if ("sair".equals(e.getActionCommand())) {
            System.exit(0);
        }
    }

}
    

