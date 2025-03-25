import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    public Cliente cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o limite diário do cliente: ");
        double limiteDiario = scanner.nextDouble();

        System.out.print("Digite o limite semanal do cliente: ");
        double limiteSemanal = scanner.nextDouble();

        System.out.print("Digite o limite horário do cliente: ");
        double limiteHorario = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        System.out.println("Deseja cadastrar valores favoritos? (sim/não)");
        String resposta = scanner.nextLine();

        List<Double> valoresFavoritos = new ArrayList<>();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite os valores favoritos (digite 'fim' para encerrar): ");
            while (true) {
                String valorInput = scanner.nextLine();
                if (valorInput.equalsIgnoreCase("fim")) {
                    break;
                }
                try {
                    double valor = Double.parseDouble(valorInput);
                    valoresFavoritos.add(valor);
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Tente novamente.");
                }
            }
        }

        Cliente cliente = new Cliente(nome, saldo, limiteDiario, limiteSemanal, limiteHorario);
        cliente.setValoresFavoritos(valoresFavoritos);

        System.out.println("Cliente cadastrado com sucesso!");
        return cliente;
    }
}
