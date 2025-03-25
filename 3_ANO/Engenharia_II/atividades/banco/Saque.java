
public class Saque {
    private CaixaEletronico caixaEletronico;
    private Autenticacao autenticacao;

    public Saque(CaixaEletronico caixaEletronico, Autenticacao autenticacao) {
        this.caixaEletronico = caixaEletronico;
        this.autenticacao = autenticacao;
    }

    public void realizarSaque(Cliente cliente, double valor) {
        if (!cliente.podeSacar(valor, true) || !cliente.podeSacar(valor, false)) {
            System.out.println("Limites insuficientes.");
            return;
        }

        if (!caixaEletronico.temNotasSuficientes(valor)) {
            System.out.println("Notas insuficientes no caixa eletrônico.");
            return;
        }

        if (!caixaEletronico.podeSacarComNotas(valor)) {
            System.out.println("Não é possível sacar este valor com as notas disponíveis.");
            return;
        }

        if (autenticacao.autenticar(cliente)) {
            cliente.atualizarSaldo(valor);
            cliente.atualizarLimites(valor, true);
            cliente.atualizarLimites(valor, false);
            caixaEletronico.processarSaque(valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Falha na autenticação. Tente novamente.");
        }
    }
}
