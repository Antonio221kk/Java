/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentofuncionario;

/**
 *
 * @author aluno
 */
public class Departamento {
    private String nome;
    private String descricao;

    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void Listar(){
        System.out.println("Departamento " + this.nome);
        System.out.println("Descrição " + this.descricao);
    }
    
}
