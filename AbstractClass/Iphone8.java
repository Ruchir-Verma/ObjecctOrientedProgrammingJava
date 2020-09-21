package AbstractClass;



/*Abstract method are methods that can only be declared and not defined.
 * If we have an abstract method in a class,class becomes abstract .
 * We cannot make object of abstract classes.
 */

public abstract class Iphone8 {
	
	
	public void music()
	{
		System.out.print("Music player is added");
	}
	
	abstract public void camera();
	abstract public void touch();

}
