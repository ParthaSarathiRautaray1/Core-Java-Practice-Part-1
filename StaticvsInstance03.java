class Test {
	
	int x ;
	static int y = 5;

	void printDetail(){
		System.out.println(x);
		System.out.println(y);

	}
}

class StaticvsInstance03{

	public static void main(String [] x){

	Test.y = 15;
	
	Test ob = new Test();
	ob.x = 5;
	ob.y = 20;
	

	ob.printDetail();

	}
	

}
