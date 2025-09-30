import java.util.Scanner;

public class Eurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os preços e a quantidade de pessoas para cada destino
        System.out.println("Destino 1: Alemanha");
        System.out.print("Preço da viagem para Alemanha: R$ ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Quantidade de pessoas indo para Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.println("\nDestino 2: Portugal");
        System.out.print("Preço da viagem para Portugal: R$ ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Quantidade de pessoas indo para Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        System.out.println("\nDestino 3: Itália");
        System.out.print("Preço da viagem para Itália: R$ ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Quantidade de pessoas indo para Itália: ");
        int pessoasItalia = scanner.nextInt();

        // Calcula o valor total de cada destino
        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        // Calcula o valor total de todas as viagens e a quantidade total de pessoas
        double valorTotalViagem = totalAlemanha + totalPortugal + totalItalia;
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        // Exibe os resultados
        System.out.println("\nQuantidade total de pessoas que irão viajar: " + totalPessoas);
        System.out.println("Valor total de todas as viagens: R$ " + valorTotalViagem);

        scanner.close();
    }
}
