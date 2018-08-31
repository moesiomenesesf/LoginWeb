/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Login {
    public static void main(String[] args) {
        UsuarioArquivo arquivo = new UsuarioArquivo();
        List<Usuario> userlist = new ArrayList();
        arquivo.inserir("Lucas Primo", "Tigrãoooo", "kaka é gente boa");
        userlist.addAll(arquivo.obterTodos());
        for(Usuario i : userlist){
            System.out.println(i.getLogin());
        }
    }
}
