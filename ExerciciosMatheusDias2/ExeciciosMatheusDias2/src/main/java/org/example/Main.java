package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //entrada de dados
        Scanner sc = new Scanner(System.in);
        //sistema de menu de escolha de exercícios, caso 1-4 executo o método do exercício, caso 0 fecha o programa
        int exercicioSelecionado = -1;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha o o exercício(1-5) ou 0 para sair");
            exercicioSelecionado = sc.nextInt();
            switch (exercicioSelecionado) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 0:
                    continuar = false;
                    sc.close();
                    break;
            }
        }

    }

    // Exercicio 1: Soma de números positivos
    public static void exercicio1() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);
        int numeroUsuario = 0;
        while (numeroSorteado != numeroUsuario) {
            System.out.println("Escolha um numero entre 0 e 100");
            numeroUsuario = sc.nextInt();
            if (numeroSorteado < numeroUsuario) {
                System.out.println("Número maior que o sorteado");
            } else if (numeroSorteado > numeroUsuario) {
                System.out.println("Número menor que o sorteado");
            } else {
                System.out.println("Adivinhou!!!");
                break;
            }
        }


    }

    // Exercicio 2: Verificação de senha
    public static void exercicio2() {
        // Scanner para leitura de entradas do usuário
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um núemro");
        int numeroUsuario = sc.nextInt();
        int total = 0;
        while (numeroUsuario != 0) {
            total += numeroUsuario;
            numeroUsuario--;
        }

        System.out.println("A soma de todos os números abaixo desse até 1 é : " + total);
    }

    // Exercicio 3: Contagem regressiva de um número até 0
    public static void exercicio3() {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = 0;
        int total = 0;
        while (true) {
            System.out.println("Digite um número(Negativo fecha)");
            numeroUsuario = sc.nextInt();
            if (numeroUsuario >= 0) {
                total += numeroUsuario;
            } else {
                break;
            }
        }

        System.out.println("O total é: " + total);

    }

    // Exercicio 4: Cálculo da média de notas válidas
    public static void exercicio4() {
        // Scanner para leitura de entradas do usuário
        Scanner sc = new Scanner(System.in);
        int horasTrabalhadas = 0;
        int horasTotais = 0;
        while (true) {
            System.out.println("Digite o número de horas trabalhadas(0 para sair): ");
            horasTrabalhadas = sc.nextInt();
            if (horasTrabalhadas == 0) {
                break;
            }
            horasTotais += horasTrabalhadas;
        }
        System.out.println("O número total de horas trabalhadas são: " + horasTotais);
    }

    public static void exercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de produtos em estoque");
        int estoque = sc.nextInt();
        int vendas = 0;
        while (estoque > 0) {
            System.out.println("Digite o número de vendas: ");
            vendas = sc.nextInt();
            estoque -= vendas;
        }

        System.out.println("Estoque vazio");
    }
}
