import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Crie um programa para exibir o inteiro fornecido pelo
        //usuário na ordem inversa.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int numeroInverso = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroInverso = numeroInverso * 10 + digito;
            numero /= 10;
        }

        System.out.println("O número inverso é: " + numeroInverso);
    }
}
