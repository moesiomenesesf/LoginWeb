/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Login {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        UsuarioArquivo arquivo = new UsuarioArquivo();
        List<Usuario> listaDeUsuarios = new ArrayList();
        
//INSERIR USUARIO

//      arquivo.inserir("Ana Mendes", "ana.mendes", "anamendes1998");
          
//REMOVER USUARIO

//      arquivo.remover("ana.mendes");

//ALTERAR USUARIO

//      arquivo.alterar("Ana Teixeira Mendes", "ana.mendes", "anamendes1998");

//OBTER USUARIO

//      usuario = arquivo.obterUsuario("ana.mendes");
//      System.out.println("Nome: "+usuario.getNome()+"\nLogin: "+usuario.getLogin()+"\nSenha: "+usuario.getSenha()+"\n");
      
//OBTER TODOS OS USUARIOS

        listaDeUsuarios = arquivo.obterTodos();
        for(Usuario aux: listaDeUsuarios){
                        System.out.println("Nome: "+aux.getNome()+"\nLogin: "+aux.getLogin()+"\nSenha: "+aux.getSenha()+"\n");
        }
    }
}
