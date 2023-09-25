/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciamentofuncionario;

/**
 *
 * @author aluno
 */
public class GerenciamentoFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Departamento d1 = new Departamento("Ensino","Tecnico Medio");
        Funcionario f1 = new Funcionario(1,  2000.00,  d1, "Antônio", 20,  "Butiá");
        f1.Listar();
        
        
        
        
        
        
    }
    
}
