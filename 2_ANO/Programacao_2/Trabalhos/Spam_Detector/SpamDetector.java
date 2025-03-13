package spamdetector;

public class SpamDetector {

    public static final String[][] termos = {
        {"Gratis", "9"},
        {"Clique aqui", "10"},
        {"Oferta exclusiva", "8"},
        {"Dinheiro rapido", "9"},
        {"Vc ganhou!", "8"},
        {"Renegociação gratis", "9"},
        {"Fique rico rapido", "10"},
        {"Siga este link", "10"},
        {"Cupom gratis", "9"},
        {"100% garantido", "8"}
    };

    public static String calcularScore(String mensagem) {
        Integer score = 0;

        for (String[] termo : termos) { //p cada termo dentro de termos,executa o que esta dentro desse for
            String palavraChave = termo[0]; // Recebe a coluna 0,ex Gratis
            Integer peso = Integer.parseInt(termo[1]); // passa a coluna 1 para Inteiro
            
            //sera que na minha mensagem contem a palavra chave "Gratis"?
            if (mensagem.toLowerCase().contains(palavraChave.toLowerCase())) {
                score += peso;
            }
        }

        if (score >= 5 && score <= 30) {
            return "Fracamente suspeito " + score;
        } else if (score >= 31 && score <= 70) {
            return "Potencialmente suspeito " + score;
        } else if (score > 70) {
            return "Spam " + score;
        }

        return "Não é spam " + score;
    }

}
