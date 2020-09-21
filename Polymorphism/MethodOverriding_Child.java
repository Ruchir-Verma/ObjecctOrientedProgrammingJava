package Polymorphism;

public class MethodOverriding_Child extends MethodOverriding_Parent {
	
	
	@Override
	public void show()
	{
		System.out.print("Child class");
	}
	
	
	
	public static void main(String[] args)
	{
		MethodOverriding_Child obj = new MethodOverriding_Child();
		obj.show();
	}

}
