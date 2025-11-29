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

            if (imc <18.5) {
                System.out.println("Classificação: Abaixo do peso");
            } else if (imc < 24.9) {
                System.out.println("Classificação: Peso normal");
            } else if (imc < 29.9) {
                System.out.println("Classificação: Sobrepeso");
            } else if(imc < 34.9) {
                System.out.println("Classificação: Obesidade leve");
            } else if (imc >= 39.99) {
                System.out.println("Classificação: Obesidade grave");
            }
            

        }
    }

}