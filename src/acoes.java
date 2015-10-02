import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class acoes implements ActionListener {

    private TelaPrincipal frame;

    public acoes(TelaPrincipal frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Alunos".equals(e.getActionCommand())) {
            Alunos a = new Alunos();
            a.setVisible(true);
            frame.getDDesktopPane().add(a);
        } else if ("Professores".equals(e.getActionCommand())) {
            Professores p = new Professores();
            p.setVisible(true);
            frame.getDDesktopPane().add(p);
        } else if ("sobre".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Desenvolvedores: Humberto Macosso/n José Vitor Morona Souza/n William Luciano/n/n Destinado à matéria de Tópicos Especiais I");
        } else if ("sair".equals(e.getActionCommand())) {
            System.exit(0);
        }
    }
}