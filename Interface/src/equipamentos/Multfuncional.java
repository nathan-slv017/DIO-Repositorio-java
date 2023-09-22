package equipamentos;

public class Multfuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("COPIANDO VIA MULTIFUNCIONAL");
	};

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
	};

	@Override
	public void Imprimindo() {
		// TODO Auto-generated method stub
		System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
	};
	
};
