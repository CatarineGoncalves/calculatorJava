import java.util.Scanner;

public class Calculadora {
    private Operacoes operacoes;

    public Calculadora() {
        operacoes = new Operacoes();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Escolha a operação: +, -, *, /");
            String operacao = scanner.nextLine();

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer

            switch (operacao) {
                case "+":
                    System.out.println("Resultado: " + operacoes.adicionar(num1, num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + operacoes.subtrair(num1, num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + operacoes.multiplicar(num1, num2));
                    break;
                case "/":
                    try {
                        System.out.println("Resultado: " + operacoes.dividir(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
    }
}
