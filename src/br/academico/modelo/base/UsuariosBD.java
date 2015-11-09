package br.academico.modelo.base;

import br.academico.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuariosBD {

    private static List<Usuario> list = new ArrayList();

    public static void add(Usuario usuario) {
        list.add(usuario);
    }

    public static void del(Usuario usuario) {
        list.remove(usuario);
    }

    public static boolean login(String login, String senha) {
        for (Usuario usuario : list) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

}
