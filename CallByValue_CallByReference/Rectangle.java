package CallByValue_CallByReference;

public class Rectangle {

	int length;
	
	public void modify(Rectangle obj,int x)
	{
		obj.length=x;
	}
	
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		r1.modify(r1, 20);
		
		System.out.println(r1.length);//Prints 20
		
		Rectangle r2 = new Rectangle();
		r2.modify(r2, 30);
		
		System.out.println(r2.length);
		System.out.println(r1.length);
		
	}
	
	
	
}
