package died.lab0.problema03;
import died.lab01.problema02.*;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int indice;
	
	
	
	public Registro(String ciudad) {
		this.ciudad= ciudad;
		this.historico = new Temperatura [30];
	}
	public Registro() {
		this("-");
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println( "TEMPERATURAS REGISTRADAS EN : " + this.ciudad + "\n" );
		for(int i=0 ; i<indice ; i++) {
			System.out.println(i+ " " + historico[i].toString() + "\n" );
		}
	}
	
	public void agregar(Temperatura t) {
		if(this.indice!=30) {
			historico[indice]=t;
			this.indice++;
		}
	}
	
	
	public double mediaAsCelcius() {
		double respuesta=0d;
		for(int i=0 ; i<indice ; i++) {
			respuesta+=(historico[i].asCelcius());
		}
		return (respuesta/ ((double)indice) );
		
	}
	
	public double mediaAsFahrenheit() {
		double respuesta=0d;
		for(int i=0 ; i<indice ; i++) {
			respuesta+=(historico[i].asFahrenheit());
		}
		return (respuesta/ ((double)indice) );
	}
	
	private Temperatura tempmax(int indice) {
		if(indice==0) return historico[indice];
		else {
			Temperatura maxAnterior= tempmax(indice-1);
			if (maxAnterior.esMayorQue(historico[indice])) {
				return maxAnterior;
			}
			else return historico[indice];
		}
	}
	public Temperatura maximo() {
		return(tempmax(indice-1));
	}
	
	
}
