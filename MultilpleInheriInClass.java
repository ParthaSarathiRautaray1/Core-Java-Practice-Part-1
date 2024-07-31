class A{
	void fun1(){
		System.out.println("HEllo");
	}

}

class B{

	void fun2(){
		System.out.println("HI");
	}

	void fun1(int x){
		System.out.println("java");
	}
}
class C extends A,B{
	
	void fun1(){
		System.out.println("one");
	}
}

class MultilpleInheriInClass{
	public static void main(String [] a){

	C ob = new C();
		
	}
}