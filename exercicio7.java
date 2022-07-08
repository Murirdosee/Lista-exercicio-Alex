import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Atributos
            int horas;
            float valor;

            // Input
            System.out.print("Tempo de horas trabalhadas: ");
            horas = input.nextInt();

            // Cálculo
            valor = (float) (horas * 10.25);

            // Output
            System.out.println("Valor a ser ao funcionário pago Reais" + valor);

            if (valor < 50)
                System.out.println("Atenção, va à direção do Hotel!");
        }
    }
}