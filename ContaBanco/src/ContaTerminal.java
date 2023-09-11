import java.util.Scanner;

public class ContaTerminal {
	public static void main (String []args){
		
		Scanner sc = new Scanner (System.in);
		int numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		System.out.println("*************CONTA BANCÁRIA****************");
		System.out.println();
		System.out.println("Digite o numero da sua conta:");
		numero= sc.nextInt();
		System.out.println("Digite numero da sua ageência:");
		agencia = sc.next();
		System.out.println("Informe seu nome: ");
		nomeCliente = sc.next();
		
		sc.nextLine();
		
		System.out.println("Digite seu saldo atual:");
		saldo = sc.nextDouble();
		System.out.println();
		System.out.printf("Olá,%s obrigado por criar uma conta em "
		+ " nosso banco, sua agência é %s, "
				+ "conta %s e seu saldo %.2f já está disponível"
		+  "  para saque.", nomeCliente, agencia,numero,saldo);
		
		
		sc.close();
	}
	
}
