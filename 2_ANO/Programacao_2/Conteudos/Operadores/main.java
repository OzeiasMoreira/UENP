package ALURA.PARTE1.operadores;

public class main {
    public static void main(String[] args) {
        int valor = 5; // atribui valor 5 para a variavel valor;
        valor += 10;
        System.out.println(valor);

        int a = 10 + 5; //Atribui o valor 15 a variavel a;
        int b = 10 - 5; // Atribui o valor 5 a variavel b;
        int c = 10 / 2; // Atribui o valor 50 a variavel c;
        int d = 10 / 5; // Atribui o valor 2 a variavel d;
        int e = 10 % 3; //  Atribui o valor 1 variavel e(o resto da divisao 10 por 3 é 1);

        boolean igual = (b == a); //Nesse caso a variavel ficara com o valor false;
        boolean diferente = (b != c); // Nesse caso a variavel ficara com o valor false;
        boolean maior = (b > a); // Nesse caso a variavel ficara com o valor false;
        boolean maiorIgual = (b <= c); //Nesse caso a variavel ficara com o valor true; 

        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(maior);
        System.out.println(maiorIgual);
    }
     
}


