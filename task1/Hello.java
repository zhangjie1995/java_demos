package hello;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, homework 1.");
		QuadPolynomial quadPolynomial = new QuadPolynomial();
		quadPolynomial.a = 3;
		quadPolynomial.b = 2;
		quadPolynomial.c = 5;
		
		System.out.println(quadPolynomial.result(3) == 92);
		
		MyArray myArray = new MyArray();
		myArray.add(2);
		myArray.add(3);
		myArray.add(1);
		myArray.add(-1);
		myArray.sort();
		System.out.print(myArray.output()[0]);
	}

}
