package classi;

public class Rettangolo {
	private int base, altezza;

	public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	
	public double area() {
		return this.base * this.altezza;
	}
	public double perimetro(String s) {
		return (this.base+this.altezza)*2;
	}
public double perimetro(boolean casuale) {
	return this.base*2 + this.altezza*2;
}
}
//esempio di overload: vuol dire avere metodi con lo stesso nome, ma con parametri diversi (in questo caso perimetro compare 2 volte, ma una volta come stringa un'altra come boolean)