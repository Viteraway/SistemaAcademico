package br.academico.modelo.base;

import br.academico.modelo.Materia;
import java.util.ArrayList;
import java.util.List;

public class MateriaBD {

    private static List<Materia> list = new ArrayList();

    public static void add(Materia materia) {
        // Procura uma materia com o mesmo código para deletar ele antes que de 
        // adicionar novamente a lista para não duplicar os itens na lista
        Materia materiaSalva = procurarMateria(materia.getCodigo());
        if (materiaSalva != null) {
            del(materiaSalva);
        }
        list.add(materia);
    }

    public static void del(Materia materia) {
        list.remove(materia);
    }

    public static Materia procurarMateria(Integer codigo) {
        for (Materia materia : list) {
            if (materia.getCodigo().equals(codigo)) {
                return materia;
            }
        }
        return null;
    }
}
