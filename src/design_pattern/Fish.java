package design_pattern;

public abstract class Fish {
	
EatBehavior eatery;
public void swim()
{
	System.out.println("Swims in clean water.");
}

public abstract void appearance();

public void eat()
{
	eatery.eat();
	
	//System.out.println("Confusion,whether a flesh eater or plant eater.");
}
}
