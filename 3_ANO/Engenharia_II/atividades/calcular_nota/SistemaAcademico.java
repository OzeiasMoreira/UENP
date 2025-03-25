import java.util.*;

public class SistemaAcademico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código da disciplina: ");
        String codDisciplina = scanner.next();

        System.out.print("A disciplina é anual? (true/false): ");
        boolean anual = scanner.nextBoolean();

        System.out.print("Número de avaliações: ");
        int numAvaliacoes = scanner.nextInt();
        List<Double> pesos = new ArrayList<>();
        for (int i = 0; i < numAvaliacoes; i++) {
            System.out.print("Peso da avaliação " + (i + 1) + ": ");
            pesos.add(scanner.nextDouble());
        }

        Disciplina disciplina = new Disciplina(codDisciplina, anual, pesos);

        System.out.print("Código do aluno: ");
        String codAluno = scanner.next();

        List<Double> notas = new ArrayList<>();
        for (int i = 0; i < numAvaliacoes; i++) {
            System.out.print("Nota da avaliação " + (i + 1) + ": ");
            notas.add(scanner.nextDouble());
        }

        System.out.print("Frequência do aluno (%): ");
        double frequencia = scanner.nextDouble();

        Aluno aluno = new Aluno(codAluno, notas, frequencia);

        System.out.println("Resultado final: " + CalculadoraNota.calcularNotaFinal(disciplina, aluno));
        scanner.close();
    }
}
