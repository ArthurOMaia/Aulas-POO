/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.empresa;

/**
 *
 * @author IC
 */
public class Gerente extends Funcionario{
   protected String departamento;

    public Gerente(String departamento, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }
    
   @Override
   public void exibirInformacoes(){
       System.out.println("Nome: " + nome + " Idade: " + idade + " Departamento: " + departamento + " apiS1alario: " + salario);
   }
   
}
