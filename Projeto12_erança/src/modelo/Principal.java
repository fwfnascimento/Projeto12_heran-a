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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("joao");
        objFunc01.setSalario(500);
        objFunc01.setCpf("111.222.333.44");
        System.out.println("Func01: "+objFunc01.getNome());
        
        
        Gerente objGer01 = new Gerente();
        objGer01.setNome("Maria");
        objGer01.setSalario(600);
        objGer01.setCpf("22233");
        objGer01.setSetor("ADM");
        objGer01.setSenha("123456");
        System.out.println("Ger01:"+objGer01.getNome());
        System.out.println(objGer01.getInformacao());
        objGer01.getAutenticacao("122333");
        
        Funcionario objFunc02 = new Gerente();
        //Casting entre objetos (classe)
        //da mesma forma que vimos em tipos primitivos
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuição entre objetos
        //usando o casting
        //objFunc02 = objGer02;
        //objGer02 = (Gerente)objFunc02;
        
        
    }
    
}
