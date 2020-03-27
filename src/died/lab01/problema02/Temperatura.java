package died.lab01.problema02;

public class Temperatura {
	Double grados;
	Escala escala;
	
	
	public Temperatura(Double unNumero , Escala laEscala) {
		this.grados= unNumero;
		this.escala= laEscala;
	}
	public Temperatura() {
		this(0d, Escala.CELCIUS);
	}
	
	
	@Override
	public String toString() {
		switch(this.escala) {
		case CELCIUS:
			return  this.grados + " " + "C°";
		case FAHRENHEIT:
			return  this.grados + " " + "°F";
		default: return  this.grados + " " + "C°";
		}
		
	}
	
	public Double asCelcius() {
		switch(this.escala) {
		case CELCIUS:
			return this.grados;
		case FAHRENHEIT:
			return ((this.grados-32d) * (5d/9d) );
		default: return this.grados;
		}
		
	}
	
	public Double asFahrenheit() {
		switch(this.escala) {
		case CELCIUS:
			return ((this.grados * (9d/5d) ) +32);
		case FAHRENHEIT:
			return this.grados;
		default: return this.grados;
		}
		
	}
	
	public void aumentar(Temperatura temperatura) {
		switch(this.escala) {
		case CELCIUS:
			if(temperatura.asCelcius() >= 0d) this.grados+= temperatura.asCelcius();
			else this.grados-= temperatura.asCelcius();
			break;
		case FAHRENHEIT:
			if(temperatura.asFahrenheit() >= 0d) this.grados+=temperatura.asFahrenheit();
			else this.grados-= temperatura.asFahrenheit();
			break;
		default: return;
		}
		
		
	}
	
	
public void disminuir(Temperatura temperatura) {
		switch(this.escala) {
		case CELCIUS:
		if(temperatura.asCelcius() >= 0d) this.grados-= temperatura.asCelcius();
			else this.grados+= temperatura.asCelcius();
			break;
		case FAHRENHEIT:
			if(temperatura.asFahrenheit() >= 0d) this.grados-=temperatura.asFahrenheit();
			else this.grados+= temperatura.asFahrenheit();
			break;
		default: return;
		}
		
	}

public boolean esMayorQue(Temperatura otraTemp) {
	if(this.asCelcius()>otraTemp.asCelcius()) return true;
	else return false;
}


	
	
}
