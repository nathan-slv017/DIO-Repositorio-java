package Estabelecimento;

import equipamentos.Impressora;
import equipamentos.impressora.Deskjet;

public class Fabrica {
	public static void main (String[] args) {
		
		Impressora impressora1 = new Deskjet();
		
		impressora1.Imprimindo();
		
	};
}
