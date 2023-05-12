import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Crie um programa para verificar se o inteiro fornecido é um
        //múltiplo de 5 e 7.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 5 == 0 && numero % 7 == 0 ){
            System.out.println(numero + " e multiplo de 5 e de 7");
        }else {
            System.out.println(numero + " nao e multiplo de 5 e de 7");
        }
    }
}
