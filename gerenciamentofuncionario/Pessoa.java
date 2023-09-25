/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentofuncionario;

/**
 *
 * @author aluno
 */
public class Pessoa {
    String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = VerificaIdade(idade);
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = VerificaIdade(idade);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
  private int VerificaIdade(int idade){  
      if(idade < 15 || idade > 20){
          System.out.println("Idade invalida " + idade);
          return 0;
      }else{
          return idade;
      }
      
  }
    
}
