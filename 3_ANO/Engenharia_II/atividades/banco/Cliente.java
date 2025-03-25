import java.util.List;

public class Cliente {
    private String nome;
    private double saldo;
    private double limiteDiario;
    private double limiteSemanal;
    private double limiteHorario;
    private List<Double> valoresFavoritos;
    private double totalSacadoSemanal;

    public Cliente(String nome, double saldo, double limiteDiario, double limiteSemanal, double limiteHorario) {
        this.nome = nome;
        this.saldo = saldo;
        this.limiteDiario = limiteDiario;
        this.limiteSemanal = limiteSemanal;
        this.limiteHorario = limiteHorario;
        this.totalSacadoSemanal = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void atualizarSaldo(double valor) {
        this.saldo -= valor;
    }

    public void atualizarLimites(double valor, boolean isDiario) {
        if (isDiario) {
            this.limiteDiario -= valor;
        } else {
            this.limiteSemanal -= valor;
            this.totalSacadoSemanal += valor;
        }
    }

    public boolean podeSacar(double valor, boolean isDiario) {
        if (isDiario) {
            return valor <= limiteDiario;
        }
        return valor <= limiteSemanal;
    }

    public boolean podeSacarHorario(double valor) {
        return valor <= limiteHorario;
    }

    public List<Double> getValoresFavoritos() {
        return valoresFavoritos;
    }

    public void setValoresFavoritos(List<Double> valoresFavoritos) {
        this.valoresFavoritos = valoresFavoritos;
    }

    public double getTotalSacadoSemanal() {
        return totalSacadoSemanal;
    }
}
