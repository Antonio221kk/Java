/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescolarnovo;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa{
    int codigoFunc;
    String cargo;
    double salario;

    public Funcionario(int codigoFunc, String cargo, double salario, String nome, int idade, String endereco, String celular) {
        super(nome, idade, endereco, celular);
        this.codigoFunc = codigoFunc;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void aumentaSalario(double percent){
    this.salario = this.salario * (1+(percent/100));
    }
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Código: " + this.codigoFunc);
        System.out.println("Salário: " + this.salario);
        System.out.println("Celular: " + this.celular);
    }
}
