class Demo{
	int x;
	void fun1(){
		System.out.println("hii");
	}
	Demo(){
		System.out.println("java");
	}

}


class Test extends Demo{

	int y ;
	void fun2(){
		System.out.println("mca");
	}

	Test(){
		System.out.println("cs50");
	}
}


class Lab{

	public static void main(String [] x){
		Test ob = new Test();
	}
}