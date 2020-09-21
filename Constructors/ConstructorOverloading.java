package Constructors;

public class ConstructorOverloading {   //Multiple constructor in the same class but different definition

	
	public ConstructorOverloading()
	{
		System.out.print("This is Default Constructor");
	}
	
	public ConstructorOverloading(int i)
	{
		System.out.print("This is Parameterized constructor "+i);
	}
	
	
	
	public static void main(String[] args)
	{
		ConstructorOverloading obj2 = new ConstructorOverloading();
		System.out.println();
		ConstructorOverloading obj1= new ConstructorOverloading(5);
	}
	
	
	
}
