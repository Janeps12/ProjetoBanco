package ProjetoBanco;

import java.util.Scanner;

public class Conta {

        private String nome;
        private String CPF;
        private int conta, saques;
        private double saldo;
        Scanner entrada = new Scanner(System.in);

        public Conta(String nome, String CPF, int conta, double saldo_inicial){
            this.nome=nome;
            this.CPF=CPF;
            this.conta=conta;
            saldo=saldo_inicial;
            saques=0;
        }

        public void extrato(){

            System.out.println("-----------------------------------------");
            System.out.println("=============== Banco ABC ===============");
            System.out.println("-----------------------------------------");
            System.out.println("************ Extrato Conta **************");
            System.out.println("-----------------------------------------");
            System.out.println("Nome:                    " + this.nome);
            System.out.println("CPF:                    " + this.CPF);
            System.out.println("Número da conta:         " + this.conta);
            System.out.printf("Saldo atual:             %.2f \n", this.saldo);
            System.out.println("Saques realizados hoje:  " + this.saques + "\n");


        }

        public void sacar(double valor){
            if(saldo >= valor){
                saldo -= valor;
                saques++;
                System.out.println("-----------------------------------------");
                System.out.println("=============== Banco ABC ===============");
                System.out.println("-----------------------------------------");
                System.out.println("********* Comprovante de Saque ***********");
                System.out.println("-----------------------------------------");
                System.out.println("Valor Sacado:    " + valor + "\n");
                System.out.println("Saque realizado com sucesso! \n");
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("=============== Banco ABC ===============");
                System.out.println("-----------------------------------------");
                System.out.println("*************** Mensagem ****************\n");
                System.out.println("Saldo insuficiente. Faça um depósito! \n");

            }
        }

        public void depositar(double valor)
        {
            saldo += valor;
            System.out.println("-----------------------------------------");
            System.out.println("=============== Banco ABC ===============");
            System.out.println("-----------------------------------------");
            System.out.println("******* Comprovante de Deposito *********");
            System.out.println("-----------------------------------------");
            System.out.println("Valor Depositado: " + valor + "\n");
            System.out.println("Deposito realizado com sucesso! \n");

        }

        public void iniciar(){
            int opcao;

            do{
                exibeMenu();
                opcao = entrada.nextInt();
                escolheOpcao(opcao);
            }while(opcao!=4);
        }

        public void exibeMenu(){

            System.out.println("-----------------------------------------");
            System.out.println("=============== Banco ABC ===============");
            System.out.println("-----------------------------------------");
            System.out.println("******** Escolha a opção desejada *******");
            System.out.println("-----------------------------------------");
            System.out.println("   |   1 - Consultar Extrato     |");
            System.out.println("   |   2 - Sacar                 |");
            System.out.println("   |   3 - Depositar             |");
            System.out.println("   |   4 - Sair                  |");
            System.out.println("-----------------------------------------");
            System.out.print("Digite sua Opção: \n");

        }

        public void escolheOpcao(int opcao){
            double valor;

            switch( opcao ){
                case 1:
                    extrato();
                    break;
                case 2:
                    if(saques<3){
                        System.out.println("-----------------------------------------");
                        System.out.println("=============== Banco ABC ===============");
                        System.out.println("-----------------------------------------");
                        System.out.println("Quanto deseja sacar: \n");


                        valor = entrada.nextDouble();
                        sacar(valor);
                    } else{
                        System.out.println("-----------------------------------------");
                        System.out.println("=============== Banco ABC ===============");
                        System.out.println("-----------------------------------------");
                        System.out.println("*************** Mensagem ****************\n");
                        System.out.println("Limite de saques diários atingidos!\n");
                    }
                    break;

                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.println("=============== Banco ABC ===============");
                    System.out.println("-----------------------------------------");
                    System.out.println("Quanto deseja depositar: \n");


                    valor = entrada.nextDouble();
                    depositar(valor);

                    break;

                case 4:
                    System.out.println("-----------------------------------------");
                    System.out.println("=============== Banco ABC ===============");
                    System.out.println("-----------------------------------------");
                    System.out.println("*************** Mensagem ****************\n");
                    System.out.println("Agradecemos sua preferencia!" );
                    System.out.println("Volte Sempre!" );


                    break;

                default:
                    System.out.println("-----------------------------------------");
                    System.out.println("=============== Banco ABC ===============");
                    System.out.println("-----------------------------------------");
                    System.out.println("*************** Mensagem ****************\n");
                    System.out.println("Opção inválida!\n");

            }
        }
    }


