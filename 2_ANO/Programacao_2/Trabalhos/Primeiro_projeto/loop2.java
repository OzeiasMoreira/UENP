package ALURA.PARTE1.primeiroprojeto;

import java.util.Scanner;

public class loop2{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Insira sua avaliação(-1 para encerrar): ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
            
        }
        
        System.out.println("A media é: " + media / totalNotas);
    }
}
