package died.lab01.problema01;

public class Recta {

	private Punto punto1;
	private Punto punto2;
	
	public Punto getPunto1() {
		return punto1;
	}
	public Punto getPunto2() {
		return punto2;
	}
	public Recta(Punto primero, Punto segundo) {
		punto1=primero;
		punto2=segundo;
	}
	public Recta() {
		this((new Punto(0f,0f)), (new Punto(1f,1f)));
		
	}
	
	public float pendiente() {
		return ((punto2.getY()-punto1.getY()) / (punto2.getX()-punto1.getX())  );
	}
	
	public boolean paralelas(Recta otraRecta) {
		return (this.pendiente() == otraRecta.pendiente());
	}
	
	public boolean equals(Object otraRecta) {
		if(otraRecta instanceof Recta) {
			if(!(((Recta)otraRecta).getPunto1().equals(this.punto1))){
				 Recta laRecta = new Recta(this.punto1 , ((Recta)otraRecta).getPunto1() );
				 return (laRecta.pendiente() == this.pendiente());
			}
			else if(!(((Recta)otraRecta).getPunto2().equals(this.punto2))){
				Recta laRecta = new Recta(this.punto2 , ((Recta)otraRecta).getPunto2() );
				 return (laRecta.pendiente() == this.pendiente());
			}
			else return true;
		}
		else return false;
	}
}

