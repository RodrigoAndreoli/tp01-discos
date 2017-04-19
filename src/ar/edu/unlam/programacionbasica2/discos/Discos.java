package ar.edu.unlam.programacionbasica2.discos;

public class Discos {
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	
	public Discos(Double radioInt, Double radioExt)
	{
		if (radioExt > radioInt){
			this.radioExterior = radioExt;
			this.radioInterior = radioInt;
		}else if (radioExt < radioInt){
			this.radioExterior = radioInt;
			this.radioInterior = radioExt;
		}
		
		this.superficie = (Math.pow(Math.PI * this.radioExterior, 2)) - (Math.pow(Math.PI * this.radioInterior, 2));
		this.perimetroExterior = 2 * Math.PI * this.radioExterior;
		this.perimetroInterior = 2 * Math.PI * this.radioInterior;
	}
	
	public Double getSuperficie(){
		return this.superficie;
	}
	
	public Double getPerimetroInterior(){
		return this.perimetroInterior;
	}
	
	public Double getPerimetroExterior(){
		return this.perimetroExterior;
	}
}
