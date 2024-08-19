package taximeter_java;

public class UnitsCalculator 
{
	private final int kmToMetersFactor = 1000;
	private final float mToCentenaresFactor = 0.01f;
	
	public float kmToMeters(float km)
	{
		float m = km * kmToMetersFactor;
		
		return m;
	}
	
	public float metersToCentenares(float m)
	{
		float centenares = m * mToCentenaresFactor;
		
		return centenares;
	}
}