
public class Class_Object {

	public static void main(String[] args) {
		
		//Classes are the blueprints , Objects are the instance or behavior of a class .
		A obj = new A();     //object is constructed inside heap memory using a constructor A().
		obj.object();        //obj is just a reference to the object created in heap memory.
		
		
		// obj(variable) is stored in stack memory and it contains address of object (show()) in heap memory.
		
       /* if we assign obj = new A() again , another object will be created and obj now points to 
        * the new object in heap memory and previous objectv will be ready for garbage collection.
        */
	}

}


