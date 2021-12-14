package modulo4;

public class Racional {
private long numerador ;
private long denominador ;

public Racional(long num, long den) { 
	numerador = num;
	denominador = den;
	if (den < 0) {
		den = den * -1;
		num = num * -1;
		}
	else {
	};
	}	

public void getNumerador() {
   System.out.println(numerador);
}

public void getDenominador() {
	System.out.println(denominador);
}

public void setNumerador(long nume) {
	numerador = nume;
 }

 public void setDenominador(long deno) {
	denominador = deno;
	if (denominador < 0) {
		denominador = denominador * -1;
		numerador = numerador * -1;
		}
	else {
	};
 }



 @Override
 public String toString() {
   return String.format (numerador + "/" + denominador);
 }

 public static long mcd(long a, long b) {
	if (a<0) {
		a = a * -1;
	}
	
	if (b<0) {
		b = b * -1;
	}
	
	if (b>a) {
		long temp = a;
		a = b;
		b = temp;
	}
	
	 if(b==0)
		return a;
	else
		return mcd(b, a % b);
}
 

 public void lowest()
 {
     long common_factor = mcd(numerador,denominador);
     denominador = denominador/common_factor;
     numerador = numerador/common_factor;
 }
 
 static void lowest2(long s, long f)
 {
     long common_factor = mcd(s,f);
     f = f/common_factor;
     s = s/common_factor;
     System.out.print(f + "/" + s+ "\n");
 }
 
public void suma(long num2, long den2) {
lowest();
long den3 = mcd(denominador,den2);

den3 = (denominador*den2)/den3;

long num3 = (numerador)*(den3/denominador) + (num2)*(den3/den2);

lowest2(den3,num3);
}
 
public void multiplicacion(long num2, long den2) {
lowest();
long den3 = mcd(denominador,num2);
den3 = (denominador*num2)/den3;


long num3 = mcd(numerador,den2);
num3 = (numerador*den2)/num3;

lowest2(den3,num3);
}


}
