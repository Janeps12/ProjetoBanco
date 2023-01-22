package ProjetoBanco;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome;
        String CPF;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        System.out.println("-----------------------------------------");
        System.out.println("=============== Banco ABC ===============");
        System.out.println("-----------------------------------------");
        System.out.print("Informe seu Nome: ");
        nome = entrada.next();
        System.out.print("Informe seu CPF: ");
        CPF = entrada.next();
        System.out.print("Valor a ser depositado na conta: ");
        inicial = entrada.nextDouble();


        Conta minhaConta = new Conta(nome, CPF, conta, inicial);
        minhaConta.iniciar();
    }
}

