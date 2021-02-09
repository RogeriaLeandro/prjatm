package br.edu.infnet.prjatm;

import java.util.Scanner;

public class Atm {
	/*
	 * fazer verificação de senha, feito isso, mostrar menu.
	 **/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//entrada - processamento - saída
		System.out.println("Bem-vindo!");
		System.out.print("Por favor, entre com seu número de conta:");
		String numeroConta = scan.nextLine();
		System.out.println("O número da conta informado foi: " + numeroConta);
		System.out.println("===================================");
		int senha = 12345;
		System.out.print("Por favor, digite sua senha: ");
		int senhaDigitada = scan.nextInt();
		
		if (numeroConta.equals("123") && (senha != senhaDigitada)) {
			
			double saldo = 0;
			int opcao = 0;
			
			while(opcao <= 3) {
								
				System.out.println("===========================");
				System.out.println("Menu");
				System.out.println("1 - Visualizar Saldo");
				System.out.println("2 - Saque");
				System.out.println("3 - Depósito");
				System.out.println("4 - Sair");
				System.out.println("===========================");
				System.out.println("Digite sua opção: ");
				
				opcao = scan.nextInt();
				
				switch(opcao){
					case 1:
						System.out.println("saldo");
						System.out.println("O saldo é: " + saldo);
						break;
						
					case 2:
						System.out.println("saque");
						System.out.println("Qual o valor do saque");
						double valorSaque = scan.nextDouble();
						
						if (valorSaque < saldo) {
							saldo -= valorSaque;
						}
						else {
							System.out.println("Saldo Insuficiente");
						}
						break;
						
					case 3:
						System.out.println("deposito");
						System.out.println("Qual o valor a ser depositado: ");
						double valorDepositado = scan.nextDouble();
						saldo += valorDepositado;
						System.out.println("O saldo é: " + saldo);
						break;
						
					case 4:
						System.out.println("sair");
						break;
						
					default:
						break;
						
				}
			}
		}
		
		scan.close();
	}
	
}
