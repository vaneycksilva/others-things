package factoryMethod;

public class MoussarelaRT  extends Pizza{

	
	public MoussarelaRT() {
		
		setTime(10);
		setTemperature(500);
		
	}
	
	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return "Descrição Pizza Mussarela:\nMuito queijo";
				
	}

}
