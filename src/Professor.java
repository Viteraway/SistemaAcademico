
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Professor implements ActionListener{
    private Professores professor;

    public Professor(Professores professores) {
        this.professor = professores;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())){
            professor.dispose();
        }else if ("salvar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(professor, "Em ajustes");
        }
    }
    
}