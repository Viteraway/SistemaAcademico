import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Aluno implements ActionListener{
    private Alunos aluno;

    public Aluno(Alunos alunos) {
        this.aluno = alunos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("sair".equals(e.getActionCommand())){
            aluno.dispose();
        }else if ("salvar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(aluno, "Programa em manutenção.");
        }
    }
    
}