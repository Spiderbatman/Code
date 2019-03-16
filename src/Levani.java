
public class Levani extends Student {
	private String name;
	
	public Levani(String name, int age) {
		super(age);
		this.name = name;
	}
	

	public void printInfo() {
		super.printInfo();
		System.out.print(" " + name);
		
	}
}
