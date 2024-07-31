class A{

	int x;
	private int y;

	void fun1(int p ){

		y = p;
	}
	void fun2(){

		System.out.println(y);
	}

}


class B extends A{

	int z ; 
	void fun3(){
		System.out.println("hii");
	}


}

class InheritTest{

	public static void main(String [] x){

		B ob = new B();
		ob.fun3();
		ob.fun1(5);
		ob.fun2(); 

	}
}