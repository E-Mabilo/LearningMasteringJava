import java.util.ArrayList;
import java.util.Arrays;

public class DataStructuresVOne {
	
//	public static void main(String[] args) {
//		
//		//To declare an array you specify its type first. e.g int, string, short , etc.
//		//Arrays can e declared either way as shown below. Square brackets next to the type or the square brackets next to the variable name
//		
////		int[] numbers = new int[3]; 		//3 is the array size
//		int[] numbers = { 10, 20, 30 }; // declare and assign 
//		
//		//Insert the values of the array by using the index of the array 
//		numbers[0] = 10;
//		numbers[1] = 20;
//		numbers[2] = 30;
	
//		0,1,2 are index 
	
//		//to print the content of the array we use the java array class e.g Array.toString()
//		System.out.println(Arrays.toString(numbers));
//		
//		
//		
//	}
	
	public static void main(String[] args) {
		// dynamic arrays. Adding and removing items is possible 
		// create a new array object 
	
		/*int voidIt = 2;
		voidIt ++; 
		int save = 5;
		String names = "esther";
		
		Point pointA =new Point(10, 20); //x:10 y:20
		
		System.out.println(pointA);
		System.out.println(names);
		*/
//		int[] numbers = new int[3];
//		numbers[0] = 2;
//		numbers[1] = 4;
//		numbers[2] = 6;
//		
//		String[] names = {"esther", "prince", "thandi", "mami"};
//		
//		for (String name: names) {
//			System.out.println((name));
//		}
//		
//		//Forward display using for loop 
//		for (int i = 0; i < names.length; i++ ) {
//			System.out.println((names[i]));
//		}
//		
//		
//		//Reverse display using for loop 
//		for (int i = names.length - 1; i > 0; i -- ) {
//			System.out.println((names[i]));
//		}
////	
//		System.out.println(Arrays.toString(names));
//		int x, y, z;
//		x =-14;
//		z=-3; 
//		y=5;
//		int r =x%z;
//		System.out.println(r);
//		if(x>5 ){
//	System.out.println("true");
//	
//		}	else
//		{System.out.println("false");}
		
		
		// Objects/referencing a class name to create a new reference object called alex from the static class Person "NAME"
//		Person alex = new Person();
//		
//		Person alexer = alex ;
//		
//		System.out.println("alexer's name is:  " + alexer.name);
//		
//	}
	
	// Objects/referencing a class name to create a new reference object called alex from the static class Person "NAME"
//	static class Person{
//		String name = "me";
//		void me(String name){
//			this.name = name;
//		}
		int[] numbers = new int[3];
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
//		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i);
		}
	}
	
	
}
