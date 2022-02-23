package objetosDio;

public class RodarAplicacao {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setCapTanque(55);
		carro.setCor("Azul");
		carro.setModelo("fusca");
		
		System.out.println( carro.getCapTanque());
		System.out.println(carro.getCor());
		System.out.println(carro.getModelo());
		System.out.println(carro.valorTotalTanque(6.85));
		
		
		
		
		
	}

}
