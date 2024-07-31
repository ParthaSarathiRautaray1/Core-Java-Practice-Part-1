class Pinu{

	int x; // instance member variable
	int y; // non static variable
	void fun1(){   // instance member fuction
	
		System.out.println("function 1 calling");
	}

	void fun2(){    // instance member fuction

		System.out.println("function 2 calling");
	}
}

class Objectpractice{

	public static void main(String [] args){

	//in class pinu 2 fuctions are non static so if we want to access this value we have to create object


	Pinu p1 = new Pinu();
	p1.x = 5;
	Pinu p2 = new Pinu();
	p2.x = 51;
	System.out.println(p1.x);
	System.out.println(p2.x);
	
	}
}