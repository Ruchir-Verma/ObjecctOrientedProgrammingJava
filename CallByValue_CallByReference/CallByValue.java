package CallByValue_CallByReference;

public class CallByValue {
	

	
	public int modify(int data)
	{
		data=15;
		return data;
	}
	
	public static void main(String[] args)
	{
		CallByValue obj = new CallByValue();
		int x =10;    //Since x is primitive,it gets store in stack memory .
		obj.modify(x); // this will allocate new memory in stack,thus not changes the x value
		System.out.println(x);
		
		
		int y = obj.modify(x); //new memory is allocated in stack with reference y
		System.out.print(y);
		
		
	}
	
	
	
	
	

}
