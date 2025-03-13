/*
 * Crie um programa que simula um jogo de adivinhação, 
 * que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
 * em até 5 tentativas. A cada tentativa, 
 * o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
 */

package ALURA.PARTE1.exercicios.ex04;

import java.util.Scanner;

public class advinhar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroPremiado = 74;

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente acertar o numero premiado(0 a 100) em 5 tentativas: ");
            int numero = leitura.nextInt();
            if (numero == numeroPremiado) {
                System.out.println("Parabens!Vc acertou o numero!");
            } 
            else{

                System.out.println("Ops...tente outra vez.");
            }

        }

    }

}

