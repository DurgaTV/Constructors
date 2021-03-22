/**
 * 
 */
package org.cons;

/**
 * @author durga
 *
 */
public class Constructor {

	/*
	 * 
	 * public Constructor() { this("JAVA"); System.out.println("Default const...");
	 * }
	 * 
	 * public Constructor(int id) { this(3456.5678f); System.out.println(id); }
	 * 
	 * public Constructor(String name) { this(12); System.out.println(name); }
	 * 
	 * public Constructor(float sal) { System.out.println(sal); }
	 * 
	 * public static void main(String[] args) { Constructor c= new Constructor(); }
	 */
	
		
		final static int staticVar = 100; // static variable
		int instanceVar = 200; // instance variable
		
		public static void main(String [] args){
			
			int localVar = 300; // local variable
			
			// We can access static variables without creating an Object of a class
			System.out.println("Value of a Static Variable is "+staticVar);
			// We cannot access instance variables without creating an Object of a class
			//System.out.println("Value of a Instance Variable is "+instanceVar);
			// Local variables are limited to this method only
			System.out.println("Value of a Local Variable is "+localVar);
			
			// Creating an object of VariablesLocalInstanceClass
			Constructor var = new Constructor();
			//Updating the value of localVar
			System.out.println("Value of a Instance Variable is "+var.instanceVar);
			localVar = 301;
			System.out.println("Updated value of a Local Variable is "+localVar);
			//Updating the value of instanceVar using the object of VariableLocalInstanceClass
			var.instanceVar = 201;
			System.out.println("Updated value of a Instance Variable is "+var.instanceVar);
			/*We can modify the static variable by creating an instance of a class 
			but to avoid this we can set final keyword 
			I have added final keyword to the static variable... 
			If you uncomment the below two statements, you can see an error
			If you remove final keyword of static variable staticVar then you wont face any error*/
			/*var.staticVar = 101;
			System.out.println("Updated value of a Static Variable is "+staticVar);*/
		
		}

	}
	
	
	
	
	
	

