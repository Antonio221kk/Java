/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescolarnovo;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa{
    int codigoProfessor;
    String disciplina;
    double salario;

    public Professor(int codigoProfessor, String disciplina, double salario, String nome, int idade, String endereco, String celular) {
        super(nome, idade, endereco, celular);
        this.codigoProfessor = codigoProfessor;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    
    
    

        
        
        
    
    
    public void aumentaSalario(double percent){
    this.salario = this.salario * (1+(percent/100));
    }
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Código: " + this.codigoProfessor);
        System.out.println("Salário: " + this.salario);
    }
}
