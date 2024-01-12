package variabili;

public class ProvaInteri {

	public static void main(String[] args) {
		//tipi primitivi interi
		byte b = 1;//8 bit(posso inserire numeri da -128 a +127)	
		short s = 2;//16 bit(
		int i = 7;//32 bit
		long l = 5;//64 bit
/*la conversione da elemento piccolo a grande
* è possibile e si chiama promotion, da grande a piccolo
* va forzata e si chiama casting */ 
		
		short nuovo = b;
		byte nuovoByte = (byte)s;
/*senza byte tra parentesi la dicitura non può essere corretta
 * perchè s(short) è più grande di b(byte), con la 
 * parentesi sto facendo una forzatura(casting) */
		  
		String numero = "5";
		System.out.println(numero+numero);
//in questo caso 5 è una stringa, non un numero
/*il + serve a concatenare, quindi in questo caso la somma 
 * di 5+5 sarà 55, se voglio trasformarlo in un numero dovrò
 * trasformarlo in un altro tipo di dato, fare come segue*/
		int aaa = Integer.parseInt(numero);
		byte bbb = Byte.parseByte(numero);
		System.out.println(aaa+aaa);
		System.out.println(bbb+bbb);
	}
	

}
