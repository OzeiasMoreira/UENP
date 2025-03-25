import java.util.Scanner;

public class Autenticacao {
    public boolean autenticar(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Digite a senha para autenticação: ");
            String senha = scanner.nextLine();
            if (senha.equals("1234")) {
                return true;
            }
            tentativas++;
            System.out.println("Senha incorreta. Tentativas restantes: " + (3 - tentativas));
        }
        System.out.println("Número de tentativas excedido. Acesso bloqueado.");
        return false;
    }
}
