package model;

public class Triangolo {
	
	private Punto a,b,c;
	private Segmento ab,bc,ac;
	
	
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento (a,b);
		this.bc = new Segmento (b,c);
		this.ac = new Segmento (a,c);
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
	public Punto getC() {
		return c;
	}
	public void setC(Punto c) {
		this.c = c;
	}
	
	public double perimetro() {
		return ab.lunghezza()+bc.lunghezza()+ac.lunghezza();
		}
		public double superficie() {
			double sp = perimetro()/2;
			return Math.sqrt(sp*
					(sp-ab.lunghezza())*
					(sp-bc.lunghezza())*
					(sp-ac.lunghezza()
							));
		}
		@Override
		public String toString() {
			return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + ab + ", bc=" + bc + ", ac=" + ac
					+ ", perimetro()=" + perimetro() + ", superficie()=" + superficie() + "]";
		}
	

}
