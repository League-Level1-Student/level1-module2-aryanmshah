
public class Runner {
public static void main(String[] args) {
	Person ponton=new Person();
	Person angre=new Person();
	Person ronchin=new Person();
	
	ponton.setname("ponton");
	angre.setname("angre");
	ronchin.setname("ronchin");
	ponton.setpower("mad");
	angre.setpower("physcho");
	ronchin.setpower("cry");
	System.out.println(ponton.toString());
	System.out.println(angre.toString());
	System.out.println(ronchin.toString());
}
}
