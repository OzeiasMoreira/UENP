public class Nota {
    private double valor;
    private int quantidade;

    public Nota(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void diminuirQuantidade() {
        if (quantidade > 0) {
            quantidade--;
        }
    }
}
