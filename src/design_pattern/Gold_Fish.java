package design_pattern;

public class Gold_Fish extends Fish {
	
	public Gold_Fish()
	{
		eatery=new PlantEater();
	}
	
	public void appearance()
	{
		System.out.println("Gold Fish is very cute in looks....");
	}

}
