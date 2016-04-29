package factoryMethod;

public abstract class Pizza {

	private int time;
	private int temperature;
	
	public Pizza() {
		
	}
	
	public abstract String prepare();
	
	public String bake(){
		return "Assando Pizza em " + getTime()+" minutos, a "+getTemperature()+ " graus...";
	}
	
	public String cutSlices(){
		return "8 fatias";
	}
	
	public String box(){
		return "Pizza embalada =D"; 
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
}
