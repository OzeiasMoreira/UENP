import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
    private List<Nota> notasDisponiveis;

    public CaixaEletronico() {
        notasDisponiveis = new ArrayList<>();
        // Exemplo de notas disponíveis no caixa eletrônico
        notasDisponiveis.add(new Nota(100, 10));
        notasDisponiveis.add(new Nota(50, 20));
        notasDisponiveis.add(new Nota(20, 30));
        notasDisponiveis.add(new Nota(10, 40));
    }

    public boolean temNotasSuficientes(double valor) {
        double totalDisponivel = 0;
        for (Nota nota : notasDisponiveis) {
            totalDisponivel += nota.getValor() * nota.getQuantidade();
        }
        return valor <= totalDisponivel;
    }

    public boolean podeSacarComNotas(double valor) {
        double valorRestante = valor;
        for (Nota nota : notasDisponiveis) {
            int quantidadeNotas = (int) (valorRestante / nota.getValor());
            if (quantidadeNotas > 0 && quantidadeNotas <= nota.getQuantidade()) {
                valorRestante -= quantidadeNotas * nota.getValor();
            }
        }
        return valorRestante == 0;
    }

    public void processarSaque(double valor) {
        for (Nota nota : notasDisponiveis) {
            while (valor >= nota.getValor() && nota.getQuantidade() > 0) {
                valor -= nota.getValor();
                nota.diminuirQuantidade();
            }
        }
    }
}
