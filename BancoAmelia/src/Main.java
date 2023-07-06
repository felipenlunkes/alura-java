import br.com.lunx.bank.Opera;
import br.com.lunx.cliente.Cliente;
import br.com.lunx.input.Input;

import java.util.UUID;

public class Main {

    static Input input = new Input(); // Entrada de dados
    static Cliente cliente = new Cliente(); // Dados do cliente
    static Opera operacao = new Opera(); // Realiza as operações bancárias
    static int opcaoMenuBancario = 0;

    static double valorPix = 0;
    static double saldoAtual = 0;
    static double saldoNovo = 0;

    public static void main(String[] args) {

        System.out.println("Seja bem-vindo ao banco Amélia!");
        System.out.println("\nPara começar, você deve realizar um cadastro abaixo.");
        System.out.print("Insira seu nome: ");
        String nome = input.getString();
        System.out.print("Tipo de conta (corrente/poupança): ");
        String tipoConta = input.getString();
        System.out.print("Insira seu saldo: ");
        double saldo = input.getDouble();
        UUID codCliente = UUID.randomUUID();

        cliente.setNome(nome);
        cliente.setSaldo(saldo);
        cliente.setUUID(codCliente);
        cliente.setAtivo(true);
        cliente.setTipoConta(tipoConta);

        System.out.println("\nbr.com.lunx.cliente.Cliente cadastrado com sucesso!");

        System.out.println("\n***************************************\n");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Número da conta: " + cliente.getUUID());
        System.out.println("Saldo na conta: " + cliente.getSaldo());
        System.out.println("\n***************************************\n");

        menuBancario();

    }

    public static void menuBancario() {

        while (opcaoMenuBancario != 6) {

            System.out.println("Seja bem-vindo ao menu bancário. Veja abaixo as opções de movimentação:");

            System.out.println("1 - Exibir informações da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Realizar transferência via Pix");
            System.out.println("4 - Receber transferência via Pix");
            System.out.println("5 - Remover usuário");
            System.out.println("6 - Sair");

            opcaoMenuBancario = input.getInt();

            switch (opcaoMenuBancario){

                case 1:

                    System.out.println("\n***************************************\n");
                    System.out.println("Nome do cliente: " + cliente.getNome());
                    System.out.println("Número da conta: " + cliente.getUUID());
                    System.out.println("Saldo na conta: " + cliente.getSaldo());
                    System.out.println("\n***************************************\n");

                    break;

                case 2:

                    System.out.println("\nSaldo da conta: " + cliente.getSaldo() + "\n");

                    break;

                case 3:

                    System.out.print("\nInsira o valor desejado para transferir: ");

                    valorPix = input.getDouble();
                    saldoAtual = cliente.getSaldo();
                    saldoNovo= saldoAtual -valorPix;

                    if (!operacao.transferirPix(valorPix, saldoAtual)){

                        System.out.println("\nVocê não tem saldo suficiente para realizar essa operação!\n");

                    } else {

                        System.out.println("\nTransferência realizada com sucesso!\n");
                        cliente.setSaldo(saldoNovo);

                    }

                    break;

                case 4:

                    System.out.print("\nVocê receberá quanto via Pix? ");

                    double valorRecebimento = input.getDouble();
                    saldoAtual = cliente.getSaldo();
                    saldoNovo= saldoAtual +valorPix;

                    operacao.receberPix(valorRecebimento, saldoAtual);

                    cliente.setSaldo(saldoNovo);

                    break;

                case 5:

                    break;

                case 6:

                    break;

                default:

                    System.out.println("\nOpção inválida!");
                    break;

            }

        }
    }

}
