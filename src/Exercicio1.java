import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Tem-se um conjunto de dados contendo a altura e o sexo
        //(masculino, feminino) de 10 pessoas. Fazer um algoritmo
        //que calcule e escreva:
        //a. a maior e a menor altura do grupo;
        //b. média de altura dos homens;
        //c. o número de mulheres.

        Scanner sc = new Scanner(System.in);

        double altura, peso, maiorAltura = 0, menorAltura = 9999, somaAlturaHomens = 0;
        int mulheres = 0, homens = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            altura = sc.nextDouble();

            System.out.print("Digite o sexo da pessoa (M/F) " + i + ": ");
            String sexo = sc.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo.equalsIgnoreCase("M")) {
                somaAlturaHomens += altura;
                homens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres++;
            }
        }

        double mediaAlturaHomens = somaAlturaHomens / homens;

        System.out.println("MAIOR E MENOR ALTURA");
        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("MEDIA DA ALTURA DOS HOMENS");
        System.out.println("Media da altura dos homens: " + mediaAlturaHomens);
        System.out.println("NUMERO DE MULHERES");
        System.out.println("Número de mulheres: " + mulheres);
    }
}

