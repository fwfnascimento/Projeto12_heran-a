/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario{
    
    private String setor;
    private String senha;

    public Gerente() {
    }

    public Gerente(String setor, String senha,
     String nome, double salario, String cpf) {
        // palavra reservada SUPER
        // this.nome = nome;
        //this.salario = salario;
        //this.cpf = cpf;
        super();
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //sobrecarga (override) permite o uso
    //do conceito de polimorfismo da orientaçao a objetos
    //usado para isto a anotação @Override
    @Override
    public String getInformacao(){
         return " Gerente : " + this.nome + "recebe" + this.salario;
   }
   
   @Override
    public double getBonificacao(){
       return this.salario *0.10;
   }
    
    public boolean getAutenticacao(String senha){
        if (this.senha.equals(senha)){
            System.out.println("Acesso permitido");
            return true;
        }
        else
        {
            System.out.println("Acesso Negado!");
            return false;
        }
    }  
    
    
    
}
