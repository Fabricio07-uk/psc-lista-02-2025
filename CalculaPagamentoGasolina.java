import java.util.Scanner;

public class CalculaPagamentoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o preço do litro da gasolina
        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoLitro = scanner.nextDouble();

        // Solicita a quantidade de litros vendidos
        System.out.print("Digite quantos litros foram vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        // Calcula o valor a pagar
        double valorAPagar = precoLitro * litrosVendidos;

        // Mostra o valor a pagar
        System.out.println("O cliente deverá pagar: R$ " + valorAPagar);

        scanner.close();
    }
}
