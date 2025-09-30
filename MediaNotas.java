import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

               System.out.print("Digite a 1ª nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        nota4 = scanner.nextDouble();

             media = (nota1 + nota2 + nota3 + nota4) / 4;

             System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
