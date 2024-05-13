package br.com.dio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cliente, por favor, digite o seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o nome da agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        int numero = sc.nextInt();

        System.out.println("Por favor, informe o valor a depositar:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "Sua agência é " + agencia + ", conta " + numero + ", e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}