/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Login {
    public static void main(String[] args) {
        UsuarioArquivo arquivo = new UsuarioArquivo();
        List<Usuario> user = arquivo.obterTodos();
        for(int i=0; i<user.size(); i++){
            System.out.println(user.get(i).getLogin());
        }
    }
}
