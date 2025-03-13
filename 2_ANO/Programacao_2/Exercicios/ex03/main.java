/*
Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
Atribua valores a essas variáveis e concatene-as em uma mensagem. 

 */

package ALURA.PARTE1.exercicios.ex03;

public class main {
    public static void main(String[] args) {
        
        char letra = 'O';
        String palavra = "zeias";
        String mensagem = "A letra é: " + letra + " e a palavra é: " + palavra;
        System.out.println(mensagem);
        String MensagemFinal = (letra + palavra);
        System.out.println(MensagemFinal);
    }
}
