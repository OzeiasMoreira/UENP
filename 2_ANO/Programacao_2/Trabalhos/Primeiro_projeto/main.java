package ALURA.PARTE1.primeiroprojeto;

public class main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match:");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com personagem dos anos 80.";
        System.out.println(sinopse);

        int classificação;
        classificação = (int) (media / 2);
        System.out.println(classificação);
    }

}
