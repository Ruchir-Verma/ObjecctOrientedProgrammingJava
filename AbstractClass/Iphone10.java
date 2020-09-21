package AbstractClass;

public class Iphone10 extends Iphone9 {
	
	
	public void touch()
	{
		System.out.print("Phone has touch-facility now");
	}
	
	
	
	public static void main(String[] args)
	{
		Iphone10 obj = new Iphone10();
		obj.camera();
		obj.music();
		obj.touch();
	}

}
/*An abstract class is mostly used to provide a base for subclasses to 
 * extend and implement the abstract methods and override or use the
 *  implemented methods in abstract class.
 */