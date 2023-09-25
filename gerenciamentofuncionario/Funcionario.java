/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentofuncionario;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa{ //herança
    //encapsulamento
        private int id;
        private double salario;
        private Departamento departamento; //composição

    public Funcionario(int id, double salario, Departamento departamento, String nome, int idade, String endereco) {
        super(nome, idade, endereco); //herança
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    
    //metodos para acessar os privates
    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    public void Listar(){
        System.out.println("ID Funcionario " + this.id);
        System.out.println("Salário Funcionario " + this.salario);
       // System.out.println("Departamento " + this.departamento.nome); erro, nome é PRIVATE no departamento, isso faz parte do encapsulamento.
        this.departamento.Listar(); //chamada do metodo listar no departamento pois os atributos estão PRIVATE, somente com este metodo você pode chamar eles.
        
       
       
    } 

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    
     
        
}
