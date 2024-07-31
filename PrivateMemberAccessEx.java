class Demo{
	int x;
	private static int y;
	static int z = 50;
	static void fun1(){
		y = 10;
	}
	
	void printVal(){

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


	}

}


class PrivateMemberAccessEx{

	public static void main(String [] x ){

		Demo ob = new Demo();
		
		ob.fun1();
		ob.printVal();
	}


}