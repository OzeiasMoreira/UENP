package spamdetector;

public class Main {

    public static void main(String[] args) {

        LeitorArquivo leitorArquivo = new LeitorArquivo();
        String mensagem = leitorArquivo.lerArquivo
        ("C:\\Users\\Ozeias\\Documents\\PROG2\\JAVA\\UENP\\spamdetector\\texto.txt");
        System.out.println(SpamDetector.calcularScore(mensagem));

    }
}
