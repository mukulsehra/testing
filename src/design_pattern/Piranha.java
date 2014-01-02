package design_pattern;

public class Piranha extends Fish {
	
	public Piranha()
	{
		eatery=new FleshEater();
	}
	
	public void appearance()
	{
		System.out.println("Piranha looks horrible...");
	}

}
