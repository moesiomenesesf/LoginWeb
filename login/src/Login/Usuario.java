/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author aluno
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;
    
    public void setNome(String nome){
        this.nome= nome;
    }
    
    public String getNome(){
        return this.nome; 
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
         return this.login; 
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return this.senha; 
    }
}
