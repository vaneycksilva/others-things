package factoryMethod;

public class MoussarelaJP  extends Pizza {

	public MoussarelaJP() {
		// TODO Auto-generated constructor stub
		setTemperature(450);
		setTime(8);
	}
	
	
	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return "Descrição Pizza Mussarela:\nPouco queijo";
	}

}
