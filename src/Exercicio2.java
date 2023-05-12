import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Criar um programa que calcule a média de salários de uma
        //empresa, pedindo ao usuário a grade de funcionários e os
        //salários, e devolvendo a média salarial.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios da empresa: ");
        int numeroFuncionarios = sc.nextInt();

        double somaDosSalarios = 0;

        for (int i = 1; i <= numeroFuncionarios; i++){
            System.out.print("Por favor, digite o salario do funcionario " + i + ": " + "R$ ");
            double salario = sc.nextDouble();
            somaDosSalarios += salario;
        }

        double media = mediaSalarioDosFuncionarios(somaDosSalarios, numeroFuncionarios);

        System.out.println("A media salarial da empresa e: " + "R$ " + media );

    }

    public static double mediaSalarioDosFuncionarios(double somaSalario, int numeroFuncionario){
        return somaSalario / numeroFuncionario;
    }
}
