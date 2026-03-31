package aula04;

public class ControleTelevisao {

	private int idControle;
	private String modelo;
	private int canalAtual;
	private boolean ligado;
	
	public ControleTelevisao (int idControle, String modelo) {
		this.idControle = idControle; 
		this.modelo = modelo; 
	}
	
	public boolean ligarDesligar () {
		ligado = !ligado;
		
		if (ligado) {
			canalAtual = 1;  
		}
		return ligado; 
	}
	
	public int avancaCanal() {
	    if (ligado) {
	        canalAtual++;

	        if (canalAtual > 5) {
	            canalAtual = 1;
	        }
	    }
	    return canalAtual;
	}

	public int retornaCanal() {
	    if (ligado) {
	        canalAtual--;

	        if (canalAtual < 1) {
	            canalAtual = 5;
	        }
	    }
	    return canalAtual;
	}
	
	public boolean irParaCanal (int canal) {
		if (ligado && canal >= 1 && canal <= 5) {
            canalAtual = canal;
            return true;
            
        }
        return false;
    }
	

	public int getIdControle() {
		return idControle;
	}

	public String getModelo() {
		return modelo;
	}

	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public boolean isLigado() {
		return ligado;
	}
}