import java.util.List;

public class Aluno {
    private String codigo;
    private List<Double> notas;
    private double frequencia;

    public Aluno(String codigo, List<Double> notas, double frequencia) {
        this.codigo = codigo;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double getFrequencia() {
        return frequencia;
    }
}
