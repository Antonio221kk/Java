/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescolarnovo;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{
    int matricula;
    String curso;
    double notaMedia;

    public Aluno(int matricula, String curso, double notaMedia, String nome, int idade, String endereco, String celular) {
        super(nome, idade, endereco, celular);
        this.matricula = matricula;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }
    
    public void calculaMedia(double notas){
    this.notaMedia = notas;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Celular: " + this.celular);
        System.out.println("Nota Média: " + this.notaMedia);
    }
        
}
