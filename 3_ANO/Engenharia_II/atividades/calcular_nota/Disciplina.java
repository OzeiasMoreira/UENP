import java.util.List;

public class Disciplina {
    private String codigo;
    private boolean anual;
    private List<Double> pesos;

    public Disciplina(String codigo, boolean anual, List<Double> pesos) {
        this.codigo = codigo;
        this.anual = anual;
        this.pesos = pesos;
    }

    public boolean isAnual() {
        return anual;
    }

    public int getNumAvaliacoes() {
        return pesos.size();
    }

    public List<Double> getPesos() {
        return pesos;
    }
}