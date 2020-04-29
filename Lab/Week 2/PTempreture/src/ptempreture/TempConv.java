package ptempreture;

import java.text.DecimalFormat;

public class TempConv {
	private double cel;
	private double fah;
	private double kel;
	
	public TempConv(double cel)
	{
		setCel(cel);
	}
	
	public void setCel(double cel)
	{
		this.cel = cel;
		fah = cel * 9/5 + 32;
		kel = cel + 273.15;
	}
	
	public void setFah(double fah)
	{
		this.fah = fah;
		cel = (fah - 32) * ((double)5/9);
		kel = (fah - 32) * ((double)5/9) + 273.15; 
	}
	
	public void setKel(double kel)
	{
		this.kel = kel;
		cel = kel - 273.15;
		fah = (kel - 273.15) * ((double)9/5) + 32;
	}
	
	public double getCel()
	{
		return cel;
	}
	
	public double getFah()
	{
		return fah;
	}
	
	public double getKel()
	{
		return kel;
	}
	
	@Override
	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat("0.00");
		return "celsius = " + formatter.format(cel) + " fahrenheit = " + formatter.format(fah) + " kelvin = " + formatter.format(kel);
	}
}
