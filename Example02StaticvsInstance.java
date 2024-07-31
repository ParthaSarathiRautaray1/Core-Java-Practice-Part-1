class Test{

	static void fun1(){
		System.out.println("A");
	}

	static void fun2(){
		System.out.println("B");
	}

}


class Example02StaticvsInstance{

	static void fun1(){
		System.out.println("C");
	}

	static void fun2(){
		System.out.println("D");
	}
	
	public static void main(String [] args){
		
		Test.fun1();
		fun2();
		Test.fun2();
		Example02StaticvsInstance.fun1();
	}

}