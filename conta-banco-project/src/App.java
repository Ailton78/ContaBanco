import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entiti.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the data to create your account.");
        System.out.print("Number Accont: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Agency number: ");
        String agencia = sc.nextLine();
        System.out.print("Name Client: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Balance: ");
        double saldo = sc.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);


        sc.close();
    }
}
