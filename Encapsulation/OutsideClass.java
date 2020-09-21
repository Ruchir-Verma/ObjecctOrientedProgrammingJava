package Encapsulation;

public class OutsideClass {
	
	public static void main(String[] args)
	{
		Encapsulation obj = new Encapsulation();
	    obj.setI(5);
	    int x = obj.getI();     //Using setters and getters to retrieve variable values.
	    System.out.print(x);
		
	}
	
	/*The whole idea behind encapsulation is to hide the implementation details from users. 
	 * If a data member is private it means it can only be accessed within the same class. 
	 * No outside class can access private data member (variable) of other class.Thats why they
	 * are also known as data hiding.Only can be accessed by public methods.
	 */

}
