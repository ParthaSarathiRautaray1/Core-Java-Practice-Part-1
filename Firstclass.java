class Secondclass{
	static void fun1(){
	
		System.out.println(" second class funtion 1 is running");
	}

	static void fun2(){
		
		System.out.println("second class function 2 is running");
	}
}


class Firstclass{
	static void fun1(){
	
		System.out.println(" first class funtion 1 is running");
	}

	static void fun2(){
		
		System.out.println("first class function 2 is running");
	}


	public static void main(String [] args){

		fun1();
		fun2();
		// class is different , if want to access its member so classname . datamember 
		Secondclass.fun1();
		Firstclass.fun2();

	}
}