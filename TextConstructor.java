class A {
	int x;
	int y;
	
	A(){
		x = 5;
		y = 10;
	}

}

class TextConstructor{
	public static void main(String []x){

		A ob = new A();
		System.out.println(ob.x);
		System.out.println(ob.y);
		
	}

}