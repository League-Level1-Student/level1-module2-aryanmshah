package _03_smurf;

public class Runner {
	public static void main(String[] args) {
		
	
Smurf handy=new Smurf("handysmurf");
handy.eat();

Smurf Papa=new Smurf("Papa");
String s=Papa.getHatColor();
System.out.println(s);
String pont=Papa.isGirlOrBoy();
  System.out.println(pont);
Smurf fette=new Smurf("Fette");
String A=fette.getHatColor();
System.out.println(A);

String B=fette.isGirlOrBoy();
System.out.println(B);
	}
}
