public class Exercicio5 {
    public static void main(String[] args) {
        //5. Crie um programa para exibir todos os inteiros dentro do
        //intervalo 100-150 cuja soma de todos os dígitos é um
        //número par.

        for (int i = 100; i <= 150; i++) {
            int numero = i;
            int somaDigitos = 0;
            while (numero > 0) {
                somaDigitos += numero % 10;
                numero /= 10;
            }
            if (somaDigitos % 2 == 0) {
                System.out.println(i + " tem soma de dígitos par.");
            }
        }
    }
}
