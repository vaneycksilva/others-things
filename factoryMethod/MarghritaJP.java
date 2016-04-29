package factoryMethod;

public class MarghritaJP extends Pizza {

	
	public MarghritaJP() {
		
		setTemperature(500);
		setTime(10);
	}
	
	
	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return "Descrição Pizza de Marguerita:\n"
				+ "Manjericão, massa final, pouco queijo, molho temperado.";
	}

}
