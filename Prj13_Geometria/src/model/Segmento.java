package model;

public class Segmento {
	
	private Punto a, b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	public double lunghezza() {
		double lunghezza = 0;
		
		lunghezza = Math.sqrt( 
				Math.pow(this.a.getX() - this.b.getX(),2)
				+
				Math.pow(this.a.getY() - this.b.getY(),2));
		
		return lunghezza;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza()=" + lunghezza() + "]";
	}

	
	
	
}
