
public class Person {
	
	private String name;
	private String power;
	
	public String getname() {
		return name;
	}
	public String getpower() {
		return power;
	}

	public void setname(String name)
	{
	this.name=name;	
	}
	public void setpower(String power)
	{
	this.power=power;	
	}
	public String toString(){
		
		return name+" has "+power+" issues.";
	}
}
