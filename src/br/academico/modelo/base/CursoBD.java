package br.academico.modelo.base;

import br.academico.modelo.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoBD {

    private static List<Curso> list = new ArrayList<Curso>();

    public static void add(Curso curso) {
        // Procura um curso com o mesmo código para deletar ele antes que de 
        // adicionar novamente a lista para não duplicar os itens na lista
        Curso cursoSalvo = procurarCurso(curso.getCodigo());
        if (cursoSalvo != null) {
            del(cursoSalvo);
        }
        list.add(curso);
    }

    public static void del(Curso curso) {
        list.remove(curso);
    }

    public static Curso procurarCurso(Integer codigo) {
        for (Curso cursoItem : list) {
            if (cursoItem.getCodigo().equals(codigo)) {
                return cursoItem;
            }
        }
        return null;
    }
}
