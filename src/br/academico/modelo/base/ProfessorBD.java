package br.academico.modelo.base;

import br.academico.modelo.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorBD {

    private static List<Professor> list = new ArrayList();

    public static void add(Professor professor) {
        // Procura um professor com o mesmo código para deletar ele antes que de 
        // adicionar novamente a lista para não duplicar os itens na lista
        Professor professorSalvo = procurarProfessor(professor.getCodigo());
        if (professorSalvo != null) {
            del(professorSalvo);
        }
        list.add(professor);
    }

    public static void del(Professor professor) {
        list.remove(professor);
    }

    public static Professor procurarProfessor(Integer codigo) {
        for (Professor professor : list) {
            if (professor.getCodigo().equals(codigo)) {
                return professor;
            }
        }
        return null;
    }
}
