package died.lab01.problema01;

public class App {
	public static void main(String [] args) {
		Punto P1 = new Punto(1f,1f);
		Punto P2 = new Punto(2f,2f);
		Recta R1 = new Recta(P1,P2);
		Punto P3 = new Punto(3f,3f);
		Recta R2 = new Recta(P2,P3);
		System.out.println(R1.equals(R2));
	}
}
