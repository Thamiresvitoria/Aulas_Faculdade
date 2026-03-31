package aula04;

public class AppControleTelevisaoObjeto {
		public static void main(String[] args) {
			
			ControleTelevisao ct1 = new ControleTelevisao(1, "LG");
			ControleTelevisao ct2 = new ControleTelevisao(2, "Sony");
			ControleTelevisao ct3 = new ControleTelevisao(3, "Samsung");
			ControleTelevisao ct4 = new ControleTelevisao(4, "SempToshiba");
			ControleTelevisao ct5 = new ControleTelevisao(5, "LG");

			mostrarControleTelevisao(ct1);
			mostrarControleTelevisao(ct2);
			mostrarControleTelevisao(ct3);
			mostrarControleTelevisao(ct4);
			mostrarControleTelevisao(ct5);
			
			ct1.ligarDesligar();
			ct4.ligarDesligar();
			ct5.ligarDesligar();
			mostrarControleTelevisao(ct1);
			mostrarControleTelevisao(ct4);
			mostrarControleTelevisao(ct5);
			
			int contLigados = 0;
			
			if (ct1.isLigado()) {
				contLigados++;
			}		
			if (ct2.isLigado()) {
				contLigados++;
			}
			if (ct3.isLigado()) {
				contLigados++;
			}
			if (ct4.isLigado()) {
				contLigados++;
			}
			if (ct5.isLigado()) {
				contLigados++;
			}
			
			System.out.println("Quantidade de controles ligados: " + contLigados);

			int contLG = 0;
			if (ct1.getModelo() == "LG") {
				contLG++;
			}
			if (ct2.getModelo() == "LG") {
				contLG++;
			}
			if (ct3.getModelo() == "LG") {
				contLG++;
			}
			if (ct4.getModelo() == "LG") {
				contLG++;
			}
			if (ct5.getModelo() == "LG") {
				contLG++;
			}
			
			System.out.println("Controles do modelo LG: " + contLG);
			
		}
		
		
		public static void mostrarControleTelevisao(ControleTelevisao controle) {
			System.out.println();
			System.out.println("\tIdentificador: " + controle.getIdControle());
			System.out.println("\tModelo.......: " + controle.getModelo());
			System.out.println("\tCanal atual..: " + controle.getCanalAtual());
			System.out.println("\tEstado.......: " + (controle.isLigado() ? "Ligado" : "Desligado") );
			System.out.println();			
		}

	}

