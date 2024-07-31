class One{
	
	public static void main(String [] a){
		System.out.println("hello");
		
	}
}


	
	
class Two extends One{

	public static void main(String [] a){

		System.out.println("Hii");
	}

}



class TestOverriding{

	public static void main(String [] x){
		Two ob = new Two();
		ob.main();
	}

}