package taximeter_java;

public class Tarifa {
	private int tarifaBase = 4000;
	private int tarifaBy100Meters = 82;
	
	public int getTarifaBase() {
		return tarifaBase;
	}
	public void setTarifaBase(int tarifaBase) {
		this.tarifaBase = tarifaBase;
	}
	public int getTarifaBy100Meters() {
		return tarifaBy100Meters;
	}
	public void setTarifaBy100Meters(int tarifaBy100Meters) {
		this.tarifaBy100Meters = tarifaBy100Meters;
	}
	
}
