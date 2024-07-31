class Test {
	int x = 5;
	void fun1(){

		System.out.println(x);
	}
	
	 static void fun2(){

		System.out.println("helo");
	}
}


class Mahesh{
	
	public static void main (String [] x ){

		Test ob = new Test();
		ob.fun1();
		
		ob.fun2();
		Test.fun2();
	}

}