import java.util.InputMismatchException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        

        try{
            System.out.print("Digite um número inteiro: ");
            int numeroInteiro = scanner.nextInt();
            System.out.print("Digite outro número inteiro: ");
            int numeroInteiro2 = scanner.nextInt();
            System.out.println("divisão dos numeros: " + numeroInteiro / numeroInteiro2);
        }

        catch(InputMismatchException im){
            System.out.println("Erro!Insira numeros inteiros.");
        }

        catch(ArithmeticException a){
            System.out.println("Erro!não tente divisão por zero.");
        }
    }
}