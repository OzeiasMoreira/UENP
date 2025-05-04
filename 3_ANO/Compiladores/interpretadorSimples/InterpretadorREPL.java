import java.util.*;

public class InterpretadorREPL {
    private static final Map<String, Double> variaveis = new HashMap<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Interpretador REPL em Java (digite 'sair' para encerrar)");

        while (true) {
            System.out.print(">>> ");
            String linha = entrada.nextLine().trim();

            if (linha.equalsIgnoreCase("sair")) break;

            try {
                if (linha.contains("=")) {
                    String[] partes = linha.split("=", 2);
                    String nome = partes[0].trim();
                    String expressao = partes[1].trim();
                    double resultado = avaliarExpressao(expressao);
                    variaveis.put(nome, resultado);
                    System.out.println(nome + " = " + resultado);
                } else if (variaveis.containsKey(linha)) {
                    System.out.println(linha + " = " + variaveis.get(linha));
                } else {
                    double resultado = avaliarExpressao(linha);
                    System.out.println(resultado);
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        entrada.close();
    }

    private static double avaliarExpressao(String expressao) throws Exception {
        List<String> tokens = tokenizar(expressao);
        List<String> posfixa = paraNotacaoPosfixa(tokens);
        return avaliarPosfixa(posfixa);
    }

    private static List<String> tokenizar(String expr) {
        List<String> tokens = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : expr.toCharArray()) {
            if (Character.isWhitespace(c)) continue;

            if (Character.isLetterOrDigit(c) || c == '.') {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    tokens.add(sb.toString());
                    sb = new StringBuilder();
                }
                tokens.add(Character.toString(c));
            }
        }
        if (sb.length() > 0) {
            tokens.add(sb.toString());
        }
        return tokens;
    }

    private static int prioridade(String op) {
        switch (op) {
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
        }
        return 0;
    }

    private static List<String> paraNotacaoPosfixa(List<String> tokens) {
        List<String> saida = new ArrayList<>();
        Stack<String> operadores = new Stack<>();

        for (String token : tokens) {
            if (token.matches("[a-zA-Z]\\w*")) {
                if (variaveis.containsKey(token)) {
                    saida.add(variaveis.get(token).toString());
                } else {
                    throw new RuntimeException("Variável não definida: " + token);
                }
            } else if (token.matches("\\d+(\\.\\d+)?")) {
                saida.add(token);
            } else if ("+-*/".contains(token)) {
                while (!operadores.isEmpty() && prioridade(operadores.peek()) >= prioridade(token)) {
                    saida.add(operadores.pop());
                }
                operadores.push(token);
            } else {
                throw new RuntimeException("Token inválido: " + token);
            }
        }

        while (!operadores.isEmpty()) {
            saida.add(operadores.pop());
        }

        return saida;
    }

    private static double avaliarPosfixa(List<String> tokens) {
        Stack<Double> pilha = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+(\\.\\d+)?")) {
                pilha.push(Double.parseDouble(token));
            } else if ("+-*/".contains(token)) {
                double b = pilha.pop();
                double a = pilha.pop();
                switch (token) {
                    case "+": pilha.push(a + b); break;
                    case "-": pilha.push(a - b); break;
                    case "*": pilha.push(a * b); break;
                    case "/": pilha.push(a / b); break;
                }
            }
        }

        return pilha.pop();
    }
}
