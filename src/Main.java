import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class CalculadoraIMC {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Entrada de dados
            System.out.print("Digite seu peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Digite sua altura (m): ");
            double altura = sc.nextDouble();

            // Cálculo do IMC
            double imc = peso / (altura * altura);

            // Exibição do resultado
            System.out.printf("Seu IMC é: %.2f%n", imc);
            

        }
    }

}