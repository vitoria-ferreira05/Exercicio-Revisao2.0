public class Exercicio6 {
    public static void main(String[] args) {
        //6. Crie um programa para exibir a soma de 20 números
        //usando uma matriz.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18},
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27},
                {28, 29, 30}
        };

        int somaDosNumeros = 0;

        for (int i = 0; i <= matriz.length; i++) {
            for (int l = 0; l < matriz[i].length; l++) {
                somaDosNumeros += matriz[i][l];
            }
        }
        System.out.println("A soma dos numeros e: " + matriz);
    }
}
