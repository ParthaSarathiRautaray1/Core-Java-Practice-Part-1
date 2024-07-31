class AB{

	private int x ;
	private int y;
	
	 void f1(){

		 x = 5;
		 y = 10;
	}
	void f2(){

		System.out.println(x);
		System.out.println(y);
	}



}


class Test02{

	public static void main(String [] a){

		AB ob = new AB();
		ob.f1();
		ob.f2();
	}

}