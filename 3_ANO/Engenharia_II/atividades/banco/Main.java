import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        Autenticacao autenticacao = new Autenticacao();
        CadastroCliente cadastroCliente = new CadastroCliente();
        Cliente cliente = null;

        while (true) {
            System.out.println("Bem-vindo ao Sistema de Caixa Eletrônico");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Realizar Saque");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastrar um novo cliente
                    cliente = cadastroCliente.cadastrarCliente();
                    break;
                case 2:
                    // Realizar saque
                    if (cliente == null) {
                        System.out.println("Você precisa cadastrar um cliente primeiro.");
                    } else {
                        System.out.print("Digite o valor que deseja sacar: ");
                        double valorSaque = scanner.nextDouble();
                        Saque saque = new Saque(caixaEletronico, autenticacao);
                        saque.realizarSaque(cliente, valorSaque);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
