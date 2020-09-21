package Constructors;

public class Constructor {
	
	 //Every class has a constructor which is used to initialise the objects(allocate memory)
	// Constructor have the same name as the class and it is public.
	int i;
	int j;
	public Constructor()    //Default constructor
	{                       //Everytime when we create an object ,the space is given by the constructor.
		i=10;
		j=11;
		System.out.println(i+j);
	}
	
	
	




public static void main(String[] args)
{
	Constructor cons =new Constructor();
	
         System.out.print(cons.i+" "+cons.j);
}
}
