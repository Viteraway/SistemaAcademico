package br.academico.modelo.base;

import br.academico.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunosBD {

    private static List<Aluno> list = new ArrayList();

    public static void add(Aluno aluno) {
        // Procura um aluno com o mesmo código para deletar ele antes que de 
        // adicionar novamente a lista para não duplicar os itens na lista
        Aluno alunoSalvo = procurarAluno(aluno.getCodigo());
        if (alunoSalvo != null) {
            del(alunoSalvo);
        }
        list.add(aluno);
    }

    public static void del(Aluno aluno) {
        list.remove(aluno);
    }

    public static Aluno procurarAluno(Integer codigo) {
        for (Aluno aluno : list) {
            if (aluno.getCodigo().equals(codigo)) {
                return aluno;
            }
        }
        return null;
    }

}
