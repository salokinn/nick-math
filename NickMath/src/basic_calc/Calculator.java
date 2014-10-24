//Nicholas Wagner - salokinn
//Camden Wagner - awesomemancam
//Date: 10/12/2014 through *
//This class will create a basic calculator that can add, subtract, multiply, and divide numbers.

package basic_calc;

//main class
public class Calculator {

	//main method
	public static void main(String[] args) {

		//Multiplication and Division
		int a = 2;
		int b = 4;
		int c = 8;
		System.out.println("ab = " + a*b);
		System.out.println("ac = " + a*c);
		System.out.println("bc = " + b*c);
		System.out.println("c/b = " + c/b);
		System.out.println("b/a = " + b/a);
		System.out.println("c/a = " + c/a);
		
		//Addition
		int z = a+b;
		int y = a+c;
		int x = c+b;
		System.out.println("a+b = " + z);
		System.out.println("a+c = " + y);
		System.out.println("b+c = " + x);
				
		//Subtraction
		int u = b-a;
		int v = c-a;
		int w = c-b;
		System.out.println("b-a = " + u);
		System.out.println("c-a = " + v);
		System.out.println("c-b = " + w);
		

	}

}

