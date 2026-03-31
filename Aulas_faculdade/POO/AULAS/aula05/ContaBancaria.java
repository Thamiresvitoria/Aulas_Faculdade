package aula05;

public class ContaBancaria {

	private int idConta;
	private String agencia;
	private String numeroConta;
	private char tipo;
	private double saldo;
	private double limiteCredito;

	
	public ContaBancaria(int idConta, String agencia, String numeroConta, char tipo, double limiteCredito) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.limiteCredito = limiteCredito;			
	}

	public void registraDeposito(double valor) {
		this.saldo += valor;		
	}
	
	public boolean registraSaque(double valor) {			
		if (valor <= this.saldo + this.limiteCredito ){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	// método alterarLimite
	public boolean alterarLimite(double novoValorLimite) {
		
		// Só alterar o limite de crédito se a conta for do tipo Especial.
		// Se for informado um novo limite de crédito igual ou menor que 0, alterar o tipo da conta para normal.
		// Se a alteração foi realizada retornar true; senão, retornar false.
		if (tipo == 'E') {
				limiteCredito = novoValorLimite;
			if (limiteCredito >= 0 ) {
				tipo = 'N';
				return true;
			}
			}
			return false;
	}
	
	// Método alterarTipo
	
	public boolean alterarTipo(char novoTipo, double novoValorLimite) {
		
		//Só alterar o tipo da conta se o novo tipo for diferente do tipo atual da conta.
		//Se for alterado para o tipo Normal, alterar o limite de credito para 0 (zero).
		//Se for alterado para o tipo Especial, alterar o limite de crédito para o valor do novo limite de crédito.
		//Se a alteração foi realizada retornar true; senão, retornar false.
		
		if ( tipo != novoTipo) {
			this.tipo = novoTipo;
			if (tipo == 'N') {
				this.limiteCredito = 0;
			}
			if (tipo == 'E') {
				this.limiteCredito = novoValorLimite;
			}
			return true;
		}
	
		return false;
	}
	

		
	public int getIdConta() {
		return idConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	public char getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

}	