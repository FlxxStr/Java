package variabili;

public class ProvaStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] lettere = {'c','i','a','o'};
String s1 = "";
for (int i = 0; i < lettere.length; i++) {
	s1 += lettere[i];
	
}
System.out.println(s1);

String s2 = new String (lettere);
System.out.println(s2);
char [] lettere2 = s2.toCharArray();
//la dicitura sopra serve far diventare una stringa un array
	System.out.println(lettere2);
	System.out.println(s1==s2);
	
	String s3 = "Ciao!";
	String s4 = "Ciao!";
	System.out.println(s3.equals(s4));
	System.out.println(s3==s4);
	}

}
