package factoryMethod;

public class MarghritaRT extends Pizza {

	
	public MarghritaRT() {
		// TODO Auto-generated constructor stub
		setTime(7);
		setTemperature(550);
	}
	
	@Override
	public String prepare() {
		
		return "Descrição Pizza Marguerita:\nManjericão, massa média, muito queijo, molho temperado";
	}

}
