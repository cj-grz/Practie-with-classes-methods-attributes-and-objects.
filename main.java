package modulo4;

public class main {

	public static void main(String[] args) {
	Racional r = new Racional(2,3);
	r.getNumerador();
	r.getDenominador();
	r.setNumerador(4);
	r.getNumerador();
	r.setDenominador(5);
	r.getNumerador();
	r.getDenominador();
	System.out.println(r);
	System.out.println(r.mcd(450,1000));
	r.suma(9,4);
	r.multiplicacion(3,9);
	}

}
