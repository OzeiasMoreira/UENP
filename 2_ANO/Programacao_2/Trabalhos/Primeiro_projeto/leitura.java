package ALURA.PARTE1.primeiroprojeto;

import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Como vc se chama?"); 
        String time = leitura.nextLine();
        System.out.println("Qual sua idade?");
        int idade = leitura.nextInt();
        System.out.println("Qual sua altura?");
        double altura = leitura.nextDouble();

        System.out.println(time);
        System.out.println(idade);
        System.out.println(altura);
    }
}
