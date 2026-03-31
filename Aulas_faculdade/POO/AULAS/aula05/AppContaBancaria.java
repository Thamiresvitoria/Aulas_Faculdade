package aula05;

import java.util.Iterator;

public class AppContaBancaria {

	public static void main(String[] args) {
		
		//Criando o Array com 4 espaço.
		ContaBancaria[] contaBancaria = new ContaBancaria[4];
		
		// criando e instanciando
		ContaBancaria cb1 = new ContaBancaria(001, "Picpay", "Um", 'N', 1000);
		ContaBancaria cb2 = new ContaBancaria(002, "Nubamk", "Vinte", 'E', 3000);
		
		// botando as conta no array
		contaBancaria[0] = cb1;
		contaBancaria[1] = cb2;
		
		// Depositando na conta Normal, primeira conta.
		cb1.registraDeposito(1000.00);
		cb1.registraDeposito(2000.00);
		
		// Saque na conta Normal, primeira conta.
		cb1.registraSaque(1800.00);
		
		
		// Depositando na conta Especial, segunda conta.
		cb2.registraDeposito(5000.00);
		
		
		for (int i = 0; i < contaBancaria.length; i++) {
			if (contaBancaria[i] != null) {
				mostrarDadosConta(contaBancaria[i]);
				

			}
			
		}
	}
	
	
	public static void mostrarDadosConta(ContaBancaria contaBancaria) {
		System.out.println();
		System.out.println("================ DADOS DA CONTA BANCARIA ================");
		System.out.println("\tIdentificação..: " + contaBancaria.getIdConta());
		System.out.println("\tAgencia........: " + contaBancaria.getAgencia());
		System.out.println("\tNúmero da conta: " + contaBancaria.getNumeroConta());
		System.out.println("\tTipo da conta..: " + (contaBancaria.getTipo()== 'N' ? "Normal" : "Especial"));
		System.out.println("\tSaldo..........: " + contaBancaria.getSaldo());
		System.out.println("\tLimite.........: " + contaBancaria.getLimiteCredito());
		System.out.println("=========================================================");
	}

}
