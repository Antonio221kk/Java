/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Registro{
       String textMarca;
       String textTipo;
       float textPreco;

    public Registro(String textMarca, String textTipo, float textPreco) {
        this.textMarca = textMarca;
        this.textTipo = textTipo;
        this.textPreco = textPreco;
    }
       
       public void Listar(){
           System.out.println("Digite a marca " + this.textMarca);
           System.out.println("Digite o tipo de Suplemento (Whey,Creatina,Pré Treino) " + this.textTipo);
           System.out.println("Digite o preço " + this.textPreco);
           
       }
}
