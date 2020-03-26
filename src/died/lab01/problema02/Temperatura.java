package died.lab01.problema02;

public class Temperatura {
	Double grados;
	Escala escala;
	
	public Temperatura() {
		grados=0d;
		escala= Escala.CELCIUS;
	}
	public Temperatura(Double unNumero , Escala laEscala) {
		grados= unNumero;
		escala= laEscala;
	}
	
	
	@Override
	public String toString() {
		return  grados + " " + escala;
	}
	
	public Double asCelcius() {
		if(this.escala != Escala.CELCIUS) {
			return ((grados-32d) * (5d/9d) );
		}
		else return grados;
	}
	
	public Double asFahrenheit() {
		if(this.escala != Escala.FAHRENHEIT) {
			return ((grados * (9d/5d) ) +32);
		}
		else return grados;
	}
	
	public void aumentar(Temperatura temperatura) {
		
		if(escala==Escala.CELCIUS) {
			if(temperatura.asCelcius() >= 0d) grados+= temperatura.asCelcius();
			else grados-= temperatura.asCelcius();
		}
		else {
			if(temperatura.asFahrenheit() >= 0d) grados+=temperatura.asFahrenheit();
			else grados-= temperatura.asFahrenheit();
		}
	}
	
	
public void disminuir(Temperatura temperatura) {
		
		if(escala==Escala.CELCIUS) {
			if(temperatura.asCelcius() >= 0d) grados-= temperatura.asCelcius();
			else grados+= temperatura.asCelcius();
		}
		else {
			if(temperatura.asFahrenheit() >= 0d) grados-=temperatura.asFahrenheit();
			else grados+= temperatura.asFahrenheit();
		}
	}
	
	
}
