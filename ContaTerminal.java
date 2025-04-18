package dev.pietro.projetos.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Executa o restante do código por meio do método principal
        getValues();
    }
    public static void getValues() {
        // Inicia o scanner para capturar a entrada do usuário
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o número da sua conta: ");
            int number = input.nextInt();
            
            System.out.print("Digite a agência do banco: ");
            String agency = input.next();

            System.out.print("Qual o seu nome? ");
            // Lê a linha com o nome completo
            input.nextLine();
            String clientName = input.nextLine();

            System.out.print("Qual seu saldo? ");
            double balance = input.nextDouble();
            // Envia os dados recebidos para a "função" printMessage()
            printMessage(number, agency, clientName, balance);    
        }
    }
    public static void printMessage(int account, String bankAgency, String client, double accountBalance)  {
        // Imprime a informação completa na tela
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", client, bankAgency, account, accountBalance);
    }
}
