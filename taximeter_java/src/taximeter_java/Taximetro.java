package taximeter_java;

public class Taximetro {
	private float metrosRecorridos = 0.0f;
	private float centenaresRecorridos = 0f;
	private int tarifaFinal = 0;
	private UnitsCalculator calculator = new UnitsCalculator();
	private Tarifa tarifas = new Tarifa();
	
	public float getCentenaresRecorridos() {
		return centenaresRecorridos;
	}

	public void setCentenaresRecorridos(float centenaresRecorridos) {
		this.centenaresRecorridos = centenaresRecorridos;
	}

	public float getMetrosRecorridos() {
		return metrosRecorridos;
	}

	public void setMetrosRecorridos(float metrosRecorridos) {
		this.metrosRecorridos = metrosRecorridos;
	}

	public int getTarifaFinal() {
		return tarifaFinal;
	}

	public void setTarifaFinal(int tarifaFinal) {
		this.tarifaFinal = tarifaFinal;
	}
	
	public void iniciarNewTrip()
	{
		setTarifaFinal(tarifas.getTarifaBase());
	}
	
	public void addTarifaByCentenar(float centenar)
	{
		int tarifaFinal = getTarifaFinal();
		tarifaFinal += tarifas.getTarifaBy100Meters() * centenar;
		setTarifaFinal(tarifaFinal);
	}
	
	public int calculateTarifaFinal(float kmRecorridos)
	{
		float m;
		float c;
		
		iniciarNewTrip();
		setMetrosRecorridos(calculator.kmToMeters(kmRecorridos));
		m = getMetrosRecorridos();
		setCentenaresRecorridos(calculator.metersToCentenares(m));
		c = getCentenaresRecorridos();
		addTarifaByCentenar(c);
		
		return (int) (getTarifaFinal());
	}
	
	public static void main(String[] args) {
		float km = 27.3f;
		String result;
		
		Taximetro taximetro = new Taximetro();
		
		result = Integer.toString(taximetro.calculateTarifaFinal(km));
		
		System.out.println("La tarifa final del viaje es: " + result);

	}

}