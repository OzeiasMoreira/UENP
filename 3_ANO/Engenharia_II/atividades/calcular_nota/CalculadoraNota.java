import java.util.List;

public class CalculadoraNota {
    public static String calcularNotaFinal(Disciplina disciplina, Aluno aluno) {
        
        if (!disciplina.isAnual() && disciplina.getNumAvaliacoes() < 3) {
            return "Avaliações Insuficientes";
        }
      
        if (disciplina.isAnual() && disciplina.getNumAvaliacoes() < 4) {
            return "Avaliações Insuficientes";
        }

        if (aluno.getNotas().size() < disciplina.getNumAvaliacoes()) {
            return "Notas Insuficientes";
        }

        List<Double> notas = aluno.getNotas();
        if (notas.size() > disciplina.getNumAvaliacoes()) {
            notas = notas.subList(0, disciplina.getNumAvaliacoes()); 
        }

        double somaNotasPonderadas = 0;
        double somaPesos = 0;
        List<Double> pesos = disciplina.getPesos();

        for (int i = 0; i < disciplina.getNumAvaliacoes(); i++) {
            somaNotasPonderadas += notas.get(i) * pesos.get(i);
            somaPesos += pesos.get(i);
        }
        double mediaFinal = somaNotasPonderadas / somaPesos;

        if (aluno.getFrequencia() < 75) {
            return "Reprovado por Frequência";
        }

        if (mediaFinal >= 7) {
            return "Aprovado";
        } else if (mediaFinal >= 4) {
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
}
