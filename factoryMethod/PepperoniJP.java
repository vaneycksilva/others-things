package factoryMethod;

public class PepperoniJP extends Pizza {

	
	public PepperoniJP() {
		// TODO Auto-generated constructor stub
		setTemperature(500);
		setTime(10);
	}
	
	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return "Descrição Pizza Pepperoni: \n"+
				"Pepperoni, muito queijo, molho apimentado.";
	}

}
