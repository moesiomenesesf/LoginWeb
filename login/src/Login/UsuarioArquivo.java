/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class UsuarioArquivo {
    public boolean inserir(String nome, String login, String senha) {
        if(!existeUsuario(login)){
            try {
                FileWriter fw;
                fw = new FileWriter("usuarios.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nome+";"+login+";"+senha);
                bw.newLine();
                bw.close();
                fw.close();
            } catch (Exception ex) {
                System.out.println("erro");
            }
        }
        return true;
    }
    public boolean alterar(String nome, String login, String senha) {
        return true;
    }
    public boolean remover(String login) {
        return true;
    }
    public Usuario obterUsuario(String login) {
        Usuario user = new Usuario();
        boolean exists = false;
        String usuario = "";
        try {
            FileReader fr = new FileReader("usuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                usuario = br.readLine();
                String[] tupla = usuario.split(";");
                if(tupla[1].equals(login)){
                    user.setNome(tupla[0]);
                    user.setLogin(tupla[1]);
                    user.setSenha(tupla[2]);
                    exists = true;
                }
                

            }
            if(!exists){
                System.out.println("Login não encontrado!");
            }
            br.close();
            fr.close();
        }catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return user;
    }
    public List<Usuario> obterTodos() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Usuario user = new Usuario();
        String usuario;
        try {
            FileReader fr = new FileReader("usuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                usuario = br.readLine();
                String[] tupla = usuario.split(";");
                user.setNome(tupla[0]);
                user.setLogin(tupla[1]);
                user.setSenha(tupla[2]);
                listaUsuarios.add(user);
                for(Usuario i : listaUsuarios){
                     System.out.println(i.getNome());
                }
            }
            br.close();
            fr.close();
        }catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return listaUsuarios;
    }
    
    public boolean existeUsuario(String login){
        String usuario = "";
        try {
            FileReader fr = new FileReader("usuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
             usuario = br.readLine();
             for(int i = 0; i<usuario.length(); i++){
                 String[] tupla = usuario.split(";");
                 if(tupla[1].equals(login)){
                     return true;
                 }
             }
             
            }
            br.close();
            fr.close();
        }catch (Exception ex) {
            return false;
        }
        
        return false;
    } 
}
