package Polymorphism;


//Poly - many , morphism -  behavior


//Two types : Method overloading,Constructor Overloading,Method Overriding

//Method overloading
public class Polymorphism {

	public void show()
	{
		System.out.println("Method 1");
	}
	
	
	public void show(String s)
	{
		System.out.print("Method 2 " +s);
	}
	
	public static void main(String[] args)
	{
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.show();
		polymorphism.show("Method Overloading");
	}
	
	
	
}
