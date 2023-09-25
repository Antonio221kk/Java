/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaescolarnovo;
import java.util.*;
/**
 *
 * @author aluno
 */
public class SistemaEscolarnovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner ScanString = new Scanner (System.in);
        Scanner ScanInt = new Scanner (System.in);
        Scanner ScanDouble = new Scanner (System.in);
        
        System.out.println("Digite o nome do professor: ");
        String nome = ScanString.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = ScanInt.nextInt();
        
        System.out.println("Digite sua disciplina: ");
        String disciplina = ScanString.nextLine();
        
        System.out.println("Digite sua endereco: ");
        String endereco = ScanString.nextLine();
        
        System.out.println("Digite o codigo do professor: ");
        int codigoProfessor = ScanInt.nextInt();
        
        System.out.println("Digite o salario: ");
        double salario = ScanDouble.nextDouble();
        
        System.out.println("Digite o Celular do professor: ");
        String celular = ScanString.nextLine();
        
        Professor p1 = new Professor(codigoProfessor, disciplina,  salario, nome, idade,  endereco,  celular);
        
        p1.exibirInfo();
        
        
        System.out.println("Digite o nome do aluno: ");
        nome = ScanString.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = ScanInt.nextInt();
        
        
        System.out.println("Digite sua endereco: ");
         endereco = ScanString.nextLine();
        
        System.out.println("Digite a matricula: ");
        int matricula = ScanInt.nextInt();
        
        System.out.println("Digite o seu curso: ");
        String curso = ScanString.nextLine();
        
        System.out.println("Digite o nota Média: ");
        double notaMedia = ScanDouble.nextDouble();
        
        System.out.println("Digite o celular: ");
        celular = ScanString.nextLine();
      
        Aluno a1 = new Aluno(matricula, curso,  notaMedia, nome, idade,  endereco,  celular);
        
        a1.exibirInfo();
        
        System.out.println("Digite o nome do funcionario: ");
        nome = ScanString.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = ScanInt.nextInt();
        
        
        System.out.println("Digite sua endereco: ");
         endereco = ScanString.nextLine();
        
        System.out.println("Digite o codigo: ");
        int codigoFunc = ScanInt.nextInt();
        
        System.out.println("Digite o seu cargo: ");
        String cargo = ScanString.nextLine();
        
        System.out.println("Digite o salário: ");
        salario = ScanDouble.nextDouble();
        
        System.out.println("Digite seu celular");
        celular = ScanString.nextLine();
        
      
        Funcionario f1 = new Funcionario(codigoFunc, cargo, salario, nome, idade,  endereco,celular);
        
        f1.exibirInfo();
        
        
    }
    
    
   
    
}
